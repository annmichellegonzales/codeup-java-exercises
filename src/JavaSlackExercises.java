public class JavaSlackExercises {

    public static void main(String[] args) {
        System.out.println(firstChar("word"));
        System.out.println(secondChar("input"));
        System.out.println(lastChar("lastChar"));
        System.out.println(secondToLast("asdfasdf"));
        System.out.println(userWantsToContinue("no"));
        System.out.println(isEven(5));
        System.out.println(isOdd(3));
//        System.out.println(countOdds(1, 9));
        System.out.println(isVowel("a"));
        System.out.println(hasVowels(""));
        System.out.println(sum(10));

    }

    public static char firstChar(String input) {

        return input.charAt(0);
    }

    public static char secondChar(String input) {
        return input.charAt(1);
    }

    public static char lastChar(String input) {
        return input.charAt(input.length() - 1);

    }

    public static char secondToLast(String input) {
        return input.charAt(input.length() - 2);
    }

    public static boolean userWantsToContinue(String input) {
        return input == "yes" || input == "y";
    }

    public static boolean isEven(int input) {
        return input % 2 != 0;
    }

    public static boolean isOdd(int input) {
        return input % 2 == 0;
    }

//    public static int countOdds(int start, int end) {
//        for (int i = start; i <= end; i++){
//            if(i % 2 == 0) {
//                return i;
//            }else {
//                return 0;
//            }
//        }
//        return i;
//
//    }

    public static boolean isVowel(String input) {
        return input.equalsIgnoreCase("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u");

    }

    public static boolean hasVowels(String input) {
        return input.contains("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u");
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

}
