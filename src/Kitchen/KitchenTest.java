package Kitchen;

public class KitchenTest {

    public static void main(String[] args) {

        KitchenTool k = new Knife();
        k.isSharp = true;
        System.out.println(k.getSharp());
        k.numberOf = 4;
        System.out.println(k.getNumberOf());
        k.wash();

        KitchenTool p = new Plate();
        p.isSharp = false;
        System.out.println(p.getSharp());
        p.numberOf = 5;
        System.out.println(p.getNumberOf());
        p.wash();

        Ingredient pb = new PeanutButter();
        pb.throwAway();

        Ingredient j = new Jelly();
        j.throwAway();
        System.out.println(j.getCalories());
//        j.calories = 125;
//        System.out.println(j.calories);


        Ingredient b = new Bread();
        b.throwAway();
    }

}
