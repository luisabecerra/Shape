/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RUBEN
 */
public abstract  class Shape {
    private double numSides;

    public Shape(double numSides) {
        this.numSides = numSides;
    }

    public double getNumSides() {
        return numSides;
    }

    public void setNumSides(double numSides) {
        this.numSides = numSides;
    }
   
    public abstract Shape Perimeter();
    public abstract Shape Area();


    
    
}
