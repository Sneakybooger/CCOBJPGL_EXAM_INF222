package Places;
import Travelerer.Tourist;

public class Cebu implements Locations {

    public int airFare = 200;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}