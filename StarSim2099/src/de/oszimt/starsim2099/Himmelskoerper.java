package de.oszimt.starsim2099;
public abstract class Himmelskoerper {

   
    protected double posX;
    protected double posY;

    
    public Himmelskoerper() {
       
    }

    public Himmelskoerper(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    
    public double getPosX() {
        return posX;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public double getPosY() {
        return posY;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }

    
    public abstract String getType();
}
