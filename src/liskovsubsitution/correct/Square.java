/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liskovsubsitution.correct;

/**
 *
 * @author shahbaz
 */
public class Square extends Shape{
    
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
    
    
    
}
