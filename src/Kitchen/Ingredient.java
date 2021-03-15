package Kitchen;

public class Ingredient {

    public Ingredient() {

    }


    private int calories = 125;
//    private int calories;

//    public Ingredient(int calories) {
//        this.calories = calories;
//    }

    public void throwAway() {
        System.out.println("Throwing away ingredient...");
    }

    protected int getCalories() {
        return calories;
    }

}