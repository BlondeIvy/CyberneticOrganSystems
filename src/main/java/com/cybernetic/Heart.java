package com.cyberorgansystem;

import java.util.Random;

public class Heart {
    public int pumpRate;
    public int health;
    public Random random;

    public Heart() {
        this.pumpRate = 70;
        this.health = 100;
        this.random = new Random();
    }

    public void getinfo(int brainControlEfficiency, int lungOxygenLevel){
        updatePumpRate(brainControlEfficiency);
        updateHeartHealth(lungOxygenLevel);
    }

    public void updatePumpRate(int brainControlEfficiency){
        int randomFluctuation = random.nextInt(8)-4;
        pumpRate += (brainControlEfficiency/10) - 5 + randomFluctuation;
        pumpRate = Math.max(40,Math.min(100, pumpRate));
    }

    public void updateHeartHealth(int lungOxygenLevel){
        int healthChange = -1 + ((lungOxygenLevel)/25) - 2;
        changeHeartHealth(healthChange);
    }

    public void changeHeartHealth(int healthChange){
        health += healthChange;
        health = Math.max(0,Math.min(100,health));
    }

    public int getPumpRate(){
        return pumpRate;
    }

    public int getHealth(){
        return health;
    }
}
