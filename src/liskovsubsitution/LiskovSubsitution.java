/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liskovsubsitution;

import solid.PrincipleContract;


/**
 *
 * @author shahbaz
 */
public class LiskovSubsitution implements PrincipleContract{
    
    /**
     * Liskov Substitution Principle can be considered to be an extension of the Open / Closed principle 
     * which states the base class reference should be replaceable by the child class 
     * without changing the functionality.
     */

    public LiskovSubsitution() {
        
        //doIncorrectImplementation();
        
        doCorrectImplementation();
        
    }
    
    @Override
    public void doIncorrectImplementation() {
        /**
         * Let us assume that we implemented a Rectangle class with height, width properties and getArea method. 
         * Alone it will function perfectly fine.
         */
        liskovsubsitution.incorrect.Rectangle rectangle = new liskovsubsitution.incorrect.Rectangle();
        
        rectangle.setHeight(2);
        rectangle.setWidth(3);
        
        System.out.println("Rectangle area -> "+rectangle.getArea());
        
        /**
         * Output:
         * Area of the rectangle = 6 where Height = 2 and Width = 3
         */
        
        /**
         * Now we would like to have a similar functionality for a Square as well, 
         * so instead on reinventing the wheel we will simply inherit from the Rectangle class 
         * and customize the functionality for a square.
         */
        
        //liskovsubsitution.incorrect.Rectangle square = new liskovsubsitution.incorrect.Rectangle();
        
        /**
         * But now if we replace the reference of the parent class by the child class 
         * then we will not the correct area for the rectangle since we have change the core 
         * functions (setHeight, setWidth) to set the height and width to same value 
         * which is not true in case of rectangle. Hence we have violated the Liskov Substitution principle.
         */
        liskovsubsitution.incorrect.Rectangle square = new liskovsubsitution.incorrect.Square();
        
        square.setHeight(2);
        square.setWidth(3);
        
        System.out.println("Square area -> "+square.getArea());
        
        /**
         * Output:
         * Area of the square = 9 where Height = 3 and Width = 3
         */
        
        
    }
    
    
    /**
     * It is clear that the Square type is not substitutable for the Rectangle. 
     * LSP states that we should be able to the child classes should be able to extend the base classes 
     * without changing their existing functionality and we are violating that in this implementation 
     * as our square class is changing the behavior of the rectangle class.

     * Generally speaking the non-substitutable code will break polymorphism.

     * We can fix this code by creating a class (Shape) from which both Rectangle and Square inherit from. 
     * So as we could see in the code below, we have created an abstract class shape with an abstract method GetArea.
     */
    @Override
    public void doCorrectImplementation() {
        liskovsubsitution.correct.Shape rectangle = new liskovsubsitution.correct.Rectangle(2, 3);
        
        System.out.println("Rectangle area -> "+rectangle.getArea());
        
        /**
         * Output:
         * Area of the rectangle = 6 where Height = 2 and Width = 3
         */
        
        liskovsubsitution.correct.Shape square = new liskovsubsitution.correct.Square(2);
        
        System.out.println("Square area -> "+square.getArea());
        
        /**
         * Output:
         * Area of the square = 4 where Height = 2 and Width = 2
         */
        
        
        /**
         * So now the parent class is substitutable by the child classes 
         * without changing any existing functionality and so we are not violating 
         * the Liskov Substitution Principle.
         */
    }
    
}
