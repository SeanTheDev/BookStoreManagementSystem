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
public class Member {
    
    // Attributes
    public String fullName;
    public String favGenre;
    public double totalSpent;
    public boolean isPremium;
    public boolean isDuesPaid;
    public String paymentMethod;
   
    
    // Constructors
    public Member(){
       
    }
    
    public Member(String fullName, String favGenre, boolean isPremium) {
        this.fullName = fullName;
        this.favGenre = favGenre;
        this.isPremium = isPremium;
        this.totalSpent = 0;
       
    }
 
    
    //Methods
   
    
    
    //Setters & Getters

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFavGenre() {
        return favGenre;
    }

    public void setFavGenre(String favGenre) {
        this.favGenre = favGenre;
    }

    public double getTotalSpent() {
        return totalSpent;
    }

    public void addTotalSpent(double newCharge) {
        this.totalSpent = this.totalSpent + newCharge;
    }

    public boolean isIsPremium() {
        return isPremium;
    }

    public void setIsPremium(boolean isPremium) {
        this.isPremium = isPremium;
    }

    public boolean isIsDuesPaid() {
        return isDuesPaid;
    }

    public void setIsDuesPaid(boolean isDuesPaid) {
        this.isDuesPaid = isDuesPaid;
    }
    
    
}
