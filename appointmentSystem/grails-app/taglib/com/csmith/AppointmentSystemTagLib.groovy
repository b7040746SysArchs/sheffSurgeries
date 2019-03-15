package com.csmith
import groovy.sql.Sql
import grails.util.Environment

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

/*
nextAppointment tag is embedded within main.gsp and injected into the header

PURPOSE - Show the doctor what their next appointment is
*/

def nextAppointment = {
  if(session.userType == "doctor"){

 /* We use a switch case on the current Environment. Depending on the environment, we store the uppercase version of the string
  in a variable which is placed inside our sql query. We do this to ensure we are using the database which corresponds the
  correct environment
 */
    String environment;

    switch(Environment.current) {
      case Environment.DEVELOPMENT:
        environment = "Development"
      break
      case Environment.TEST:
        environment = "Test"
      break
      case Environment.PRODUCTION:
        environment = "Production"
      break
    }

    /* Preliminary setup of a new Sql instance, containing DB URL, DB Username, DB Password and JDBC Driver */
    def sql = Sql.newInstance("jdbc:mysql://localhost:3306/Grails${environment}", "GrailsAdmin", "password", "com.mysql.jdbc.Driver")
    /* The actual query - we want to find the most recent appointment. We filter using SQL WHERE with session.doctorEmail
    This is a session variable which we assign from params.username in DoctorController when the Doctor logins in */
    String sqlQuery = "SELECT * FROM appointment WHERE doctor_id = (SELECT doctor_id FROM doctor WHERE doctor_email = '${session.doctorEmail}')  ORDER BY app_date LIMIT 1"
    def appointmentList = sql.rows(sqlQuery)
    /*
    sql.rows() returns an array of arrays, so we need to drill down into the first array at index [0] then grab the data we need
    */
    if( !appointmentList.isEmpty()){
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
    }else{
      out << '<div class="container" id="nextAppointmentContainer">'
      out << '<div class="panel panel-default">'
      out << '<div class="panel-heading" id="drNextAppointment" style="font-weight:bold;">YOU HAVE NO APPOINTMENTS</div>'
      out << '</div></div>'
    }

  }
}

}
