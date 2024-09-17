package com.cybernetic;

import java.util.ArrayList;

public class Patient 
{
    private String name;
    private int age;
    private String medicalHistory;
    private CyberneticOrgan[] organs;
    private int organNum;

    public Patient(String name, int age, String medicalHistory)
    {
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
        this.organs = new CyberneticOrgan[5];
        this.organNum = 0;
    }

    public String addOrgan(CyberneticOrgan organ)
    {
        if(organNum < 5)
        {
            organs[organNum] = organ;
            organNum++;
            return "Organ successfully stored.";
        }
        else
        {
            return "Storage at maximum capacity.";
        }
    }

        public ArrayList<CyberneticOrgan> getOrganList() 
        {
            ArrayList<CyberneticOrgan> organList = new ArrayList<>();
                for (int i = 0; i < organNum; i++) 
                {
                    organList.add(organs[i]);
                }
            return organList;
        }

    
    public String getPatientInfo()
    {
        return "0";
    }



}
