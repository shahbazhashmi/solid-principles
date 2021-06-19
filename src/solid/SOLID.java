/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

import dependencyinversion.DependencyInversion;
import interfacesegregation.InterfaceSegregation;
import liskovsubsitution.LiskovSubsitution;
import openclosed.OpenClosed;
import singleresponsibility.SingleResponsibility;

/**
 *
 * @author shahbaz
 */
public class SOLID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new LiskovSubsitution();
        //new SingleResponsibility();
        //new OpenClosed();
        new InterfaceSegregation();
        //new DependencyInversion();
    }
    
}
