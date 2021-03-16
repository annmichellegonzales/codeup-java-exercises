package Animals;

public abstract class Feline implements Describable {


    protected final String mythology;
    protected final String purr;
    protected final String meow;


    public Feline(String mythology, String purr, String meow) {
        this.mythology = mythology;
        this.purr = purr;
        this.meow = meow;
    }

    public abstract void printMeow();


    public void printMythology() {
        System.out.printf("Mythology: %s\n", this.mythology);
    }

    public void printPurr() {
        System.out.printf("Purr: %s\n", this.purr);
    }




}
