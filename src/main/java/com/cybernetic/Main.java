package com.cyberorgansystem;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CyberneticOrgan organ1 = new CyberneticOrgan("ORG001","CyberHeartX1","Pumps blood","Type 0");
        CyberneticOrgan organ2 = new CyberneticOrgan("ORG002","CyberEyeV2","Enhanced vision","Type A");
        OrganInventory inventory = new OrganInventory();

        inventory.addOrgan(organ1);
        inventory.addOrgan(organ2);

        System.out.println("Organs in the Inventory:");
        ArrayList<CyberneticOrgan> organs = inventory.getOrganList();
        for (CyberneticOrgan organ : organs) {
            System.out.println(organ.getDetails());
        }

        Patient patient = new Patient("John Doe", 45, "Type II Diabetic");
        System.out.println(patient.addOrgan(organ1));
        System.out.println(patient.addOrgan(organ2));

        System.out.println("\nPatient Information:");
        System.out.println(patient.getPatientInfo());

        System.out.println("\nSearching for organs with functionality : (Enhanced vision)");
        ArrayList<CyberneticOrgan> bloodOrgans = inventory.searchOrganByFunctionality("Enhanced vision");
        for (CyberneticOrgan organ : bloodOrgans) {
            System.out.println(organ.getDetails());
        }

        System.out.println("\nOrgans sorted by model name:");
        ArrayList<CyberneticOrgan> sortedOrgans = inventory.sortOrgansByModel();
        for (CyberneticOrgan organ : sortedOrgans) {
            System.out.println(organ.getDetails());
        }
    }

}