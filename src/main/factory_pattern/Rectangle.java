package factory_pattern;

public class Rectangle implements Shape {

    private static String name = Shape.rectangle;

    @Override
    public void draw() {
        System.out.println( "Drawing " + name + " object" );
    }

}
