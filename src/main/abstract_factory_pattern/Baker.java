package abstract_factory_pattern;

public class Baker extends CoffeeShopAbstractFactory{

    @Override
    public Pastry getPastry( String pastry ) {
        if( null == pastry ) {
            return null;
        }

        if( pastry.equalsIgnoreCase( Pastry.cheesecake ) ) {
            return new CheeseCake();
        } else if( pastry.equalsIgnoreCase( Pastry.lemonbar ) ) {
            return new LemonBar();
        } else if( pastry.equalsIgnoreCase( Pastry.redvelvet ) ) {
            return new RedVelvet();
        }

        return null;
    }

    @Override
    Coffee getCoffee( String coffee ) {
        return null;
    }
}
