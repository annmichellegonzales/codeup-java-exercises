public class JavaSlackExercises {

    public static void main(String[] args){
        System.out.println(firstChar("word"));
        System.out.println(secondChar("input"));
        System.out.println(lastChar("lastChar"));
        System.out.println(secondToLast("asdfasdf"));
        System.out.println(isOdd(3));

    }

    public static char firstChar(String input) {

        return input.charAt(0);
    }

    public static char secondChar(String input) {
        return input.charAt(1);
    }

    public static char lastChar(String input) {
        return input.charAt(input.length()-1);

    }

    public static char secondToLast(String input) {
        return input.charAt(input.length()-2);
    }

    public static boolean userWants

    public static boolean isOdd(int input) {
        return input % 2 == 0;

    }

}
