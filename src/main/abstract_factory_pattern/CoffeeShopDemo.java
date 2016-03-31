package abstract_factory_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeShopDemo {

    public static void main( String[] args ) throws IOException {
        CoffeeShopAbstractFactory barista = FactoryProducer.getFactory( Coffee.name );
        Coffee coffee = null;

        CoffeeShopAbstractFactory baker = FactoryProducer.getFactory( Pastry.name );
        Pastry pastry = null;

        Menu menu = new Menu();
        menu.show();

        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        System.out.println( "[ Select menu ]" );
        System.out.println( "  1. Coffee" );
        System.out.println( "  2. Pastry" );
        System.out.println( "  3. Leave coffee shop" );
        
        String input;

        while( (input = br.readLine()) != null ) {
            switch( input ) {
                case "1":
                    menu.showCoffeeMenu();
                    break;
                case "2":
                    menu.showPastryMenu();
                    break;
                case "3":   
                    break;
                case "a":
                    coffee = barista.getCoffee( Coffee.cafelatte );
                    coffee.brew();
                    break;
                case "b":
                    coffee = barista.getCoffee( Coffee.espresso );
                    coffee.brew();
                    break;
                case "c":
                    coffee = barista.getCoffee( Coffee.machiatto );
                    coffee.brew();
                    break;
                case "d":
                    pastry = baker.getPastry( Pastry.cheesecake );
                    pastry.bake();
                    break;
                case "e":
                    pastry = baker.getPastry( Pastry.lemonbar );
                    pastry.bake();
                    break;
                case "f":
                    pastry = baker.getPastry( Pastry.redvelvet );
                    pastry.bake();
                    break;
                default:
                    System.out.println( "ERROR: Invalid input" );
                    break;
            }
            input = null;
        }

    }

}
