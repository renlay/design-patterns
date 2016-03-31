package abstract_factory_pattern;


public class LemonBar implements Pastry{

    private static String name = Pastry.lemonbar;
    
    @Override
    public void bake() {
        System.out.println( "Baking " + name + "!!!" );
    }

}
