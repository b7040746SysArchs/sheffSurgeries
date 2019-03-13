package com.csmith

class Appointment {

  Date appDate;
  String appTime;
  int appDuration;
  String roomNumber;
  Doctor doctor;
  Surgery surgery;
  Patient patient;

  String toString(){
    return appDate;
  }

    static constraints = {
      appDate blank:false, nullable: false
      appTime blank:false, nullable: false
      appDuration blank:false, nullable: false, max:60
      roomNumber blank:false, nullable: false
      doctor blank: true, nullable: true
      surgery blank: true, nullable: true
      patient blank: true, nullable: true
    }
}
