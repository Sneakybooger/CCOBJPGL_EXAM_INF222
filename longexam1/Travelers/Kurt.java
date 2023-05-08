package Travelers;
import Places.*;

public class Kurt implements Tourist {

    static int budget = 1000;
    int fare;

    public void visit() {
        if (budget >= fare){
            budget = budget - fare;
           System.out.println("Enjoying my stay ;)");
           checkBudget();
        }
    }

    public void visit(Boracay boracay) {
        fare = boracay.airFare;
        if(budget < fare){
          System.out.println("\n**Can't afford the airfare to Boracay**");
          System.out.println("____________________________________________");
        }else{
        System.out.println("Welcome to Boracay!");  
        visit();  
        System.out.println("____________________________________________");
        }
        System.out.println("\nVisiting another place...");     
        System.out.println("____________________________________________");      
    }

    public void visit(Palawan palawan) {
        fare = palawan.airFare; 
        if(budget < fare){
            System.out.println("\n**Can't afford the airfare to Palawan**");
            System.out.println("____________________________________________");
          }else{
          System.out.println("\nWelcome to Palawan!"); 
          visit(); 
          System.out.println("____________________________________________");
          }
          System.out.println("\nVisiting another place...");    
          System.out.println("____________________________________________");
    }

    public void visit(Batanes batanes) {
        fare = batanes.airFare;        
        if(budget < fare){
            System.out.println("\n**Can't afford the airfare to Batanes**");
            System.out.println("____________________________________________");
          }else{
          System.out.println("\nWelcome to Batanes!");  
          visit();  
          System.out.println("____________________________________________");
          }
          System.out.println("\nVisiting another place...");    
          System.out.println("____________________________________________");
    }

    public void visit(Cebu cebu) {
        fare = cebu.airFare;      
        if(budget < fare){
            System.out.println("\n**Can't afford the airfare to Cebu**");
            System.out.println("____________________________________________");
          }else{
          System.out.println("\nWelcome to Cebu!");  
          visit();  
          System.out.println("____________________________________________");
          }
          System.out.println("\nVisiting another place...");  
          System.out.println("____________________________________________");  
    }

    public void visit(Intramuros intramuros) {
        fare = intramuros.airFare;       
        if(budget < fare){
            System.out.println("\n**Can't afford the airfare to Intramuros**");
            System.out.println("____________________________________________");
          }else{
          System.out.println("\nWelcome to Intramuros!");  
          visit();  
          System.out.println("____________________________________________");
          };
          System.out.println("\nVisiting another place..."); 
          System.out.println("____________________________________________");   
    }

    public void visit(Siargao siargao) {
        fare = siargao.airFare;
        if(budget < fare){
            System.out.println("\n**Can't afford the airfare to Siargao**");
            System.out.println("____________________________________________");
          }else{
          System.out.println("\nWelcome to Siargao!");  
          visit();  
          System.out.println("____________________________________________");
          }   
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
        if(budget <= 0){
            System.out.println("OUT OF FUNDS X_X");
            System.exit(0);
        }else{
            System.out.println("I still have money to visit another place! :D");
        }
    }
}