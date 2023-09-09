import java.util.*;
class Solution {
    public static String solution(int[] numbers) {
        String[] numbersToString = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        Arrays.sort(numbersToString, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
        String answer = String.join("", numbersToString);
        if (answer.startsWith("0")) return "0";
        return answer;
    }
}