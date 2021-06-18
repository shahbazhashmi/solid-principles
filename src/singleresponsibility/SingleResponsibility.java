/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleresponsibility;

import singleresponsibility.correct.BookPrinter;

/**
 *
 * @author shahbaz
 */
public class SingleResponsibility {
    
    /**
     * As the name suggests, this principle states that each class should have one responsibility, 
     * one single purpose. This means that a class will do only one job, which leads us to conclude 
     * it should have only one reason to change.
     */

    public SingleResponsibility() {
        //doIncorrectImplementation();
        doCorrectImplementation();
    }
    
    
    private void doIncorrectImplementation() {
        /**
         * Let’s consider a class that contains book information. 
         * The only job of this class should be containing book related data and 
         * do book related operations.
         */
        singleresponsibility.incorrect.Book book = new singleresponsibility.incorrect.Book("End Days", "Ram Mohan Roy", "Sci Fi");
        
        /**
         * Having a method that prints out author name in this class violate the Single Responsibility Principle
         */
        book.printAuthorName();
    }
    
    
    private void doCorrectImplementation() {
        singleresponsibility.correct.Book book = new singleresponsibility.correct.Book("God Skills", "Jopen Sep", "Cosmology");
        
        /**
         * Now, in this class, we can create methods for as many variations of printing text as we want, 
         * because that's its job.
         */
        BookPrinter bookPrinter = new BookPrinter();
        bookPrinter.printAuthorName(book);
    }
    
}
