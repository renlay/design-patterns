package factory_pattern;

public class Circle implements Shape {

    private static String name = Shape.circle;

    @Override
    public void draw() {
        System.out.println( "Drawing " + name + " object" );
    }
}
