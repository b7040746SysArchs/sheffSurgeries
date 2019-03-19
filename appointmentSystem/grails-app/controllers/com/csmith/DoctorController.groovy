package com.csmith

import groovy.sql.Sql
import grails.util.Environment

class DoctorController {

    def scaffold = Doctor;

    def login(){

    }

    def validate(){
      def user = Doctor.findByDoctorEmail(params.username)

      if(user && user.password == params.password){
        session.user = user
        session.doctorEmail = params.username
        session.userType = "doctor"

        render view:'home'
      }else{
        flash.message ='Invalid Username or Password'
        render view:'login'
      }
    }

    def logout(){
      session.user = null
      session.userType = null
      redirect(url:'/')
    }


    def doctorDetailsJSON(){

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
      String sqlQuery = "SELECT full_name, doctor_email, doctor_phone FROM doctor"
      def doctorContactDetails = sql.rows(sqlQuery)
      if( !doctorContactDetails.isEmpty() ){
        render(contentType: "text/json"){
          doctorsDetails{
            doctors(doctorContactDetails)
          }
        }
      }

    }

}
