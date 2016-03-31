package abstract_factory_pattern;

public class CheeseCake implements Pastry {

    private static String name = Pastry.cheesecake;

    @Override
    public void bake() {
        System.out.println( "Baking " + name + "!!!" );
    }

}
