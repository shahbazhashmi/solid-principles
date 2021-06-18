/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleresponsibility.correct;

/**
 *
 * @author shahbaz
 */
public class BookPrinter {
    
    public void printAuthorName(Book book) {
        System.out.println("Author Name -> "+book.getAuthor());
    }
    
}
