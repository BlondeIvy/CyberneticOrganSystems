package com.cyberorgansystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrganInventory {
    private ArrayList<CyberneticOrgan> inventory;


    public OrganInventory() {
        this.inventory = new ArrayList<>();
    }

    public void addOrgan(CyberneticOrgan organ) {
        inventory.add(organ);
        System.out.println("\nThe Organ has been successfully added to the Inventory.");
    }

    public ArrayList<CyberneticOrgan> getOrganList() {
        return inventory;
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

    public String removeOrgan(String model) {
        for (CyberneticOrgan organ : inventory) {
            if (organ.getModel().equalsIgnoreCase(model)) {
                inventory.remove(organ);
                System.out.println("\nThe Organs has successfully been removed from the Inventory.");
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

    public List<CyberneticOrgan> sortOrganbyNameModelAndCompatibilityUsingBuiltInSort() {
        ArrayList<CyberneticOrgan> sorted = new ArrayList<>(inventory);
        Collections.sort(sorted, new Comparator<CyberneticOrgan>() {
            @Override
            public int compare(CyberneticOrgan o1, CyberneticOrgan o2) {
                int modelCompare = o1.getModel().compareTo(o2.getModel());
                if (modelCompare != 0) {
                    return modelCompare;
                }
                return o1.getCompatibility().compareTo(o2.getCompatibility());
            }
        });
        return sorted;
    }

    public ArrayList<CyberneticOrgan> quickSortOrganbyModelandCompatibility(ArrayList<CyberneticOrgan> unmodifiableOrganList) {
        ArrayList<CyberneticOrgan> organList = new ArrayList<>(unmodifiableOrganList);
        quicksort(organList, 0, organList.size() - 1);
        return organList;
    }

    private void quicksort(ArrayList<CyberneticOrgan> organList, int lo, int hi) {
        if (lo < hi) {
            int pivotIndex = pivot(organList, lo, hi);
            quicksort(organList, lo, pivotIndex - 1);
            quicksort(organList, pivotIndex + 1, hi);
        }
    }

    private int pivot(ArrayList<CyberneticOrgan> organList, int lo, int hi) {
        CyberneticOrgan pivot = organList.get(hi);
        int i = lo - 1;
        for (int j = lo; j < hi; j++) {
            if (compareOrgans(organList.get(j), pivot) <= 0) {
                i++;
                Collections.swap(organList, i, j);
            }
        }
        Collections.swap(organList, i + 1, hi);
        return i + 1;
    }

    private int compareOrgans(CyberneticOrgan o1, CyberneticOrgan o2) {
        int modelCompare = o1.getModel().compareTo(o2.getModel());
        if (modelCompare != 0){
            return modelCompare;
        }
        return o1.getCompatibility().compareTo(o2.getCompatibility());

    }
}