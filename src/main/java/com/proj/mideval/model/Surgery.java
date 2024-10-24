package com.proj.mideval.model;

public class Surgery {
    private int surgeryID;
    private int patientID;
    private int doctorID;
    private String type;
    private int criticalLevel;

    // Constructors
    public Surgery() {}

    public Surgery(int surgeryID, int patientID, int doctorID, String type, int criticalLevel) {
        this.surgeryID = surgeryID;
        this.patientID = patientID;
        this.doctorID = doctorID;
        this.type = type;
        this.criticalLevel = criticalLevel;
    }

    // Getters and Setters
    public int getSurgeryID() { return surgeryID; }
    public void setSurgeryID(int surgeryID) { this.surgeryID = surgeryID; }

    public int getPatientID() { return patientID; }
    public void setPatientID(int patientID) { this.patientID = patientID; }

    public int getDoctorID() { return doctorID; }
    public void setDoctorID(int doctorID) { this.doctorID = doctorID; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public int getCriticalLevel() { return criticalLevel; }
    public void setCriticalLevel(int criticalLevel) { this.criticalLevel = criticalLevel; }
}

