package Places;

import Travelerer.Tourist;

public class Palawan implements Locations {

     public int airFare = 500;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}