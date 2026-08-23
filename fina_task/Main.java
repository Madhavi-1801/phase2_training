package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;



abstract class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

   
    public abstract void displayDetails();
}


class Patient extends Person {
    private String disease;
    private String bloodGroup;

    public Patient(int id, String name, int age,
                   String disease, String bloodGroup) {
        super(id, name, age);
        this.disease = disease;
        this.bloodGroup = bloodGroup;
    }

    public String getDisease() {
        return disease;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

  
    public void displayDetails() {
        System.out.println(
            "Patient ID: " + getId() +
            ", Name: " + getName() +
            ", Age: " + getAge() +
            ", Disease: " + disease +
            ", Blood Group: " + bloodGroup
        );
    }
}


class Doctor extends Person {
    private String speciality;
    private int experience;
    private double fee;

    public Doctor(int id, String name, int age,
                   String speciality, int experience, double fee) {
        super(id, name, age);
        this.speciality = speciality;
        this.experience = experience;
        this.fee = fee;
    }

    public String getSpeciality() {
        return speciality;
    }

    public int getExperience() {
        return experience;
    }

    public double getFee() {
        return fee;
    }

    
    public void displayDetails() {
        System.out.println(
            "Doctor ID: " + getId() +
            ", Name: " + getName() +
            ", Age: " + getAge() +
            ", Speciality: " + speciality +
            ", Experience: " + experience + " years" +
            ", Fee: Rs." + fee
        );
    }
}


class Department {
    private int deptId;
    private String deptName;

