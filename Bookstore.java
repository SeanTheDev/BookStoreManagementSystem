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
public class Bookstore {
    
    //create a system that allows a bookstore owner to keep track of their inventory and members.

    /**
         *
         * Products: Books, CDs, DVDs
         *
         * Memberships: Regular (free), Premium (monthly fee)
         *
         * Key Details:
         *
         *   - (subscriptions) The store keeps track of payment method for their premium members
         *   and whether the monthly fee is due or has been paid.
         *
         *  - (profits) The system should keep track of the members and how much money each
         *   has spent at the store regardless if they are regular or premium members.
         *
         *  - (inventory) The system also keeps track of the inventory of each product.
         *
         *  3 Distinct functionalities:
         *
         *  1) Complete a purchase (1 or more items, deducted from inventory)
         *      - Capture payment details
         *      - Count number of items in cart
         *  
         *  2) Search Book Titles (By Genre, author, etc.)
         * 
         *  3) Manage Account (Subscribe / Unsubscribe)
         *      -  Log-in system
         *
         *  - Rating system (stars, comments)
         *
         */
    
    
    //Attributes
    public ArrayList<Book> bookInventory = new ArrayList<>();
    public ArrayList<CD> cdInventory = new ArrayList<>();
    public ArrayList<DVD> dvdInventory = new ArrayList<>();
    public ArrayList<Member> members = new ArrayList<>();
    public ArrayList<Product> cart = new ArrayList<>();
    
    
    
    // Constructors

    public Bookstore() {
    
        // Create Products & add to Inventory
        generateInventory();
        
        // Generate members
        generateMembers();

    }
    
    
    //Methods
    private void generateInventory(){
        
        //Generate Products
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 4, 25, 3);
        Book book2 = new Book("Lord of The Flies", "William Golding", "Fiction", 5, 13, 3);
        Book book3 = new Book("Think and Grow Rich", "Napoleon Hill", "SelfHelp", 5, 30, 3);
        
        CD cd1 = new CD("Watch the Throne", "Jay-Z and Kanye", "Hip-Hop", 5, 12.99, 3);
        CD cd2 = new CD("Anything in Return", "Toro y Moi", "Electronic", 5, 6.99, 3);
        CD cd3 = new CD("Aktive", "Jay Worthy and LNDN DRGS", "Hip-Hop", 5, 1.99, 3);
        
        DVD dvd1 = new DVD("Titanic", "Steven Speilberg", "Romance", 5, 20.99, 3);
        DVD dvd2 = new DVD("The Wolf of Wall Street", "Martin Scorzese", "Realistic", 5, 20.99, 3);
        DVD dvd3 = new DVD("Spiderman", "Marvel Studios", "Action", 4, 13.99, 3);
        
        //Add products to inventory
        bookInventory.add(book1);
        bookInventory.add(book2);
        bookInventory.add(book3);
        
        cdInventory.add(cd1);
        cdInventory.add(cd2);
        cdInventory.add(cd3);
    
