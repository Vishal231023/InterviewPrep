package InterviewQuestions;

import java.util.Map;
import java.util.stream.Collectors;

public class FindWordCount {
    public static void main(String[] args) {
        String s = "abcdacdnhgi";
        String s1 = "1239845984598123";

        Map<Character,Long> characterLongMap = s.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        System.out.println(characterLongMap);

        Map<Character,Integer> characterIntegerMap = s1.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch,
                        Collectors.collectingAndThen(Collectors.counting(),Long::intValue)));
        System.out.println(characterIntegerMap);

    }
}
