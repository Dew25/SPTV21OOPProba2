/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21oopproba2;

import myclasses.Author;
import myclasses.Book;

/**
 *
 * @author user
 */
public class SPTV21OOPProba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Author author1 = new Author();
        author1.setFirstname("Aleksandr");
        author1.setLastname("Pushkin");
        Book book = new Book();
        book.setCaption("Jvgeny Onegin");
        Author[] authors = new Author[1];
        authors[0]=author1;
        book.setAuthors(authors);
        System.out.println(book.toString());
        
        Author author2 = new Author();
        author2.setFirstname("Ilja");
        author2.setLastname("Ilf");
        Author author3 = new Author();
        author3.setFirstname("Jevgeny");
        author3.setLastname("Petrov");
        Book book2 = new Book();
        Author[] authors2 = new Author[2];
        authors2[0]=author2;
        authors2[1]=author3;
        book2.setAuthors(authors2);
        book2.setCaption("Zolotoy teljonok");
        System.out.println(book2.toString());
        
        Author author4 = new Author();
        author4.setFirstname("Antonio");
        author4.setLastname("Gonsalves");
        Book book3 = new Book();
        book3.addAuthor(author4);
        book3.addAuthor(author1);
        book3.addAuthor(author2);
        book3.addAuthor(author3);
        book3.setCaption("Learning Java EE 7");
        System.out.println(book3.toString());
        
    }
    
}
