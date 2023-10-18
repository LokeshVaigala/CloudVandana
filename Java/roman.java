import java.util.HashMap;
import java.util.Map;

public class RomanToNumber {
    public static void main(String[] args) {
        System.out.println(romanToNumber("III"));
        System.out.println(romanToNumber("IV"));
        System.out.println(romanToNumber("IX"));
        System.out.println(romanToNumber("LVIII"));
        System.out.println(romanToNumber("MCMXCIV"));
    }

    public static int romanToNumber(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (i + 1 < s.length() && romanMap.get(currentChar) < romanMap.get(s.charAt(i + 1))) {
                number -= romanMap.get(currentChar);
            } else {
                number += romanMap.get(currentChar);
            }
        }
        return number;
    }
}
