/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RUBEN
 */
public class Rectangle extends Shape {
    private double wigth;
    private double height;
    private double p;
    private double area;

    public Rectangle(double wigth, double height, double numSides) {
        super(numSides);
        this.wigth = wigth;
        this.height = height;
    }

    public double getArea() {
        return area;
    }

    
    @Override
    public abstract Shape Area();

    @Override
    public abstract Shape Perimeter();

    @Override
    public void setNumSides(double numSides) {
        super.setNumSides(numSides); 
    }

    @Override
    public double getNumSides() {
        return super.getNumSides(); 
    }

    public Rectangle(double numSides) {
        super(numSides);
    }

    public void Perimeter(double perimeter) {
        double p =(2*height)+(2*wigth);
        this.p = perimeter;
        System.out.println("El perimetro es "+ perimeter);
    }

    public double getP() {
        return p;
    }
    
     public void Area(double area) {
        area=(wigth*height);
        this.area = area;
        System.out.println("El area es "+ area);
    }
}
