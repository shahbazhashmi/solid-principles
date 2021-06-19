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
         * Here both Penguin implements BirdCannotFly interface.
         * No need to implement BirdCanFly interface, as penguins cannot fly.
         */
        interfacesegregation.correct.BirdCannotFly penguin = new interfacesegregation.correct.Penguin();
        
        /**
         * But internally both BirdCanFly and BirdCannotFly extends Bird interface
         */
        
        crow.eat();
        crow.sleep();
        crow.fly();
        
        penguin.eat();
        penguin.sleep();
        //So the fly() is not available for Penguin
        //penguin.fly();
    }

    @Override
    public void doIncorrectImplementation() {
        /**
         * Here both Crow and Penguin classes implement Bird interface
         */
        interfacesegregation.incorrect.Crow crow = new interfacesegregation.incorrect.Crow();
        interfacesegregation.incorrect.Penguin penguin = new interfacesegregation.incorrect.Penguin();
        
        /**
         * The implemented methods work fine with Crow as a crow can eat, sleep and fly
         */
        crow.eat();
        crow.sleep();
        crow.fly();
        
         /**
         * The implemented methods  do not work with Penguin as a penguin can eat, sleep but cannot fly.
         * There is no use fly() for the Penguin, still it is forced to implement the fly()
         */
        penguin.eat();
        penguin.sleep();
        penguin.fly();
    }
    
}
