package com.csmith

class Receptionist {
  String recepName;
  String recepEmail;
  String recepUsername;
  String recepPassword;
  String recepPhone;
  Surgery surgery;

  String toString(){
    return recepName
  }

    static constraints = {
      recepName blank:false, nullable: false
      recepEmail blank:false, nullable: false, unique: true, email: true
      recepUsername blank:false, nullable: false, unique: true
      recepPassword blank:false, nullable: false, password: true
      recepPhone blank:false, nullable: false
      surgery blank:true, nullable: true
    }
}
