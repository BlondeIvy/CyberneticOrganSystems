package com.cyberorgansystem;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrganInventory inventory = new OrganInventory();

        inventory.addOrgan(new CyberneticOrgan("ORG001", "CyberHeartX1", "Pumps blood", "Type O"));
        inventory.addOrgan(new CyberneticOrgan("ORG002", "CyberEyeV2", "Enhanced vision", "Type A"));
        inventory.addOrgan(new CyberneticOrgan("ORG003", "CyberLungZ3", "Filters air", "Type B"));
        inventory.addOrgan(new CyberneticOrgan("ORG004", "CyberLiverA5", "Detoxifies blood", "Type O"));
        inventory.addOrgan(new CyberneticOrgan("ORG005", "CyberKidneyX4", "Regulates electrolytes", "Type AB"));

        System.out.println("Original Inventory:");
        inventory.getOrganList().forEach(System.out::println);

        System.out.println("\nSorted using built-in sort:");
        List<CyberneticOrgan> sortedBuiltIn = inventory.sortOrganbyNameModelAndCompatibilityUsingBuiltInSort();
        sortedBuiltIn.forEach(System.out::println);

        System.out.println("\nSorted using QuickSort:");
        List<CyberneticOrgan> sortedQuickSort = inventory.quickSortOrganbyModelandCompatibility(inventory.getOrganList());
        sortedQuickSort.forEach(System.out::println);

    }
}