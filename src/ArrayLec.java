import java.util.Arrays;

public class ArrayLec {

    public static void main(String[] args) {

        fillArray();

//        compareStringArrays();

//        String[] stringArray;
//
//        stringArray = new String[2];
//
//        stringArray[0] = "Ann";
//        stringArray[1] = "Gonzales";
//
//        System.out.println(Arrays.toString(stringArray));
//
//        stringArray[0] = "Michelle";
//        System.out.println(Arrays.toString(stringArray));
//
////        System.out.println(Arrays.toString(getStringArray()));
//
//        fillArray(getByteArray());

    }

    public static byte[] getByteArray(){
        return new byte[5];
    }

    public static String[] getStringArray(){
        return new String[5];
    }

    public static void fillArray(byte[] arr){
        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr, (byte)1);

        System.out.println(Arrays.toString(arr));
    }


    public static void fillArray(){
        int[] intArr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(intArr));
    }

    public static String[] fillStringArray(String[] arr) {
        Arrays.fill(arr, "thing");
        return arr;
    }

    public static void compareStringArrays(){
        String[] arr1 = fillStringArray(getStringArray());


        String[] arr2 = fillStringArray(getStringArray());

        arr1[0] = "not thing";
//        printArray(arr1);
//        printArray(arr2);
//        System.out.println(Arrays.equals(arr1, arr2));
    }


}
