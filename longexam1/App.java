import Places.*;
import Travelers.*;

public class App {
    public static void main(String[] args) throws Exception {

        // Long exam 1

        // 1. Add 5 new locations to visit
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod

        //Airfare
        //Boracay = 100
        //Palawan = 500
        //Cebu = 200
        //Batanes = 250
        //Intramuros = 50
        //Siargao = 200

        Locations boracay = new Boracay();
        Locations palawan = new Palawan();
        Locations cebu = new Cebu();
        Locations batanes = new Batanes();
        Locations intramuros = new Intramuros();
        Locations siargao = new Siargao();


        Tourist me = new Kurt();

        boracay.accept(me);
        palawan.accept(me);
        cebu.accept(me);
        batanes.accept(me);        
        intramuros.accept(me);
        siargao.accept(me);

        

    }
}
