package com.fasttrack;


public class Bottle {
    private int totalCapacity;
    private int availableLiquid;
    private boolean open;

    public Bottle(int totalCapacity, int availableLiquid, boolean open) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = open;
    }

    public boolean hasLiquid() {
        return availableLiquid != 0;
    }

    public int getAvailableLiquid() {
        return availableLiquid;
    }

    public int emptyCapacity() {
        return this.totalCapacity - this.availableLiquid;
    }

    public String openBottle() {
        if (this.open == true) {
            System.out.println("The bottle is already open.");
            return "";
        } else {
            this.open = true;
            return "Bottle is opened.";
        }
    }

    public String closeBottle() {
        if (this.open == false) {
            System.out.println("The bottle is already closed");
            return "";
        } else {
            this.open = false;
            return "Bottle is closed.";
        }
    }

    public String drinkLiquid(int amountOfLiquid) {
        if (open == false) {
            System.out.println("The Bottle is closed.");
            return "Open the bottle first.";
        } else {
            if (amountOfLiquid > availableLiquid) {
                System.out.println("There is not enough liquid in the bottle");
                return "Please reduce the desired amount od liquid.";
            } else {
                this.availableLiquid -= amountOfLiquid;
                return "You drank: " + amountOfLiquid + " ml liquid.";
            }
        }
    }
}
