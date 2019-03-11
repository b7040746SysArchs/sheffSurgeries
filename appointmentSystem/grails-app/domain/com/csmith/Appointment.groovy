package com.csmith

class Appointment {

  Date appDate;
  String appTime;
  int appDuration;
  String roomNumber;
  Patient patient;

  static hasMany = [surgeries: Surgery]

    static constraints = {
      appDate blank:false, nullable: false
      appTime blank:false, nullable: false
      appDuration blank:false, nullable: false, max:60
      roomNumber blank:false, nullable: false
      patient blank: false, nullable: false
    }
}
