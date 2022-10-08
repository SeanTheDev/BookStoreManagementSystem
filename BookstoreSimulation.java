/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rowanseanproject1;
import java.util.*;

/**
 *
 * @author seanrowan
 */
public class BookstoreSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bookstore seansBookstore = new Bookstore();
       
        Scanner console = new Scanner(System.in);
        
        //Display Menu and Get Input
        System.out.println("-----------------------------------------------");
        System.out.println(" Welcome to Sean's Bookstore!                  ");
        seansBookstore.displayMenuOptions();
        String input = console.next();

        
        //Loop Menu Options
        while (!input.equals("-1")){
            
            switch (input){
                case "1":
                    seansBookstore.makePurchase();
                    break;
                case "2":
                    seansBookstore.displayMembers();
                    seansBookstore.addNewMember(console);
                    break;
                case "3":
                    seansBookstore.displayCart();
                    seansBookstore.checkout(console);
                    break;
                default:
                    System.out.println("Please enter a valid selection.\n");
            }
            
            seansBookstore.displayMenuOptions();
            input = console.next();
            
        }
       

        
    }
    
}
