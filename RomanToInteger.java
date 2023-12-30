import java.util.Map;

public class RomanToInteger {
     Map<Character, Integer> charToInt = Map.of(
        'I', 1,
        'V', 5,
        'X', 10,
        'L', 50,
        'C', 100,
        'D', 500,
        'M', 1000
    );

    public static int romanToInt(String s) {
        if(s.length() == 0) return 0;
        if(s.length() == 1) return charToInt.get(s.charAt(0));

        Integer first = charToInt.get(s.charAt(0));
        Integer second = charToInt.get(s.charAt(1));

        if (first < second) {
            return second - first + romanToInt(s.substring(2));
        } else {
            return first + romanToInt(s.substring(1));
        }
    }
    public static void main(String[] args) {
        String str = "III";
        romanToInt(str);
    }
}
