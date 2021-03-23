package prep;

import java.util.List;

public class Arithmetic {

    public  int square;
    public int sum;
    public int difference;
    public int product;
    public int average;

    public Arithmetic(int square, int sum, int difference, int product, int average) {
        this.square = square;
        this.sum = sum;
        this.difference = difference;
        this.product = product;
        this. average = average;
    }



    public static int sum(int[] numbers){
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static int square(int num) {
        return num * num;
    }

    public static int difference(int num1, int num2) {
        return num1 - num2;
    }

    public static int product(int num1, int num2) {
        return num1 * num2;
    }

    public static double average(int[] numbers) {
        int sum = sum(numbers);
        return (double) sum / numbers.length;
    }


}