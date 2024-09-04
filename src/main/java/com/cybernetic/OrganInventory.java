package com.cyberorgansystem;

import java.util.ArrayList;

public class OrganInventory {
    private ArrayList<CyberneticOrgan> inventory;

    public OrganInventory() {
        this.inventory = new ArrayList<>();
    }

    public void addOrgan(CyberneticOrgan organ) {
        inventory.add(organ);
        System.out.println("The Organ successfully added to the Inventory.");
    }

    public void getOrgan(String model) {
        for (CyberneticOrgan organ : inventory) {
            if (organ.getModel().equals(model)) {
                System.out.println(organ.getDetails());
                return;
            }
        }
        System.out.println(model + " not found in the Inventory.");

    }
}