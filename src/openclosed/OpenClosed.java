/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openclosed;

import openclosed.incorrect.Calculation;
import solid.PrincipleContract;

/**
 *
 * @author shahbaz
 */
public class OpenClosed implements PrincipleContract{

    public OpenClosed() {
        doCorrectImplementation();
    }
    
    

    @Override
    public void doCorrectImplementation() {
        openclosed.correct.Shape rectangle = new openclosed.correct.Rectangle(3, 4);
        openclosed.correct.Shape circle = new openclosed.correct.Circle(4);
       
        
        System.out.println("Area of rectangle -> "+rectangle.getArea());
        System.out.println("Area of circle -> "+circle.getArea());
    }

    @Override
    public void doIncorrectImplementation() {
        openclosed.incorrect.Rectangle rectangle = new openclosed.incorrect.Rectangle(3, 4);
        openclosed.incorrect.Circle circle = new openclosed.incorrect.Circle(4);
        
        Calculation calculation = new Calculation();
        
        System.out.println("Area of rectangle -> "+calculation.getArea(rectangle));
        System.out.println("Area of circle -> "+calculation.getArea(circle));
    }
    
}
