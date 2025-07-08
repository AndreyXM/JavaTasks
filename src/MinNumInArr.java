import java.util.Arrays;

public class MinNumInArr {
    public static void main(String[] args) {
        int[] testArray1 = {4, 1, 2, 3};

        System.out.println("testArray1 = " + Arrays.toString(testArray1));
        System.out.println("(Ver1) min num in array is -> " + getMinFromArray1(testArray1));
        System.out.println("(Ver2) min num in array is -> " + getMinFromArray2(testArray1));

        int[] testArray2 = {9, 78, -1, 57};
        System.out.println("testArray2 = " + Arrays.toString(testArray2));
        System.out.println("(Ver1) min num in array is -> " + getMinFromArray1(testArray2));
        System.out.println("(Ver2) min num in array is -> " + getMinFromArray2(testArray2));

    }

    public static int getMinFromArray1(int[] inArr){
        if (inArr == null || inArr.length == 0 ) return 0;

        Arrays.sort(inArr);
        return inArr[0];
    }

    public static int getMinFromArray2(int[] inArr){
        if (inArr == null || inArr.length == 0 ) return 0;

        int min = inArr[0];

        for (int i = 1; i < inArr.length; i++) {
           if (inArr[i] < min) min = inArr[i];
        }
        return min;
    }
}
