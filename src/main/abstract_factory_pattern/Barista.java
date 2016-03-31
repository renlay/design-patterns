package abstract_factory_pattern;

public class Barista extends CoffeeShopAbstractFactory{

    @Override
    public Coffee getCoffee( String coffee ) {
        if( null == coffee ) {
            return null;
        }

        if( coffee.equalsIgnoreCase( Coffee.cafelatte ) ) {
            return new CafeLatte();
        } else if( coffee.equalsIgnoreCase( Coffee.espresso ) ) {
            return new Espresso();
        } else if( coffee.equalsIgnoreCase( Coffee.machiatto ) ) {
            return new Machiatto();
        }

        return null;
    }

    @Override
    Pastry getPastry( String pastry ) {
        return null;
    }

}