        dvdInventory.add(dvd1);
        dvdInventory.add(dvd2);
        dvdInventory.add(dvd3);
        
    }
    
    private void generateMembers(){
        //generate members
        Member m1 = new Member("Joe Johnson", "Fiction & Classical", true);
        Member m2 = new Member("Mary Beth", "NonFiction", true);
        Member m3 = new Member("James Jones", "True Crime", false);
        Member m4 = new Member("Daniel McDaniels", "Drama", false);
        
        //add members to members list
        members.add(m1);
        members.add(m2);
        members.add(m3);
        members.add(m4);
    }
    
    public void displayMenuOptions(){
        //Display menu options
        System.out.println("\n Enter a Menu Option Below or Enter '-1' to Exit ");
        System.out.println("---------------------------------------------------");
        System.out.println(" 1. Make A Purchase\n 2. Manage Account\n 3. View Cart\n");
    }
   
    public void makePurchase(){
            
        // Displays the books, cds, dvds, along with their information
        int itemNum = 0;

        System.out.println("\nBooks");
        System.out.println("-----------------");
        for (Book e : bookInventory){
            itemNum++; 
            System.out.println(itemNum + ") " + e.getTitle() + " | Rating: (" + e.getRating() + "/5)" + " | $" + e.getCost() + " | Stock: " + e.getStock());
        }

        System.out.println("\nCDs");
        System.out.println("-----------------");
        for (CD e : cdInventory){
            itemNum++;
            System.out.println(itemNum + ") " + e.getTitle() + " | Rating: (" + e.getRating() + "/5)" + " | $" + e.getCost() + " | Stock: " + e.getStock());
        }

        System.out.println("\nDVDs");
        System.out.println("-----------------");
        for (DVD e : dvdInventory){
            itemNum++;
            System.out.println(itemNum + ") " + e.getTitle() + " | Rating: (" + e.getRating() + "/5)" + " | $" + e.getCost() + " | Stock: " + e.getStock());
        }


        //Take item number, add to cart, and decrement stock
        //Includes error handling
        Scanner console = new Scanner(System.in);
        int input;
        boolean validInput = false;
           
            do {
                System.out.println("\nIf you would like to make a purchase, enter the item Number (or Any Other key to exit)");
                if (console.hasNextInt()){
                    input = console.nextInt();
                    validInput = true;
                   
                    if (input <= bookInventory.size()){
                        //Add element to cart & decrement stock by 1 (if stock is greater than 0)
                        if (bookInventory.get(input-1).getStock() > 0){
                            
                            this.cart.add(bookInventory.get(input-1));
                            bookInventory.get(input-1).decrementStock();
                            System.out.println("Item added to Cart!");
                            
                        }
                        else{System.out.println("Sorry, out of Stock!");}
                        
                    }
                    else if (input - bookInventory.size() <= cdInventory.size()){

                        //Add element to cart & decrement stock by 1
                        if (cdInventory.get(input - 1 - bookInventory.size()).getStock() > 0){
                            
                            this.cart.add(cdInventory.get(input - 1 - bookInventory.size()));
                            cdInventory.get(input - 1 - bookInventory.size()).decrementStock();
                            System.out.println("Item added to Cart!");
                            
                        }
                        else{System.out.println("Sorry, out of Stock!");}
                        
                    }
                    else{
                        
                        if (dvdInventory.get(input - 1 - bookInventory.size() - cdInventory.size()).getStock() > 0){
                            
                            //Add element to cart & decrement stock by 1
                            this.cart.add(dvdInventory.get(input - 1 - bookInventory.size() - cdInventory.size()));
                            dvdInventory.get(input - 1 - bookInventory.size() - cdInventory.size()).decrementStock();
                            System.out.println("Item added to Cart!");
                        }
                        else{System.out.println("Sorry, out of Stock!");}
                        
                    }
                    
                } else {validInput = true;}
                
            } while (validInput == false);
           
    }
    
    public void checkout(Scanner console){
        
        //Ask to checkout
        System.out.println("Would  you like to check out? (Y/N)");
        String input = console.next();
        
        //If yes, then add cost of cart to member ID
        if (input.equalsIgnoreCase("Y")) {
            System.out.println("Please select you Member ID:");
            displayMembers();
            int num = console.nextInt();
            for (int i = 0; i < cart.size(); i++){
               members.get(num-1).addTotalSpent(cart.get(i).cost);
            }
            
            System.out.println("Cha-Ching!");
            System.exit(0);
            
        }
    }
    
    public void displayMembers(){
        
        //Displays member list with Premium status
        int ID = 0;
        System.out.println("Members List:");
        System.out.println("---------------------");
        for (Member m : members){
            ID++;
            System.out.println(ID + " | " + m.fullName + "| Premium: " + m.isPremium);
        }
        System.out.println("");
        
    }
    
    public void displayCart(){
        
        //Displays cart contents and total price
        System.out.println("Cart (" + cart.size() + ")");
        System.out.println("---------------");
        double total = 0;
        for (int i = 0; i < cart.size(); i++){
            System.out.println(cart.get(i).title);
            total += cart.get(i).cost;
        }
        System.out.println("-------------------");
        System.out.println("Total: $" + total);
    }
    
    public void addNewMember(Scanner console){
        
        //ASks user to add new member to list
        System.out.println("Would  you like to add a new member? (Y/N)");
        String input = console.next();
        
        if (input.equalsIgnoreCase("Y")) {
            
            Member newMem = new Member();
            
            System.out.println("Please Enter Your Name:");
            input = console.nextLine();
            input = console.nextLine();
            newMem.fullName = input;
            
            System.out.println("Would you like to subscribe for a Premium Membership for $10 a month? (Y/N)");
            input = console.next();
            if (input.equalsIgnoreCase("Y")){
                newMem.isPremium = true;
            }
            
            members.add(newMem);
            System.out.println("You have been added to the membership list!\n");
            
        }
        
    }
    
    
    
    // Setters & Getters
    
    
            
    public ArrayList<Book> getBookInventory() {
        return bookInventory;
    }

    public void setBookInventory(ArrayList<Book> bookInventory) {
        this.bookInventory = bookInventory;
    }

    public ArrayList<CD> getCdInventory() {
        return cdInventory;
    }

    public void setCdInventory(ArrayList<CD> cdInventory) {
        this.cdInventory = cdInventory;
    }

    public ArrayList<DVD> getDvdInventory() {
        return dvdInventory;
    }

    public void setDvdInventory(ArrayList<DVD> dvdInventory) {
        this.dvdInventory = dvdInventory;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> regularMembers) {
        this.members = regularMembers;
    }
    
    public ArrayList<Product> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Product> Cart) {
        this.cart = Cart;
    }

}
