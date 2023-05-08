package Travelers;
import Places.*;
public interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);
    void visit (Palawan palawan);
    void visit (Batanes batanes);
    void visit (Cebu cebu);
    void visit (Intramuros intramuros);
    void visit (Siargao siargao);


    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}