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

def test = {
  out << <g:javascript>window.alert("Hi")</g:javascript>
}

def dateAndTime = {
  out << '<div id="dateAndTime">'
    out << '<h1 id="woo"></h1>'
    out << '<h1 id="foo"></h1>'
    out <<'<script src="app.js"></script>'
    out <<'<script>'
        out <<'let h1 = document.getElementById("woo");'
        out <<'let h2 = document.getElementById("foo");'

        out <<'let now, m, h, s, amPm'

        out <<'getTime = () => {'
            out <<'now = new Date()'
            out <<'m = now.getMinutes()'
            out <<'h = now.getHours()'
            out <<'s = now.getSeconds()'

            out <<'if(h < 12){'
                out <<'amPm = "AM"'
            out <<'}else{'
                out <<'amPm = "PM"'
            out <<'}'

            out <<'h1.innerHTML = `${h}:${m}:${s} ${amPm}`'
      out <<'}'
        out <<'getTime()'
        out <<'setInterval(() => {'
            out <<'getTime()'
        out <<'}, 1000);'
    out <<'</script>'
    out <<'</div>'
}


}
