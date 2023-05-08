package Travelers;
import Places.*;

public class Kurt implements Tourist {

    static int budget = 1000;
    int fare;

    public void visit() {
        if (budget >= fare){
            budget = budget - fare;
            checkBudget();
           System.out.println("Enjoying my stay ;)");
           System.out.println("I have enough budget to visit another place! :D");
        }else if(budget <= fare){
         System.out.println("\nMy funds is not enough for the airfare :C \nI cant visit the next place :(");
         System.out.println("My budget is " + budget + " and the airfare is " + fare);
         System.exit(0);
        }else{
            System.out.println("I am out of funds x_x");
            System.exit(0);
        }
    }

    public void visit(Boracay boracay) {
        fare = boracay.airFare;
        System.out.println("Welcome to Boracay!");
        visit();   
        System.out.println("\nAttempting to visit the next place.....");           
    }

    public void visit(Palawan palawan) {
        fare = palawan.airFare; 
        System.out.println("\nWelcome to Palawan!");
        visit();       
        System.out.println("\nAttempting to visit the next place.....");      
    }

    public void visit(Batanes batanes) {
        fare = batanes.airFare;        
        System.out.println("\nWelcome to Batanes!");           
        visit();
        System.out.println("\nAttempting to visit the next place.....");
    }

    public void visit(Cebu cebu) {
        fare = cebu.airFare;      
        System.out.println("\nWelcome to Cebu!");      
        visit();           
        System.out.println("\nAttempting to visit the next place....."); 
    }

    public void visit(Intramuros intramuros) {
        fare = intramuros.airFare;       
        System.out.println("\nWelcome to Intramuros!");        
        visit();         
        System.out.println("\nAttempting to visit the next place.....");
    }

    public void visit(Siargao siargao) {
        fare = siargao.airFare;
        visit();
        System.out.println("\nAttempting to visit the next place....."); 
        System.out.println("\nWelcome to Siargao!");        
                    
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }
}