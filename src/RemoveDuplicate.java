import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        System.out.println(removeDuplicate("AAABBCCCD"));
        System.out.println(removeDuplicate(" "));
        System.out.println(removeDuplicate(null));

    }

    public static String removeDuplicate(String inputString) {
       if (inputString == null ||  inputString.isBlank()) return "";

        Set<String> returnSet = new TreeSet<>();
        for (int i = 0; i < inputString.length(); i++) {
            returnSet.add(inputString.substring(i, i + 1));
        }

        return String.join("", returnSet);
    }
}
