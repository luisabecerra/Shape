/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Triangle extends Shape{
    private double wigth;
    private double height;
    private double perimeter;
    private double area;
    
    public Triangle(double numSides) {
        super(numSides);
    }

    public Triangle(double wigth, double height, double numSides) {
        super(numSides);
        this.wigth = wigth;
        this.height = height;
    }

    public double getWigth() {
        return wigth;
    }

    public void setWigth(double wigth) {
        this.wigth = wigth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

     public void Perimeter(double perimeter) {
        double lado1 = 0;
        double lado2 = 0;
        double lado3 = 0;
        double p =lado1+lado2+lado3;
        this.perimeter = perimeter;
        System.out.println("El perimetro es "+ perimeter);
    }
     public void Area(double area) {
        area=(wigth*height)/2;
        this.area = area;
        System.out.println("El area es "+ area);
    }
}
