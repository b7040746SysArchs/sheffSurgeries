package com.csmith

class ReceptionistController {

    def scaffold = Receptionist;

    def login(){

    }

    def validate(){
      def user = Receptionist.findByRecepUsername(params.username)

      if(user && user.recepPassword == params.password){
        session.user = user
        session.userType = "recep"

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
