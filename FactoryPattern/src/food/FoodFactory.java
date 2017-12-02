package food;

/**
 *
 * @author joaov
 */
public class FoodFactory {
    public static Food getFood(String animal) {
        switch (animal) {
            case "Polar Bear":
                return new Fish(10);
            case "Zebra":
                return new Hay(5);
        }
        
        throw new IllegalArgumentException("Invalid animal.");
    }
}