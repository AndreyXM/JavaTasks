public class ReverseNegative {
    public static void main(String[] args) {

        System.out.println(reverseNegative(-1));
        System.out.println(reverseNegative(0));
        System.out.println(reverseNegative(23));
        System.out.println(reverseNegative(-456));

    }

    public static int reverseNegative(int num){
        // if num bigger or equal -9 just return this value
        // no reason to reverse
        if (num >= -9) return num;

        // convert int num to String str and remove the "-" sing by multiplying on -1
        String str = String.valueOf(num * -1);

        // declare and initialize the return variable String returnStr with "-" sign
        String returnStr = "-";

        // for loop from the last symbol of str to the first one
        for (int i = str.length()-1; i >=0; i--) {
            // adding symbols to the returnStr
            returnStr += str.substring(i,i+1);
        }

        // return the int value of returnStr
        return Integer.parseInt(returnStr);
    }
}
