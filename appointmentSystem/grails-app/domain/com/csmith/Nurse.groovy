package com.csmith

class Nurse {

  String nurseName;
  String qualifications;
  String nurseEmail;
  String nurseOffice;
  String nursePhone;
  Surgery surgery;

  String toString(){
    return nurseName
  }

  static hasMany = [doctors: Doctor]

<<<<<<< HEAD
  static belongsTo = [Surgery]
=======
  static belongsTo = [Doctor, Surgery]
>>>>>>> f0ee6bb8f7e9f3bca0fdac8849548e5e1d1a3169

    static constraints = {
      nurseName blank:false, nullable: false
      qualifications blank:false, nullable: false
      nurseEmail blank:false, nullable: false, unique: true
      nurseOffice blank:false, nullable: false
      nurseOffice blank:false, nullable: false
    }
}
