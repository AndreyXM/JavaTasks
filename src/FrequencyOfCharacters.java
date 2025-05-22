import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println(frequencyOfCharacters("AAABBCDD")); //A3B2C1D2
        System.out.println(frequencyOfCharacters("LAAABBCDDKKKKZZZZZZZZZ")); //A3B2C1D2
    }

    public static String frequencyOfCharacters(String text){
        Map<Character, Integer> charQty = new LinkedHashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            Integer qty = charQty.get(ch);
            if (qty != null){

                charQty.put(ch, qty + 1);
            }
            else charQty.put(ch,1);
        }

        StringBuilder returnStr = new StringBuilder();
        charQty.forEach((key, value) -> {
            returnStr.append(key.toString()).append(value.toString());
        });

        return returnStr.toString();
    }
}
