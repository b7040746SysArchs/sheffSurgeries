package com.csmith

class Prescription {

  String pharmacyName;
  int prescripNumber;
  String medicene;
  double totalCost;
  Date dateIssued;
  Boolean patientIsPaying;
  String daysSupply;
  Patient patient;
  Doctor doctor;

  String toString(){
    return medicene
  }

    static constraints = {
      pharmacyName blank:false, nullable: false
      prescripNumber blank:false, nullable: false, unique: true
      medicene blank:false, nullable: false
      totalCost blank:false, nullable: false, scale: 2
      dateIssued blank:false, nullable: false
      patientIsPaying blank:false, nullable: false
      daysSupply blank:false, nullable: false
      patient blank: true, nullable: true
      doctor blank: true, nullable: true
    }
}
