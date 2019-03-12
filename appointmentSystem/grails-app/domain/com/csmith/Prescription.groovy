package com.csmith

class Prescription {

  String pharmacyName;
  int prescripNumber;
  String medicene;
  double totalCost;
  Date dateIssued;
  Boolean patientIsPaying;
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
    }
}
