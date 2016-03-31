package factory_pattern;


public class FactoryPatternDemo {
    
    public static void main( String args[] ){
        ShapeFactory factory = new ShapeFactory();
        
        Shape currentShape = factory.getShape( Shape.circle );
        currentShape.draw();
        
        currentShape = factory.getShape( Shape.rectangle );
        currentShape.draw();
    }
}
