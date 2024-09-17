package com.cyberorgansystem;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Cybernetic Organ Management System (COMS)");

        CyberneticOrgan organ1 = new CyberneticOrgan("001", "HeartModelX", "Pumps blood", "O+");
        System.out.println(organ1.getDetails());

        Patient patient1 = new Patient("Peter", 50, "Kidney Failure");
        patient1.addOrgan(organ1);
        System.out.println(patient1.getPatientInfo());

        OrganInventory inventory = new OrganInventory();
        inventory.addOrgan(organ1);

        CyberneticOrgan retrievedOrgan = inventory.getOrgan("HeartModelX");
        if (retrievedOrgan != null) {
            System.out.println("Retrieved Organ: " + retrievedOrgan.getDetails());
        }
    }
}
