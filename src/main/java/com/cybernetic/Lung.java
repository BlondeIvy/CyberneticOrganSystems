package com.cyberorgansystem;

import java.util.Random;

public class Lung {
    public int lungOxygenLevel;
    public int health;
    public Random random;

    public Lung(){
        this.lungOxygenLevel = 95;
        this.health=100;
        this.random = new Random();
    }

    public void getinfo(int pumpRate){
        updateLungOxygenLevel(pumpRate);
        updateLungHealth(pumpRate);
    }

    public void updateLungOxygenLevel(int pumpRate){
        int randomFluctuation = (int) (random.nextDouble() * 3 - 2);
        lungOxygenLevel += lungOxygenLevel + ((pumpRate)/20) - 3 + randomFluctuation;
        lungOxygenLevel = Math.max(70, Math.min(100, lungOxygenLevel));
    }

    public void updateLungHealth(int pumpRate){
        int healthChange = -1 + ((pumpRate)/25) - 2;
        changeLungHealth(healthChange);
    }

    public void changeLungHealth(int healthChange){
        health += healthChange;
        health = Math.max(0,Math.min(100, health));
    }

    public int getLungOxygenLevel(){
        return lungOxygenLevel;
    }

    public int getHealth(){
        return health;
    }
}
