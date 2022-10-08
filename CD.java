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
public class CD extends Product {
    
    //Properties
   
    private String artist;
    
    // Constructors
    
    public CD(String title, String artist, String genre, int rating, double cost, int stock) {
        super(title, genre, rating, cost, stock);
        this.artist = artist;
    }
    
    // Setters and Getters


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }    
    
    
}
