import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {

        String[] adjectives = {"morose", "shadowy", "dark", "serene", "placid",
                "velvety", "black", "macabre", "ornate", "witchy"};

        String[] nouns = {"mortal", "ghost", "attic", "raven", "grave",
                "shroud", "midnight", "despair", "spectre", "castle"};

        int idxAdj = new Random().nextInt(nouns.length);
        String randomAdj = (adjectives[idxAdj]);

        int idxNoun = new Random().nextInt(nouns.length);
        String randomNoun = (nouns[idxNoun]);

        System.out.println("Here is your server name: " + randomAdj + "-" + randomNoun);

    }
}
