public class SwapNumbers {
    public static void main(String[] args) {
       //SWAP NUMBERS
       //Swap 2 numbers without creating a 3rd variable

        System.out.println("Example #1");
        int a = 10;
        int b = 20;

        System.out.println("The numbers before swapping are:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("The numbers after swapping are:");;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("~~~~~~~~~~~~~~~~~~");


        System.out.println("Example #2");
        int c = 9;
        int d = 4;

        System.out.println("The numbers before swapping are:");
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        c = c * d;
        d = c / d;
        c = c / d;

        System.out.println("The numbers after swapping are:");;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}


