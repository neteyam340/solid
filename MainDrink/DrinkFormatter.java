package MainDrink;

// DrinkFormatter.java
public class DrinkFormatter {
    // Su única responsabilidad es dar formato a los datos de la bebida
    public String format(Drink drink) {
        return String.format("🥤 %s (%s) - Tamaño: %s", 
                drink.getName(), drink.getType(), drink.getSize());
    }
}

