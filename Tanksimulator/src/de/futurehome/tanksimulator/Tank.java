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

        // Füllstand darf nicht kleiner als 0 sein
        if (fuellstand < 0) {
            this.fuellstand = 0;
        }
        // Füllstand darf nicht größer als 100 sein
        else if (fuellstand > 100) {
            this.fuellstand = 100;
        }
        else {
            this.fuellstand = fuellstand;
        }
    }
}

