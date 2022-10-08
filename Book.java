/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rowanseanproject1;
import java.util.*;

/**
 *
 * @author seanrowan
 */
public class Book extends Product {
    
    //Properties
   
    private String author;
    

    // Constructors
    
    public Book(String title, String author, String genre, int rating, double cost, int stock) {
       super(title, genre, rating, cost, stock);
       this.author = author;
    }
    
    // Setters and Getters

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    
}

