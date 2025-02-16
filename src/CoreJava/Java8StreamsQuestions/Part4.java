package CoreJava.Java8StreamsQuestions;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Part4 {
    public static void main(String[] args) {

//        Find the first repeated character in a string
//
//        Write a Java 8 program to find the first repeated character in a string.

//        String str = "swiss";
//
//        HashSet<Character> set = new HashSet<>();
//
//        Optional<Character> ans = str.chars().mapToObj(ch -> (char) ch).filter(character -> !set.add(character)).findFirst();
//
//        System.out.println(ans.get());


//        Find the first non-repeated character in a string
//
//        Write a Java 8 program to find the first non-repeated character in a string.

//        String str = "swiss";
//
//        Optional<Character> ans = str.chars()
//                .mapToObj(ch ->(char) ch)
//                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(entry -> entry.getValue() == 1)
//                .map(Map.Entry::getKey)
//                .findFirst();
//
//        System.out.println(ans.get());
    }
}
