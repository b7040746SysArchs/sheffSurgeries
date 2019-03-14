package com.csmith

class DoctorController {

    def scaffold = Doctor;

    def login(){

    }

    def validate(){
      def user = Doctor.findByDoctorEmail(params.username)

      if(user && user.password == params.password){
        session.user = user
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

}
