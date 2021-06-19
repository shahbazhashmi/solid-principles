/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyinversion;

import dependencyinversion.correct.Project;
import java.util.ArrayList;
import java.util.List;
import solid.PrincipleContract;

/**
 *
 * @author shahbaz
 */
public class DependencyInversion implements PrincipleContract{
    
    /**
     * Dependency Inversion Principle states states that
     * High-level modules should not depend on low-level modules. Both should depend on abstractions.
     * Abstractions should not depend on details. Details should depend on abstractions.
     */

    public DependencyInversion() {
        //doIncorrectImplementation();
        doCorrectImplementation();
    }
    
    

    @Override
    public void doCorrectImplementation() {
        List<dependencyinversion.correct.Developer> developers = new ArrayList();
        
        /**
         * Injecting Dependencies from out side of the class.
         */
        developers.add(new dependencyinversion.correct.BackEndDeveloper());
        developers.add(new dependencyinversion.correct.FrontEndDeveloper());
        
        /**
         * The outcome is that the Project class does not depend on lower level modules, but rather abstractions. 
         * Also, low-level modules and their details depend on abstractions.
         */
        
        dependencyinversion.correct.Project project = new Project(developers);
        
        project.implement();
    }

    @Override
    public void doIncorrectImplementation() {
        /**
         * Project class depends on FrontEndDeveloper and BackEndDeveloper. 
         * Hence it is violating the Dependency Inversion Principle.
         */
        dependencyinversion.incorrect.Project project = new dependencyinversion.incorrect.Project();
        project.implement();
    }
    
}
