package food;

/**
 *
 * @author joaov
 */
public class ZooKeeper {
    public static void main(String[] args) {
        Food food = FoodFactory.getFood("Polar Bear");
        
        food.consumed();
    }
}