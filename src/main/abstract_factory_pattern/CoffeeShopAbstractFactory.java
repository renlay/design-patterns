package abstract_factory_pattern;

public abstract class CoffeeShopAbstractFactory {

    abstract Coffee getCoffee( String coffee );

    abstract Pastry getPastry( String pastry );
}
