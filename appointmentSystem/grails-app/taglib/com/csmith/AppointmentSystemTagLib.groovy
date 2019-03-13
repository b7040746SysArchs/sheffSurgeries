package com.csmith

class AppointmentSystemTagLib {
    //static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

    def loginToggle = {
        out << "<div style='margin: 15px 0 40px;'>"
        if (request.getSession(false) && session.user){
          if(session.userType == "doctor"){
            out << "<span style='float:left; color: white; margin-left: 15px'>"
            out << "Welcome ${session.user}."
            out << "</span><span style='float:right;margin-right:15px'>"
            out << "<a href='${createLink(controller:'doctor', action:'logout')}'>"
            out << "Logout </a></span>"
          }else if(session.userType == "recep"){
            out << "<span style='float:left; color: white; margin-left:15px'>"
            out << "Welcome ${session.user}."
            out << "</span><span style='float:right;margin-right:15px; color'>"
            out << "<a class='badge badge-warning' href='${createLink(controller:'receptionist', action:'logout')}'>"
            out << "Logout </a></span>"
          }
    }
          out << "</div><br/>"
}
}

/*

def loginToggle = {
    out << "<div style='margin: 15px 0 40px;'>"
    if (request.getSession(false) && session.user){
      if(session.userType == "doctor"){
        out << "<span style='float:left; margin-left: 15px'>"
        out << "Welcome ${session.user}."
        out << "</span><span style='float:right;margin-right:15px'>"
        out << "<a href='${createLink(controller:'doctor', action:'logout')}'>"
        out << "Logout </a></span>"
      }else if(session.userType == "recep"){
        out << "<span style='float:left; margin-left: 15px'>"
        out << "Welcome ${session.user}."
        out << "</span><span style='float:right;margin-right:15px'>"
        out << "<a href='${createLink(controller:'receptionist', action:'logout')}'>"
        out << "Logout </a></span>"
      }
}
      out << "</div><br/>"
}

*/
