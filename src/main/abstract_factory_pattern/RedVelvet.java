package abstract_factory_pattern;


public class RedVelvet implements Pastry{

    private static String name = Pastry.redvelvet;
    
    @Override
    public void bake() {
        System.out.println( "Baking " + name + "!!!" );
    }

}
