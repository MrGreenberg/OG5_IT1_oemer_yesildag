package de.futurehome.tanksimulator;

public class Tank {

    private double fuellstand;

    public Tank(double fuellstand) {
        this.fuellstand = fuellstand;
    }

    public double getFuellstand() {
        return fuellstand;
    }

    public void setFuellstand(double fuellstand) {

       
        if (fuellstand < 0) {
            this.fuellstand = 0;
        }
       
        else if (fuellstand > 100) {
            this.fuellstand = 100;
        }
        else {
            this.fuellstand = fuellstand;
        }
    }
}

