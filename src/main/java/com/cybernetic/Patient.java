package com.cyberorgansystem;

import java.util.ArrayList;

public class Patient {
    private String name;
    private int age;
    private String medicalHistory;
    private CyberneticOrgan[] installedOrgans;
        private int organTally;
        private final int organsCap = 5;

    public Patient(String name, int age, String medicalHistory) {
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
        this.installedOrgans = new CyberneticOrgan[organsCap];
        this.organTally = 0;
    }

    public String addOrgan(CyberneticOrgan organ) {
        if (organTally < installedOrgans.length) {
            installedOrgans[organTally++] = organ;
            return " The Organ added to " + name + "'s Installed Organs List.";
        }
        return " There is no more space left in the Installed Organs List.";
    }

    public ArrayList<CyberneticOrgan> getOrganList() {
        ArrayList<CyberneticOrgan> listOfOrgans = new ArrayList<>();
        for (int i =0;i < organTally; i++){
            listOfOrgans.add(installedOrgans[i]);
        }
        return listOfOrgans;
    }

    public String getPatientInfo() {
            StringBuilder data = new StringBuilder();
            data.append("Name: ").append(name);
            data.append("\nAge: ").append(age);
            data.append("\nMedical History: ").append(medicalHistory);
            data.append("\nInstalled Organs: ");
                if (organTally == 0) {
                    data.append("\n  No organs installed");
                 } else {
                    for (int i=0; i < organTally; i++) {
                        data.append("\n  - ").append(installedOrgans[i].getDetails());
                    }
                }
            return data.toString();
        }

    }