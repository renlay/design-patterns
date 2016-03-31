package abstract_factory_pattern;


public class FactoryProducer {
    public static CoffeeShopAbstractFactory getFactory( String option ){
        
        if( option.equalsIgnoreCase( Coffee.name )){
            return new Barista();
        } else if( option.equalsIgnoreCase( Pastry.name )){
            return new Baker();
        }
        
        return null;
    }
}
