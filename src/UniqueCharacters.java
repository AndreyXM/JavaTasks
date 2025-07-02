
public class UniqueCharacters {
    public static void main(String[] args) {
        String exampleStr = "AAALBBBNNCCMCDEF";
        String uniqueStr = getUniqueChars(exampleStr);

        System.out.println("exampleStr = " + exampleStr);
        System.out.println("uniqueStr = " + uniqueStr);
    }

    public static String getUniqueChars(String inStr) {
        if(inStr == null || inStr.isEmpty()) return "";

        StringBuilder uniqueStr = new StringBuilder();

        for (int i = 0; i < inStr.length(); i++) {
            char ch = inStr.charAt(i);
            if (isCharUnique(inStr, ch)) uniqueStr.append(ch);
        }
        return uniqueStr.toString();
    }

    public static boolean isCharUnique(String inStr, char ch) {
        if(inStr == null || inStr.isEmpty()) return false;

        int chCnt = 0;
        for (int i = 0; i < inStr.length(); i++) {
            if (inStr.charAt(i) == ch) chCnt++;
            if (chCnt > 1) break;
        }
        return (chCnt == 1);
    }

}
