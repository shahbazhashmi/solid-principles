/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesegregation.correct;

/**
 *
 * @author shahbaz
 */
public class Pengiun implements BirdCannotFly{
    
    @Override
    public void eat() {
        System.out.println("Pengiun is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Pengiun is sleeping");
    }

}
