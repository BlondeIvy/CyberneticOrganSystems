package com.cyberorgansystem;

import java.util.ArrayList;
import java.util.Collections;

public class OrganInventory {
    private ArrayList<CyberneticOrgan> inventory;


    public OrganInventory() {
        this.inventory = new ArrayList<>();
    }

    public void addOrgan(CyberneticOrgan organ) {
        inventory.add(organ);
        System.out.println("The Organ has been successfully added to the Inventory.");
    }

    public ArrayList<CyberneticOrgan> getOrganList() {
        return inventory;
    }

    public String removeOrgan(String model) {
        for (CyberneticOrgan organ : inventory) {
            if (organ.getModel().equalsIgnoreCase(model)) {
                inventory.remove(organ);
                System.out.println("The Organs has successfully been removed from the Inventory.");
            }
        }
        return model + " not found in the Inventory.";
    }

    public ArrayList<CyberneticOrgan> searchOrganByFunctionality(String functionality) {
        ArrayList<CyberneticOrgan> funcitions = new ArrayList<CyberneticOrgan>();
        for (CyberneticOrgan organ : inventory) {
            if (organ.getFunctionality().equalsIgnoreCase(functionality)) {
                funcitions.add(organ);
            }
        }
        return funcitions;
    }

    public ArrayList<CyberneticOrgan> sortOrgansByModel() {
        ArrayList<CyberneticOrgan> byModelList = new ArrayList<>();
        byModelList = (ArrayList<CyberneticOrgan>) inventory.clone();
        Collections.sort(byModelList, (o1, o2) -> o1.getModel().compareTo(o2.getModel()));
        return byModelList;
    }

}