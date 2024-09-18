package com.cyberorgansystem;

import java.util.Random;

public class Brain {
    public int brainControlEfficiency;
    public int health;
    public Random random;

    public Brain(){
        this.brainControlEfficiency = 90;
        this.health = 100;
        this.random = new Random();
    }

    public void getinfo(int lungOxygenLevel){
        updatebrainControlEfficiency(lungOxygenLevel);
        updateBrainhealth(lungOxygenLevel);
    }

    public void updatebrainControlEfficiency(int lungOxygenLevel){
        int randomFluctuation = (int) (random.nextDouble() * 3 - 2);
        brainControlEfficiency += brainControlEfficiency +((lungOxygenLevel)/20) - 3 + randomFluctuation;
        brainControlEfficiency = Math.max(50,Math.min(100,brainControlEfficiency));
    }

    public void updateBrainhealth(int lungOxygenLevel){
        int healthChange = -1 + ((lungOxygenLevel)/25) - 2;
        changeBrainHealth(healthChange);
    }

    public void changeBrainHealth(int healthChange){
        health += healthChange;
        health = Math.max(0, Math.min(100,health));
    }

    public int getBrainControlEfficiency(){
        return brainControlEfficiency;
    }

    public int getHealth(){
        return health;
    }
}
