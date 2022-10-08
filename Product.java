/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rowanseanproject1;

/**
 *
 * @author seanrowan
 */
public class Product {
    
    //properties
    public String title;
    public String genre;
    public int rating;
    public int stock;
    public double cost;
    
    
    //constructors
    public Product(String title, String genre, int rating, double cost, int stock) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.stock = stock;
        this.cost = cost;
    }
    
    
    
    //methods
    
    
    
    
    
    //setters and getters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void decrementStock(){
        this.stock--;
    }
    
    
    
    
}
