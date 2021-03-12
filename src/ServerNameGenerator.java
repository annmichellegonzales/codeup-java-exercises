import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {

        String[] adjectives = {"morose", "shadowy", "dark", "serene", "placid",
                "velvety", "black", "macabre", "ornate", "witchy"};

        String[] nouns = {"fortress", "ghost", "attic", "raven", "grave",
                "shroud", "midnight", "despair", "spectre", "castle"};


        int idxAdj = new Random().nextInt(adjectives.length);
        String randomAdj = (adjectives[idxAdj]);

        int idxNoun = new Random().nextInt(nouns.length);
        String randomNoun = (nouns[idxNoun]);

        System.out.println("Welcome, mortal, to the ^v^ " + randomAdj + "-" + randomNoun + " ^v^ server.");

    }
}



////SERVERNAME GENERATOR
//public class ServerNameGenerator {
//    public static String[] adjectives = {"funny", "lackadaisical", "prompt", "fastidious", "prickly", "amazing", "incredible", "outdated", "pristine", "comical"};
//    public static String[] nouns = {"desk", "guitar", "house", "volkswagen", "lawnmower", "duck", "chair", "poster", "event", "candle"};
//    public static void main(String[] args) {
//        System.out.println("Here is your server name:");
//        System.out.println(getWord(adjectives) + "-" + getWord(nouns));
//    }
//    public static String getWord(String[] choices) {
//        Random random = new Random();
//        int randomNumber = random.nextInt(choices.length);
//        return choices[randomNumber];
//    }
//}



