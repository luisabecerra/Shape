/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RUBEN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle re= new Rectangle(123, 12,4) ;
        re.getArea();
        re.getP();
        
        Triangle tr = new Triangle(34, 545, 3);
        tr.getPerimeter();
        tr.getArea();
    }
    
}
