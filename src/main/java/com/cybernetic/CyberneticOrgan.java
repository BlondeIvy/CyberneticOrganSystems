package com.cybernetic;

public class CyberneticOrgan
{
    private int id;
    private String model;
    private String functionality;
    private boolean compatibility;
    
    public String getModel()
    {
        return this.model;
    }

    public String getDetails()
    {
        return "0";
    }

    public boolean isCompatible(String patientCompatibility)
    {
        return true;
    }

    public String getFunctionality() 
    {
        throw new UnsupportedOperationException("Unimplemented method 'getFunctionality'");
    }

    
}
