package abstract_factory_pattern;


public class Menu {
    
    public void show(){
        System.out.println( "      [ BOHDI's ]      " );
        System.out.println( "---=== [ MENU ] ===---" );
    }

    public void showCoffeeMenu(){        
        System.out.println( "    --- Coffee ---" );
        System.out.println( "a." + Coffee.cafelatte );
        System.out.println( "b." + Coffee.espresso );
        System.out.println( "c." + Coffee.machiatto );        
    }
    
    public void showPastryMenu(){
        System.out.println( "    --- Pastries ---" );
        System.out.println( "d." + Pastry.cheesecake );
        System.out.println( "e." + Pastry.lemonbar );
        System.out.println( "f." + Pastry.redvelvet );
    }
    
}
