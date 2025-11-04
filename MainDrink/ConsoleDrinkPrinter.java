package MainDrink;

// ConsoleDrinkPrinter.java
public class ConsoleDrinkPrinter implements DrinkSaver {
    // Su única responsabilidad es mostrar la bebida en consola
    @Override
    public void save(String formattedDrink) {
        System.out.println(formattedDrink);
    }
}
