package com.csmith

class Nurse {

  String nurseName;
  String qualifications;
  String nurseEmail;
  String nurseOffice;
  String nursePhone;

    static constraints = {
      nurseName blank:false, nullable: false
      qualifications blank:false, nullable: false
      nurseEmail blank:false, nullable: false, unique: true
      nurseOffice blank:false, nullable: false
      nurseOffice blank:false, nullable: false
    }
}
