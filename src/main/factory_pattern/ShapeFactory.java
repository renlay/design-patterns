package factory_pattern;

public class ShapeFactory {

    public Shape getShape( String shape ) {
        if( null == shape ) {
            return null;
        }

        if( shape.equalsIgnoreCase( Shape.circle ) ) {
            return new Circle();
        } else if( shape.equalsIgnoreCase( Shape.rectangle )) {
            return new Rectangle();
        }

        return null;
    }
}
