public class Dish {

        public int costInCents;
        public String nameOfDish;
        public boolean wouldRecommend;
        public static int AVERAGE_COST_OF_DISH_IN_CENTS;
//

    public void printSummary() {
        System.out.printf("Cost: %d \nName: %s \nRecommend: %b",
                costInCents, nameOfDish, wouldRecommend);

    }


}
