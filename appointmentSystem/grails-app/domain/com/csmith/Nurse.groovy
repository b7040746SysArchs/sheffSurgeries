package com.csmith

class Nurse {

  String nurseName;
  String qualifications;
  String nurseEmail;
  String nurseOffice;
  String nursePhone;
  Surgery surgery;

  static hasMany = [doctors: Doctor]

  static belongsTo = Doctor

  String toString(){
    return nurseName
  }

    static constraints = {
      nurseName blank:false, nullable: false
      qualifications blank:false, nullable: false
      nurseEmail blank:false, nullable: false, unique: true
      nurseOffice blank:false, nullable: false
      nurseOffice blank:false, nullable: false
      surgery blank: true, nullable: true
    }
}
