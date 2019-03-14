package com.csmith
import groovy.sql.Sql

class AppointmentSystemTagLib {
    //static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

    def loginToggle = {
        out << "<div style='margin: 15px 0 40px;'>"
        if (request.getSession(false) && session.user){
          if(session.userType == "doctor"){
            out << "<span style='float:left; color: white; margin-left: 15px'>"
            out << "Welcome ${session.user}.  "
            out << "</span><span style='float:right;margin-right:15px'>"
            out << "<a class='badge badge-warning' href='${createLink(controller:'doctor', action:'logout')}'>"
            out << "Logout </a></span>"
          }else if(session.userType == "recep"){
            out << "<span style='float:left; color: white; margin-left:15px'>"
            out << "Welcome ${session.user}.  "
            out << "</span><span style='float:right;margin-right:15px; color'>"
            out << "<a class='badge badge-warning' href='${createLink(controller:'receptionist', action:'logout')}'>"
            out << "Logout </a></span>"
          }
    }
          out << "</div><br/>"
}

def nextAppointment = {
  if(session.userType == "doctor"){
    def sql = Sql.newInstance("jdbc:mysql://localhost:3306/GrailsDevelopment", "GrailsAdmin", "password", "com.mysql.jdbc.Driver")
    String sqlQuery = "SELECT * FROM appointment ORDER BY app_date LIMIT 1"
    def appointmentList = sql.rows(sqlQuery)

    def app_date = appointmentList[0][4]
    def room_number = appointmentList[0][8]
    def app_duration = appointmentList[0][5]
    def app_time = appointmentList[0][6]

    out << "<h1>${app_time}</h1>"
    out << "<p>${app_date}</p>"
    out << "<p>${app_duration}</p>"
    out << "<p>${room_number}</p>"
  }
}

}

/*
def nextAppointment = {
  if(session.userType == "doctor"){
    def sql = Sql.newInstance("jdbc:mysql://localhost:3306/GrailsDevelopment", "GrailsAdmin", "password", "com.mysql.jdbc.Driver")
    session.appointmentResults = sql.executeQuery("SELECT * FROM appointment ORDER BY app_date LIMIT 1")
    out << "<h1>${session.appointmentResults}</h1>"
  }
}

*/
