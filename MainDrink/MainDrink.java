package MainDrink;

// MainDrink.java
public class MainDrink {
    public static void main(String[] args) {
        // 1️⃣ Creamos algunas bebidas
        Drink cocaCola = new Drink("Coca-Cola", "Gaseosa", "350ml");
        Drink pepsi = new Drink("Pepsi", "Gaseosa", "400ml");
        Drink redBull = new Drink("Red Bull", "Energética", "250ml");

        // 2️⃣ Creamos el formateador
        DrinkFormatter formatter = new DrinkFormatter();

        // 3️⃣ Creamos los "savers" (responsables de salida)
        DrinkSaver consolePrinter = new ConsoleDrinkPrinter();
        DrinkSaver fileSaver = new FileDrinkSaver("drinks.txt");

        // 4️⃣ Mostramos y guardamos cada bebida
        consolePrinter.save(formatter.format(cocaCola));
        consolePrinter.save(formatter.format(pepsi));
        consolePrinter.save(formatter.format(redBull));

        fileSaver.save(formatter.format(cocaCola));
        fileSaver.save(formatter.format(pepsi));
        fileSaver.save(formatter.format(redBull));

        System.out.println("🎉 Proceso completado correctamente.");
    }
}
