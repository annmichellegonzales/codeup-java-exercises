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



    public static int square(int num){
        return num * num;
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int difference(int num1, int num2) {
        return num1 - num2;
    }

    public static int product(int num1, int num2) {
        return num1 * num2;
    }

    public static double average(List<Integer> nums) {
        double sum1 = 0;
        if(!nums.isEmpty()) {
            for (double num : nums) {
                sum1 += num;
            }
            return sum1/nums.size();
        }
        return sum1;
    }

}