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
    
    
    /**
     * "Software entities (classes, modules, functions, etc.) should be open for extension, 
     * but closed for modification.”
     * 
     * 
     * The general idea of this principle is great. It tells you to write your code so that you will be able 
     * to add new functionality without changing the existing code. That prevents situations in which a change t
     * o one of your classes also requires you to adapt all depending classes.
     */

    public OpenClosed() {
        doCorrectImplementation();
    }
    
    

    /**
     * It uses interfaces / abstract classes instead of superclasses to allow different implementations 
     * which you can easily substitute without changing the code that uses them. The interfaces are closed 
     * for modifications, and you can provide new implementations to extend the functionality of your software.
     */
    @Override
    public void doCorrectImplementation() {
        openclosed.correct.Shape rectangle = new openclosed.correct.Rectangle(3, 4);
        openclosed.correct.Shape circle = new openclosed.correct.Circle(4);
       
       /**
        * When we add new shape, no change is required in the existing code for the area.
        */ 
        System.out.println("Area of rectangle -> "+rectangle.getArea());
        System.out.println("Area of circle -> "+circle.getArea());
    }

    @Override
    public void doIncorrectImplementation() {
        /**
         * Here we have Rectangle and Circle classes which use Calculation class for the calculation, like area
         */
        openclosed.incorrect.Rectangle rectangle = new openclosed.incorrect.Rectangle(3, 4);
        openclosed.incorrect.Circle circle = new openclosed.incorrect.Circle(4);
        
        /**
         * Every time we add a new shape, we need to add new logic for the area in calculation class.
         * Since we need to change the existing the code, this approach does not follow Open-Closed Principle.
         */
        Calculation calculation = new Calculation();
        
        System.out.println("Area of rectangle -> "+calculation.getArea(rectangle));
        System.out.println("Area of circle -> "+calculation.getArea(circle));
    }
    
}
