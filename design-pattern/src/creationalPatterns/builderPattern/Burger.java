package creationalPatterns.builderPattern;

import java.math.BigDecimal;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Box();
    }

}
