package com.csmith

class Appointment {

  Date appDate;
  String appTime;
  int appDuration;
  String roomNumber;

    static constraints = {
      appDate blank:false, nullable: false
      appTime blank:false, nullable: false
      appDuration blank:false, nullable: false, max:60
      roomNumber blank:false, nullable: false
    }
}
