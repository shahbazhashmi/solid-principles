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
public class Crow implements Bird{

    @Override
    public void eat() {
        System.out.println("crow is eating");
    }

    @Override
    public void sleep() {
        System.out.println("crow is sleeping");
    }

    @Override
    public void fly() {
        System.out.println("crow is flying");
    }
    
}
