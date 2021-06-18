/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openclosed.incorrect;

/**
 *
 * @author shahbaz
 */
public class Calculation {
    
    public int getArea(Object object) {
        if(object instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) object;
            return rectangle.getHeight() * rectangle.getWidth();
        } else {
            Circle circle = (Circle) object;
            return (int) (Math.PI * circle.getRadius() * circle.getRadius());
        }
    }
    
}
