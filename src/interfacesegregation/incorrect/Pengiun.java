/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesegregation.incorrect;

/**
 *
 * @author shahbaz
 */
public class Pengiun implements Bird{

    @Override
    public void eat() {
        System.out.println("Pengiun is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Pengiun is sleeping");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
