package com.csmith

class Doctor {

  String fullName;
  String qualification;
  String position;
  String doctorEmail;
  String password;
  String doctorOffice;
  String doctorPhone;
  String bio;
  Surgery surgery;

  String toString(){
    return fullName
  }

  static hasMany=[appointments: Appointment, nurses: Nurse, patients: Patient]

    static constraints = {
      fullName blank:false, nullable: false
      qualification blank:false, nullable: false
      position blank:false, nullable: false
      doctorEmail blank:false, nullable: false, email: true, unique: true
      password blank:false, nullable: false, password: true
      doctorOffice blank:false, nullable: false
      doctorPhone blank:false, nullable: false
      bio nullable: false, maxSize: 5000, widget: "textarea"
    }
}
