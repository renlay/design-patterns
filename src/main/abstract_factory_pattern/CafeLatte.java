package abstract_factory_pattern;

public class CafeLatte implements Coffee {

    private static String name = Coffee.cafelatte;

    @Override
    public void brew() {
        System.out.println( "Brewing " + name + "!!!" );
    }

}
