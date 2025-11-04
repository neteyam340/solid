package MainDrink;

// FileDrinkSaver.java
import java.io.PrintWriter;

public class FileDrinkSaver implements DrinkSaver {
    private final String filename;

    public FileDrinkSaver(String filename) {
        this.filename = filename;
    }

    @Override
    public void save(String formattedDrink) {
        try (PrintWriter out = new PrintWriter(filename)) {
            out.println(formattedDrink);
            System.out.println("✅ Bebida guardada en el archivo: " + filename);
        } catch (Exception e) {
            System.err.println("⚠️ Error al guardar: " + e.getMessage());
        }
    }
}



