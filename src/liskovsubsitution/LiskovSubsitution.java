/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liskovsubsitution;


/**
 *
 * @author shahbaz
 */
public class LiskovSubsitution {

    public LiskovSubsitution() {
        
        //doIncorrectImplementation();
        
        doCorrectImplementation();
        
    }
    
    
    private void doIncorrectImplementation() {
        liskovsubsitution.incorrect.Rectangle rectangle = new liskovsubsitution.incorrect.Rectangle();
        
        rectangle.setHeight(2);
        rectangle.setWidth(3);
        
        System.out.println("Rectangle area -> "+rectangle.getArea());
        
        liskovsubsitution.incorrect.Rectangle square = new liskovsubsitution.incorrect.Square();
        
        square.setHeight(2);
        square.setWidth(3);
        
        System.out.println("Square area -> "+square.getArea());
    }
    
    
    private void doCorrectImplementation() {
        liskovsubsitution.correct.AFourSideShape rectangle = new liskovsubsitution.correct.Rectangle(2, 3);
        
        System.out.println("Rectangle area -> "+rectangle.getArea());
        
        liskovsubsitution.correct.AFourSideShape square = new liskovsubsitution.correct.Square(2);
        
        System.out.println("Square area -> "+square.getArea());
    }
    
}
