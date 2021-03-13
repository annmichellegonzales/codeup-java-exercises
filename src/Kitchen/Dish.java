package Kitchen;

public class Dish {

    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public Dish() {
        this.costInCents = 1399;
        this.nameOfDish = "Chicken Gyro Platter";
        this.wouldRecommend = true;
    }


    public void printSummary() {
        System.out.printf("Cost: %d%nName: %s%nRecommended: %b", this.costInCents, this.nameOfDish, this.wouldRecommend);
    }


    public int getCostInCents() {
        return costInCents;
    }


    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }


    public String getNameOfDish() {
        return nameOfDish;
    }


    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }


    public boolean getWouldRecommend() {
        return wouldRecommend;
    }


    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }
}

//public class Kitchen.Dish {
//
//    private int costInCents;
//    private String nameOfDish;
//    private boolean wouldRecommend;
//    private static int AVERAGE_COST_OF_DISH_IN_CENTS;
//
//    public Kitchen.Dish(costInCents, String nameOfDish, boolean wouldRecommend) {
//        this.costInCents = 1499;
//        this.nameOfDish = "Chicken Gyro Platter";
//        this.wouldRecommend = true;
//        this.AVERAGE_COST_OF_DISH_IN_CENTS = 1300;
//
//
//    }
//
//
//    public String whatsInDish() {
//        if (nameOfDish.equals("Chicken Gyro Platter")) {
//            return "chicken";
//        }
//    }
//    public boolean shareWouldRecommend() {
//        return wouldRecommend;
//    }
//


//    public void printSummary() {
//        System.out.printf("Cost: %d \nName: %s \nRecommend: %b",
//                costInCents, nameOfDish, wouldRecommend);
//
//    }



