package com.csmith

class Surgery {

  String name;
  String address;
  String postcode;
  String telephone;
  int numberOfPatients;
  String description;
  String openingTime;

  String toString(){
    return name
  }

  static hasMany=[nurses: Nurse, doctors: Doctor, receptionists: Receptionist, patients: Patient, appointments: Appointment]


    static constraints = {
      name blank:false, nullable: false, unique: true
      address blank:false, nullable: false
      postcode blank:false, nullable: false
      telephone blank:false, nullable: false
      numberOfPatients blank:false, nullable: false, max:50
      description nullable: false, maxSize: 5000, widget: "textarea"
      openingTime blank:false, nullable: false
    }
}
