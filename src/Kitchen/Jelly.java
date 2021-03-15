package Kitchen;

public class Jelly extends Ingredient{

    @Override
    public void throwAway() {
        System.out.println("Throwing away jelly...");
    }

    public int getCalories() {
        return super.getCalories();
    }

}
