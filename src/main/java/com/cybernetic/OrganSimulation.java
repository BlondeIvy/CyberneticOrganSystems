package com.cyberorgansystem;

import java.util.Random;

public class OrganSimulation {
    private Heart heart;
    private Lung lung;
    private Brain brain;
    private int steps;
    private Random random;

    public OrganSimulation(){
        heart = new Heart();
        lung = new Lung();
        brain = new Brain();
        steps = 0;
        random = new Random();
    }

    public void startSim(){
        System.out.println("\nTime : 100");
        System.out.println("\tIntial States: 100 ");
        System.out.println("\tHeart Health: 100 ");
        System.out.println("\tLung Health: 100 ");
        System.out.println("\tBrain Health: 100 \n");
        stepCounter(100);
    }

    public void stepCounter(int stepsRemaining){
        if(stepsRemaining == 0 || heart.getHealth() == 0 || lung.getHealth() <= 0 || brain.getHealth() <= 0){
            printFinalStatement();
            return;
        }
        steps++;
        updateOrgans();
        printBreak();
        healthAlerts();
        randomEvents();
        stepCounter(stepsRemaining - 1);
    }

    public void updateOrgans(){
        heart.getinfo(brain.getBrainControlEfficiency(),lung.getLungOxygenLevel());
        lung.getinfo(heart.getPumpRate());
        brain.getinfo(lung.getLungOxygenLevel());
    }

    public void printBreak() {
        System.out.println("Time: " + steps);
        System.out.println("Heart Health : " + heart.getHealth() + " | Pump Rate: " + heart.getPumpRate());
        System.out.println("Lung Health: " + lung.getHealth() + " | Lung Oxygen Level: " + lung.getLungOxygenLevel());
        System.out.println("Brain Health: " + brain.getHealth() + "| Brain Control Efficiency: " + brain.getBrainControlEfficiency());
    }

    public void printFinalStatement(){
            System.out.println("End of Simulations: ");
            System.out.println("\nTime: " + steps);
            System.out.println("\nHeart Health: " + heart.getHealth());
            System.out.println("\nLung Health: " + lung.getHealth());
            System.out.println("\nBrain Health: " + brain.getHealth());
            System.out.println("\n\nResult : ");

            if(heart.getHealth() > 0 && lung.getHealth() > 0 && brain.getHealth() >0 ){
                System.out.println("Success.");
            } else {
                System.out.println("Failure.");
            }
    }

    public void healthAlerts(){
        if(heart.getHealth() < 25){
            System.out.println("ALERT! at Step " + steps + ": Heart Critical! Health at " + heart.getHealth() + ".");
        }
        if(lung.getHealth() < 25){
            System.out.println("ALERT! at Step" + steps + ": Lung Critical! Health at " + lung.getHealth() + ".");
        }
        if(brain.getHealth() < 25){
            System.out.println("ALERT! at Step" + steps + ": Lung Critical! Health at " + brain.getHealth() + ".");
        }
    }

    public void randomEvents(){
        if(random.nextDouble() < 0.1){
            String[] organs = {"Heart" , "Lung" , "Brain"};
            String organsPicked = organs[random.nextInt(organs.length)];
            int nuHealthChange = random.nextInt(21) - 10;
            System.out.println("Random Event at Step " + steps + ": Random health change for " + organsPicked + " by " + (nuHealthChange-1) + "%.");

            switch(organsPicked){
                case "Heart" :
                    heart.changeHeartHealth(nuHealthChange);
                    break;
                case "Lung" :
                    lung.changeLungHealth(nuHealthChange);
                case "Brain" :
                    brain.changeBrainHealth(nuHealthChange);
            }
        }
    }
}
