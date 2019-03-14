package com.csmith

class PrescriptionController {

    def scaffold = Prescription;

    def search(){

    }

    def advSearch(){
      
    }

    def results(String name){
      def prescriptions=Prescription.where{
        medicene=~name
      }list()
      return[prescriptions:prescriptions,
      term:params.name,
      totalPrescriptions: Prescription.count()]
    }

    def advResults(){
      def prescriptionProps = Prescription.metaClass.properties*.name
      def prescriptions = Prescription.withCriteria{
        "${params.queryType}"{
          params.each{field, value ->
            if(prescriptionProps.grep(field)&& value ){
              ilike(field,value)
            }
          }
        }
      }
      return[prescriptions:prescriptions]
    }
}
