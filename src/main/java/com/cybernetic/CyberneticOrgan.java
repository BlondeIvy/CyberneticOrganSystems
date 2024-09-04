package com.cyberorgansystem;

public class CyberneticOrgan {
    private String id;
    private String model;
    private String functionality;
    private String compatibility;

    public CyberneticOrgan(String id, String model, String functionality, String compatibility){
        this.id = id;
        this.model = model;
        this.functionality = functionality;
        this.compatibility = compatibility;
    }

    public String getDetails() {
        StringBuilder patient = new StringBuilder();
        patient.append("Id: ").append(id);
        patient.append("\nModel: ").append(model);
        patient.append("\nFunctionality: ").append(functionality);
        patient.append("\nCompatibility: ").append(compatibility);
        return patient.toString();
    }

    public boolean isCompatible(String patientCompatibility) {
        return this.compatibility.equals(patientCompatibility);
    }

    public String getModel(){
        return model;
    }
}