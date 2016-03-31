package abstract_factory_pattern;


public class Espresso implements Coffee{

    private static String name = Coffee.espresso;

    @Override
    public void brew() {
        System.out.println( "Brewing " + name + "!!!" );
    }
}
