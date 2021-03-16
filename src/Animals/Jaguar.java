package Animals;

public class Jaguar extends Feline{

    private final boolean isBlack;
    private final String nativeTo;



    public Jaguar(boolean isBlack, String nativeTo, String mythology, String purr, String meow) {
        super(mythology, purr, meow);


        this.isBlack = isBlack;
        this.nativeTo = nativeTo;
    }

    public void printIsBlackStatus() {
        System.out.println("Is this jaguar black: " + isBlack);
    }

    public void printMeow() {
        System.out.println("Let's hear a jaguar meow: ROAR!");
    }




    public void printDetails() {
        printMeow();
        printPurr();
        printMythology();
        printIsBlackStatus();
    }

    private String getIsBlackStatus() {
        if (isBlack) {
            return "No";
        } else {
            return "Yes";
        }
    }

}
