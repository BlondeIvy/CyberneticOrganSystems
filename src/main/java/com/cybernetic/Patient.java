package com.cyberorgansystem;


import java.util.ArrayList;
import java.util.List;


public class Patient {

    private String name;
    private int age;
    private String medicalHistory;
    private List<CyberneticOrgan> installedOrgans;

    public Patient(String name, int age, String medicalHistory) {
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
        this.installedOrgans = new ArrayList<>(); // initializes for individual patients organ list.
    }

    public void addOrgan(CyberneticOrgan organ) {
        installedOrgans.add(organ);
        System.out.println(" The Organ added to " + name + "'s Installed Organs List");

    }

    public String getPatientInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Name: ").append(name);
        info.append("\nAge: ").append(age);
        info.append("\nMedical History: ").append(medicalHistory);
        info.append("\nInstalled Organs: ");
            if (info.isEmpty()) {
                info.append("\n  No organs installed");
             }
            else {
                for (CyberneticOrgan organ : installedOrgans) {
                info.append("\n  - ").append(organ.getDetails());
                }
             }
            return info.toString();
    }

}