package Inheritance;

class Doctor {

    // Private Data Members
    private int doctorId;
    private String doctorName;
    private String specialization;

    // Parameterized Constructor
    public Doctor(int doctorId, String doctorName, String specialization) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    // Getters
    public int getDoctorId() {
        return doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    // Setters
    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Display Doctor Details
    public void displayDetails() {
        System.out.println("Doctor ID       : " + doctorId);
        System.out.println("Doctor Name     : " + doctorName);
        System.out.println("Specialization  : " + specialization);
    }
}

class Surgeon extends Doctor {

    // Additional Data Members
    private String surgeryType;
    private int yearsOfExperience;

    // Parameterized Constructor
    public Surgeon(int doctorId, String doctorName, String specialization,
                   String surgeryType, int yearsOfExperience) {

        super(doctorId, doctorName, specialization);
        this.surgeryType = surgeryType;
        this.yearsOfExperience = yearsOfExperience;
    }

    // Override displayDetails()
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Surgery Type    : " + surgeryType);
        System.out.println("Experience      : " + yearsOfExperience + " Years");
    }
}

public class HospitalManagementSystem {

    public static void main(String[] args) {

        Surgeon surgeon = new Surgeon(
                101,
                "Dr. Ravi",
                "General Surgery",
                "Heart Surgery",
                12
        );

        surgeon.displayDetails();
    }
}

