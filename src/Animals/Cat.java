package Animals;

public class Cat extends Feline{

    private final String furLength;

    public Cat(String mythology, String purr, String meow, String furLength) {
        super(mythology, purr, meow);
        this.furLength = furLength;
    }


    public void printEmote() {
        System.out.println("*plays with string* >^.^< \n");
    }

    public void printMeow() {
        System.out.println("MEEEEOOOOWW >^.^<");
    }



    public void printDelimiter() {
        System.out.println("****************************");
    }


    public void printFurLength() {
        System.out.printf("Fur Length: %s\n", this.furLength);
    }

    public void printDetails() {
        printEmote();
        printDelimiter();
        printFurLength();
        printDelimiter();
    }
}

