package com.csmith

class PrescriptionController {

    def scaffold = Prescription;

    def search(){

    }

    def advSearch(){

    }

    def results(String mediceneName){
      def prescriptions=Prescription.where{
        medicene=~mediceneName
      }list()
      return[prescriptions:prescriptions,
      term:params.mediceneName,
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
