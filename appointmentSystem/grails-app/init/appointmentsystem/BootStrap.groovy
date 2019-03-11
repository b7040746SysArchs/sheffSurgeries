package com.csmith

class BootStrap {

    def init = { servletContext ->

      // Surgery Domain Class Instances

      def cityHealthCare = new Surgery(
        name: "City Health Care",
        address: "21 Marble Street Sheffield",
        postcode: "S11 5TY",
        telephone: "0114 555 555",
        numberOfPatients: 50,
        description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
        openingTime: "9:00am"
        ).save()

        def countryHealthCare = new Surgery(
          name: "Country Health Care",
          address: "25 Country Road Doncaster",
          postcode: "S12 5RY",
          telephone: "0114 555 666",
          numberOfPatients: 40,
          description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
          openingTime: "9:30am"
          ).save()

          // Doctor Domain Class Instances

        def drSarahMacdonald = new Doctor(
          fullName: "Dr Sarah Macdonald",
          qualification: "MBChB(Sheffield)",
          position: "GP, Surgeon",
          doctorEmail: "s.macdonald@myemail.com",
          password: "secret222",
          doctorOffice: "D-9888",
          doctorPhone: "0114 230 222 5555",
          bio: "orem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
          ).save()

        def drBrianDoctor = new Doctor(
          fullName: "Dr Brian Doctor",
          qualification: "MBhuSS(Sheffield Hallam)",
          position: "GP, Surgeon",
          doctorEmail: "B.Doctor@myemail.com",
          password: "superSecret222",
          doctorOffice: "D-9889",
          doctorPhone: "0114 230 222 2552",
          bio: "orem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
          ).save()

          // Patient Domain Class Instances

        def patTomRivers = new Patient(
          patientName: "Tom Rivers",
          patientAddress: "2 One Way Street, Eckington",
          patientResidence: "Sheffield",
          patientDob: new Date("09/09/1997"),
          patientID: "E667SG",
          dateRegistered: new Date("05/11/1998"),
          patientPhone: "0114 222 4444"
          ).save()

          def patJackReacher = new Patient(
            patientName: "Jack Reacher",
            patientAddress: "14 Two Way Street, Eckington",
            patientResidence: "Sheffield",
            patientDob: new Date("09/09/1980"),
            patientID: "E337SG",
            dateRegistered: new Date("05/11/1985"),
            patientPhone: "0114 222 5555"
            ).save()

          // Receptionist Domain Class Instances
        def recepRobKingston = new Receptionist(
          recepName: "Rob Kingston",
          recepEmail: "r.kingston@email.com",
          recepUsername: "rking",
          recepPassword: "secret2019",
          recepPhone: "0114 222 4445"
          ).save()

          def recepLaurenEdwards = new Receptionist(
            recepName: "Lauren Edwards",
            recepEmail: "l.edwards@email.com",
            recepUsername: "ledwards",
            recepPassword: "password123",
            recepPhone: "0114 222 4447"
            ).save()

          // Nurse Domain Class Instances

          def nurseSusanPeters = new Nurse(
            nurseName: "Susan Peters",
            qualifications: "Registered General Nurse",
            nurseEmail: "s.peters@myemail.com",
            nurseOffice: "B-455",
            nursePhone: "0114 222 4433"
            ).save()

            def nurseGeorgeTimmins = new Nurse(
              nurseName: "George Timmins",
              qualifications: "Registered General Nurse",
              nurseEmail: "G.Timmins@myemail.com",
              nurseOffice: "B-422",
              nursePhone: "0114 222 4422"
              ).save()

          //  Appointment Domain Class Instances

          def appointment1 = new Appointment(
            appDate: new Date("07/08/2019"),
            appTime: "3:00pm",
            appDuration: 30,
            roomNumber: "A-1111",
            patient: patJackReacher
            ).save()

            def appointment2 = new Appointment(
              appDate: new Date("11/08/2019"),
              appTime: "1:30pm",
              appDuration: 45,
              roomNumber: "A-2222",
              patient: patTomRivers
              ).save()

            // Prescription Domain Class Instances

            def prescription1 = new Prescription(
              pharmacyName: "City Health Care",
              prescripNumber: 577886,
              medicene: "Paracetomol",
              totalCost: 5.50,
              dateIssued: new Date("25/05/2019"),
              patientIsPaying: false
              ).save()

              def prescription2 = new Prescription(
                pharmacyName: "Country Health Care",
                prescripNumber: 575586,
                medicene: "Antibiotecs",
                totalCost: 9.55,
                dateIssued: new Date("20/05/2019"),
                patientIsPaying: true
                ).save()


                cityHealthCare.addToNurses(nurseGeorgeTimmins)
                cityHealthCare.addToDoctors(drBrianDoctor)
                cityHealthCare.addToReceptionists(recepRobKingston)
                cityHealthCare.addToPatients(patJackReacher)
                cityHealthCare.addToAppointments(appointment1)

    }
    def destroy = {
    }
}