    public Department(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public int getDeptId() {
        return deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void displayDetails() {
        System.out.println(
            "Department ID: " + deptId +
            ", Department Name: " + deptName
        );
    }
}


class Appointment {
    private int appointmentId;
    private Patient patient;
    private Doctor doctor;
    private String date;
    private String time;
    private String status;

    public Appointment(int appointmentId,
                       Patient patient,
                       Doctor doctor,
                       String date,
                       String time) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
        this.status = "Booked";
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getStatus() {
        return status;
    }

    public void cancelAppointment() {
        status = "Cancelled";
    }

    public void displayDetails() {
        System.out.println(
            "Appointment ID: " + appointmentId +
            ", Patient: " + patient.getName() +
            ", Doctor: " + doctor.getName() +
            ", Date: " + date +
            ", Time: " + time +
            ", Status: " + status
        );
    }
}



class PatientNotFoundException extends Exception {
    public PatientNotFoundException(String message) {
        super(message);
    }
}

class DoctorNotFoundException extends Exception {
    public DoctorNotFoundException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Hospital {
    private ArrayList<Patient> patients = new ArrayList<>();
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private ArrayList<Department> departments = new ArrayList<>();
    private LinkedList<Appointment> appointments = new LinkedList<>();

  
    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient added successfully.");
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor added successfully.");
    }

  
    public void addDepartment(Department department) {
        departments.add(department);
        System.out.println("Department added successfully.");
    }


    public Patient findPatient(int id)
            throws PatientNotFoundException {

        for (Patient patient : patients) {
            if (patient.getId() == id) {
                return patient;
            }
        }

        throw new PatientNotFoundException(
            "Patient with ID " + id + " not found."
        );
    }

   
   
    public Doctor findDoctor(int id)
            throws DoctorNotFoundException {

        for (Doctor doctor : doctors) {
            if (doctor.getId() == id) {
                return doctor;
            }
        }

        throw new DoctorNotFoundException(
            "Doctor with ID " + id + " not found."
        );
    }

    
    public void searchPatient(int id) {

        try {
            Patient patient = findPatient(id);

            System.out.println("\n--- Patient Found ---");
            patient.displayDetails();

        } catch (PatientNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public void searchDoctor(int id) {

        try {
            Doctor doctor = findDoctor(id);

            System.out.println("\n--- Doctor Found ---");
            doctor.displayDetails();

        } catch (DoctorNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

 
    public void searchDoctorBySpeciality(String speciality) {

        boolean found = false;

        System.out.println("\n--- Doctors in " + speciality + " ---");

        for (Doctor doctor : doctors) {

            if (doctor.getSpeciality()
                    .equalsIgnoreCase(speciality)) {

                doctor.displayDetails();
                found = true;
            }
        }

        if (!found) {
            System.out.println(
                "No doctor found for speciality: " + speciality
            );
        }
    }

 
    public void removePatient(int id) {

        try {
            Patient patient = findPatient(id);

            patients.remove(patient);

            System.out.println(
                "Patient removed successfully."
            );

        } catch (PatientNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public void removeDoctor(int id) {

        try {
            Doctor doctor = findDoctor(id);

            doctors.remove(doctor);

            System.out.println(
                "Doctor removed successfully."
            );

        } catch (DoctorNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void displayPatients() {

        System.out.println("\n========== PATIENTS ==========");

        if (patients.isEmpty()) {
            System.out.println("No patients available.");
            return;
        }

        for (Patient patient : patients) {
            patient.displayDetails();
        }
    }


    public void displayDoctors() {

        System.out.println("\n========== DOCTORS ==========");

        if (doctors.isEmpty()) {
            System.out.println("No doctors available.");
            return;
        }

        for (Doctor doctor : doctors) {
            doctor.displayDetails();
        }
    }

  
    public void displayDepartments() {

        System.out.println(
            "\n========== DEPARTMENTS =========="
        );

        if (departments.isEmpty()) {
            System.out.println("No departments available.");
            return;
        }

        for (Department department : departments) {
            department.displayDetails();
        }
    }

  
    public void bookAppointment(
            int appointmentId,
            int patientId,
            int doctorId,
            String date,
            String time) {

        try {

            Patient patient = findPatient(patientId);
            Doctor doctor = findDoctor(doctorId);

            Appointment appointment =
                new Appointment(
                    appointmentId,
                    patient,
                    doctor,
                    date,
                    time
                );

            appointments.add(appointment);

            System.out.println(
                "Appointment booked successfully."
            );

        } catch (PatientNotFoundException |
                 DoctorNotFoundException e) {

            System.out.println(
                "Error: " + e.getMessage()
            );
        }
    }


    public void cancelAppointment(int appointmentId) {

        for (Appointment appointment : appointments) {

            if (appointment.getAppointmentId()
                    == appointmentId) {

                appointment.cancelAppointment();

                System.out.println(
                    "Appointment cancelled successfully."
                );

                return;
            }
        }

        System.out.println(
            "Appointment with ID " +
            appointmentId +
            " not found."
        );
    }

  
    public void displayAppointments() {

        System.out.println(
            "\n========== APPOINTMENTS =========="
        );

        if (appointments.isEmpty()) {
            System.out.println(
                "No appointments available."
            );
            return;
        }

        for (Appointment appointment : appointments) {
            appointment.displayDetails();
        }
    }
}



public class Main {

   

    static int readInt(Scanner sc) {

        while (true) {

            try {

                return Integer.parseInt(
                    sc.nextLine().trim()
                );

            } catch (NumberFormatException e) {

                System.out.println(
                    "Invalid input. Please enter a number."
                );
            }
        }
    }

    static double readDouble(Scanner sc) {

        while (true) {

            try {

                return Double.parseDouble(
                    sc.nextLine().trim()
                );

            } catch (NumberFormatException e) {

                System.out.println(
                    "Invalid input. Please enter a number."
                );
            }
        }
    }

   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hospital hospital = new Hospital();

        int choice;

        do {

            System.out.println("\n");
            System.out.println(
                "=========================================="
            );
            System.out.println(
                "   MULTI-SPECIALITY HOSPITAL MANAGEMENT"
            );
            System.out.println(
                "=========================================="
            );

            System.out.println("1.  Add Patient");
            System.out.println("2.  Add Doctor");
            System.out.println("3.  Add Department");
            System.out.println("4.  Search Patient");
            System.out.println("5.  Search Doctor");
            System.out.println("6.  Remove Patient");
            System.out.println("7.  Remove Doctor");
            System.out.println("8.  Display Patients");
            System.out.println("9.  Display Doctors");
            System.out.println("10. Display Departments");
            System.out.println("11. Book Appointment");
            System.out.println("12. Cancel Appointment");
            System.out.println("13. Display Appointments");
            System.out.println("14. Search Doctor by Specialization");
            System.out.println("15. Exit");

            System.out.print("\nEnter your choice: ");

            choice = readInt(sc);

            switch (choice) {

              
                case 1:

                    System.out.println(
                        "\n--- Add Patient ---"
                    );

                    System.out.print("Enter Patient ID: ");
                    int patientId = readInt(sc);

                    System.out.print("Enter Patient Name: ");
                    String patientName = sc.nextLine();

                    System.out.print("Enter Patient Age: ");
                    int patientAge = readInt(sc);

                    try {

                        if (patientAge <= 0 ||
                            patientAge > 120) {

                            throw new InvalidAgeException(
                                "Age must be between 1 and 120."
                            );
                        }

                        System.out.print(
                            "Enter Disease: "
                        );
                        String disease = sc.nextLine();

                        System.out.print(
                            "Enter Blood Group: "
                        );
                        String bloodGroup = sc.nextLine();

                        Patient patient =
                            new Patient(
                                patientId,
                                patientName,
                                patientAge,
                                disease,
                                bloodGroup
                            );

                        hospital.addPatient(patient);

                    } catch (InvalidAgeException e) {

                        System.out.println(
                            "Error: " + e.getMessage()
                        );
                    }

                    break;

             
                case 2:

                    System.out.println(
                        "\n--- Add Doctor ---"
                    );

                    System.out.print("Enter Doctor ID: ");
                    int doctorId = readInt(sc);

                    System.out.print("Enter Doctor Name: ");
                    String doctorName = sc.nextLine();

                    System.out.print("Enter Doctor Age: ");
                    int doctorAge = readInt(sc);

                    System.out.print(
                        "Enter Speciality: "
                    );
                    String speciality = sc.nextLine();

                    System.out.print(
                        "Enter Experience (years): "
                    );
                    int experience = readInt(sc);

                    System.out.print(
                        "Enter Consultation Fee: "
                    );
                    double fee = readDouble(sc);

                    Doctor doctor =
                        new Doctor(
                            doctorId,
                            doctorName,
                            doctorAge,
                            speciality,
                            experience,
                            fee
                        );

                    hospital.addDoctor(doctor);

                    break;

                case 3:

                    System.out.println(
                        "\n--- Add Department ---"
                    );

                    System.out.print(
                        "Enter Department ID: "
                    );
                    int deptId = readInt(sc);

                    System.out.print(
                        "Enter Department Name: "
                    );
                    String deptName = sc.nextLine();

                    Department department =
                        new Department(
                            deptId,
                            deptName
                        );

                    hospital.addDepartment(
                        department
                    );

                    break;

          
                case 4:

                    System.out.print(
                        "Enter Patient ID: "
                    );

                    int searchPatientId =
                        readInt(sc);

                    hospital.searchPatient(
                        searchPatientId
                    );

                    break;

          
                case 5:

                    System.out.print(
                        "Enter Doctor ID: "
                    );

                    int searchDoctorId =
                        readInt(sc);

                    hospital.searchDoctor(
                        searchDoctorId
                    );

                    break;

            
                case 6:

                    System.out.print(
                        "Enter Patient ID to remove: "
                    );

                    int removePatientId =
                        readInt(sc);

                    hospital.removePatient(
                        removePatientId
                    );

                    break;

                case 7:

                    System.out.print(
                        "Enter Doctor ID to remove: "
                    );

                    int removeDoctorId =
                        readInt(sc);

                    hospital.removeDoctor(
                        removeDoctorId
                    );

                    break;

                // ==========================
                // DISPLAY PATIENTS
                // ==========================
                case 8:

                    hospital.displayPatients();

                    break;

                // ==========================
                // DISPLAY DOCTORS
                // ==========================
                case 9:

                    hospital.displayDoctors();

                    break;

                // ==========================
                // DISPLAY DEPARTMENTS
                // ==========================
                case 10:

                    hospital.displayDepartments();

                    break;

                case 11:

                    System.out.println(
                        "\n--- Book Appointment ---"
                    );

                    System.out.print(
                        "Enter Appointment ID: "
                    );

                    int appointmentId =
                        readInt(sc);

                    System.out.print(
                        "Enter Patient ID: "
                    );

                    int appointmentPatientId =
                        readInt(sc);

                    System.out.print(
                        "Enter Doctor ID: "
                    );

                    int appointmentDoctorId =
                        readInt(sc);

                    System.out.print(
                        "Enter Date: "
                    );

                    String date = sc.nextLine();

                    System.out.print(
                        "Enter Time: "
                    );

                    String time = sc.nextLine();

                    hospital.bookAppointment(
                        appointmentId,
                        appointmentPatientId,
                        appointmentDoctorId,
                        date,
                        time
                    );

                    break;

              
                case 12:

                    System.out.print(
                        "Enter Appointment ID: "
                    );

                    int cancelId = readInt(sc);

                    hospital.cancelAppointment(
                        cancelId
                    );

                    break;

               
                case 13:

                    hospital.displayAppointments();

                    break;

               
                case 14:

                    System.out.print(
                        "Enter Speciality: "
                    );

                    String searchSpeciality =
                        sc.nextLine();

                    hospital.searchDoctorBySpeciality(
                        searchSpeciality
                    );

                    break;

                case 15:

                    System.out.println(
                        "\nThank you for using " +
                        "Hospital Management System."
                    );

                    break;

                default:

                    System.out.println(
                        "Invalid choice. Please try again."
                    );
            }

        } while (choice != 15);

        sc.close();
    }
}