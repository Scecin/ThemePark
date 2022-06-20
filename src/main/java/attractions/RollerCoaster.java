package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() > 12 && visitor.getHeight() > 1.45;
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        double price = 0;
        if (visitor.getHeight()>2.00) {
            price = defaultPrice()*2;
        } else {
            price = defaultPrice();
        }
        return price;
    }
}
