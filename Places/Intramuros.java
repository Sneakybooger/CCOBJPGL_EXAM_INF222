package Places;
import Travelers.Tourist;

public class Intramuros implements Locations {

    public int airFare = 150;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}