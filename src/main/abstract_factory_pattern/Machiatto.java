package abstract_factory_pattern;


public class Machiatto implements Coffee{
    
    private static String name = Coffee.machiatto;

    @Override
    public void brew() {
        System.out.println( "Brewing " + name + "!!!" );
    }
    
}
