public class ReverseString {
    public static void main(String[] args) {

        String giveStr = "ABCD1234";
        String reversStr1 = reverseString1(giveStr);
        String reversStr2 = reverseString2(giveStr);

        System.out.println("giveStr = " + giveStr);
        System.out.println("reversStr1 = " + reversStr1);
        System.out.println("reversStr2 = " + reversStr2);
    }

    public static String reverseString1(String text){
        if(text == null || text.isEmpty()) return "";

        StringBuilder str = new StringBuilder();

        for (int i = text.length()-1; i >= 0 ; i--) {
            str.append(text.charAt(i));
        }

        return str.toString();
    }

    public static String reverseString2(String text){
        if(text == null || text.isEmpty()) return "";

        StringBuilder str = new StringBuilder(text);
        str.reverse();

        return str.toString();
    }
}
