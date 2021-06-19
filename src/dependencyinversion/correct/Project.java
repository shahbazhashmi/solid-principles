/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyinversion.correct;

import java.util.List;

/**
 *
 * @author shahbaz
 */
public class Project {

    private List<Developer> developers;

    public Project(List<Developer> developers) {

        this.developers = developers;
    }

    public void implement() {
        /**
         * Now Project class does not depend on the FrontEndDeveloper and the BackendDeveloper classes.
         */
        developers.forEach(d->d.develop());
    }

}
