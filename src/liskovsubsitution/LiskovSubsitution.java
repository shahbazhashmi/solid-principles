/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liskovsubsitution;

import liskovsubsitution.incorrect.Rectangle;
import liskovsubsitution.incorrect.Square;

/**
 *
 * @author shahbaz
 */
public class LiskovSubsitution {

    public LiskovSubsitution() {
        
        Rectangle rectangle = new Rectangle();
        
        rectangle.setHeight(2);
        rectangle.setWidth(3);
        
        System.out.println("Rectangle area -> "+rectangle.getArea());
        
        Rectangle square = new Square();
        
        square.setHeight(2);
        square.setWidth(3);
        
        System.out.println("Square area -> "+square.getArea());
        
        
    }
    
    
    
}
