package com.csmith

class Patient {

  String patientName;
  String patientAddress;
  String patientResidence;
  Date patientDob;
  String patientID;
  Date dateRegistered;
  String patientPhone;

  String toString(){
    return patientName
  }

  static hasMany = [doctors: Doctor, surgeries: Surgery, prescriptions: Prescription]

  static belongsTo = [Surgery, Doctor]

    static constraints = {

      patientName blank:false, nullable: false
      patientAddress blank:false, nullable: false
      patientResidence blank:false, nullable: false
      patientDob blank:false, nullable: false
      patientID blank:false, nullable: false, unique: true
      dateRegistered blank:false, nullable: false
      patientPhone blank:false, nullable: false
    }
}
