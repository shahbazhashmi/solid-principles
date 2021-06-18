/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesegregation;

import solid.PrincipleContract;

/**
 *
 * @author shahbaz
 */
public class InterfaceSegregation implements PrincipleContract{

    /**
     * Clients should not be forced to depend upon interfaces that they do not use.”
     * 
     * 
     * Similar to the Single Responsibility Principle, the goal of the Interface Segregation Principle 
     * is to reduce the side effects and frequency of required changes by splitting the software into multiple, 
     * independent parts.
     */
    public InterfaceSegregation() {
        //doIncorrectImplementation();
        doCorrectImplementation();
    }
    

    @Override
    public void doCorrectImplementation() {
        /**
         * Here both Crow implements BirdCanFly interface
         */
        interfacesegregation.correct.BirdCanFly crow = new interfacesegregation.correct.Crow();
        /**
         * Here both Pengiun implements BirdCannotFly interface.
         * No need to implement BirdCanFly interface, as pengiuns cannot fly.
         */
        interfacesegregation.correct.BirdCannotFly pengiun = new interfacesegregation.correct.Pengiun();
        
        /**
         * But internally both BirdCanFly and BirdCannotFly extends Bird interface
         */
        
        crow.eat();
        crow.sleep();
        crow.fly();
        
        pengiun.eat();
        pengiun.sleep();
        // So the fly() is not available for Pengiun
        //pengiun.fly();
    }

    @Override
    public void doIncorrectImplementation() {
        /**
         * Here both Crow and Pengiun classes implement Bird interface
         */
        interfacesegregation.incorrect.Crow crow = new interfacesegregation.incorrect.Crow();
        interfacesegregation.incorrect.Pengiun pengiun = new interfacesegregation.incorrect.Pengiun();
        
        /**
         * The implemented methods work fine with Crow as a crow can eat, sleep and fly
         */
        crow.eat();
        crow.sleep();
        crow.fly();
        
         /**
         * The implemented methods  do not work fine with Pengiun as a pengiun can eat, sleep but cannot fly.
         * There is no use fly() for the Pengiun, still it is forced to implement the fly()
         */
        pengiun.eat();
        pengiun.sleep();
        pengiun.fly();
    }
    
}
