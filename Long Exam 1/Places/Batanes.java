package Places;
import Travelerer.Tourist;

public class Batanes implements Locations {

    public int airFare = 250;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}