public class KitchenTool {

    public static void main(String[] args) {

        KitchenTool k = new Knife();
        k.isSharp = false;
        System.out.println(k.getSharp());
    }






    KitchenTool() {

    }

    public Boolean getSharp() {
        return isSharp;
    }

    public Boolean isSharp;
    public Boolean isClean;




}

