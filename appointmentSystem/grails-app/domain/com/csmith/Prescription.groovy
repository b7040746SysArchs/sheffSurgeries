package com.csmith

class Prescription {

  String pharmacyName;
  int prescripNumber;
  String medicene;
  String totalCost;
  Date dateIssued;
  Boolean patientIsPaying;

    static constraints = {
      pharmacyName blank:false, nullable: false
      prescripNumber blank:false, nullable: false, unique: true
      medicene blank:false, nullable: false
      totalCost blank:false, nullable: false
      dateIssued blank:false, nullable: false
      patientIsPaying blank:false, nullable: false
    }
}
