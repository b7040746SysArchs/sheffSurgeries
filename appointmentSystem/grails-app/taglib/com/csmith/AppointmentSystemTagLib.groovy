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
    out << '<div class="container" id="nextAppointmentContainer">'
    out << '<div class="panel panel-default">'
    out << '<div class="panel-heading" id="drNextAppointment" style="font-weight:bold;">YOUR NEXT APPOINTMENT</div>'
    out << '<div class="panel-body">'

    out << "<tr><p>"
    out << "<span id='tblData'><strong>Time: </strong>${app_time}</span>"
    out << "<span id='tblData'><strong>Date: </strong>${app_date}</span>"
    out << "<span id='tblData'><strong>Length: </strong>${app_duration} Minutes</span>"
    out << "<span id='tblData'><strong>Room Number: </strong>${room_number}</span>"
    out << "</p></tr>"
    out << "</div>"
    out << "</div>"
    out << "</div>"
  }
}

}
