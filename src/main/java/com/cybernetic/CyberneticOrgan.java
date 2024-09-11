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
        StringBuilder info = new StringBuilder();
        info.append("Id: ").append(id);
        info.append("\nModel: ").append(model);
        info.append("\nFunctionality: ").append(functionality);
        info.append("\nCompatibility: ").append(compatibility);
        return info.toString();
    }

    public boolean isCompatible(String patientCompatibility) {
        return this.compatibility.equals(patientCompatibility);
    }

    public String getModel(){
        return model;
    }

    public String getFunctionality(){
        return functionality; }
}