package com.cybernetic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrganInventory 
{

    private final ArrayList<CyberneticOrgan> storage;
    private String model;

    public OrganInventory() 
    {
        this.storage = new ArrayList<>();
    }

    
    public String addOrgan(CyberneticOrgan organ)
    {
        storage.add(organ);
        return this.model() + " has been added to your storage.";
    }

    private String model() 
    {
        throw new UnsupportedOperationException("Unimplemented method 'model'");
    }


    public ArrayList<CyberneticOrgan> getOrganList() 
    {
        return storage;
    }


    public String removeOrgan(String model) 
    {
        for (CyberneticOrgan organ : storage) 
        {
            if (organ.getModel().equalsIgnoreCase(model)) 
            {
                storage.remove(organ);
                return model + " has been removed from your storage.";
            }
        }
        return "Error: Organ was not found. Try again.";
    }

    public ArrayList<CyberneticOrgan> searchOrganByFunctionality(String functionality) 
    {
        ArrayList<CyberneticOrgan> result = new ArrayList<>();
        
        for (CyberneticOrgan organ : storage) 
        {
            if (organ.getFunctionality().equalsIgnoreCase(functionality)) 
            {
                result.add(organ);
            }
        }

        if (result.isEmpty()) 
        {
            System.out.println("No Organs detected.");
        }

        return result;
    }

    public ArrayList<CyberneticOrgan> sortOrgansByModel() 
    {
        Collections.sort(storage, new Comparator<CyberneticOrgan>() 
        {

            public int compare(CyberneticOrgan organ1, CyberneticOrgan organ2) 
            {
                return organ1.getModel().compareToIgnoreCase(organ2.getModel());
            }
        });

    return storage; 

    }



    
}
