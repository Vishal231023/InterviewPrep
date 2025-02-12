package CoreJava.Java8StreamsQuestions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Part1 {
    public static void main(String[] args) {


        //Q1:Separate odd and even numbers in a list of integers
        //Given a list of integers, write a Java 8 program to separate the odd
        // and even numbers into two separate lists.
//        List<Integer> numbers = Arrays.asList(10, 21, 30, 43, 50, 67, 88, 91, 100);
//
//        Map<Boolean,List<Integer>> ans = numbers.stream()
//                .collect(Collectors.partitioningBy(number -> number%2==0));
//
//        List<Integer> evenIntegers = ans.get(Boolean.TRUE);
//        List<Integer> oddIntegers = ans.get(Boolean.FALSE);
//
//        System.out.println("Even Integer: " + evenIntegers);
//        System.out.println("Odd Integer: " + oddIntegers);

//        Remove duplicate elements from a list using Java 8 streams
//
//        Write a Java 8 program to remove duplicate elements from a list using the stream API and lambda expressions.

//        List<Integer> numbers = Arrays.asList(1,2,1,3,4,5,2,3,57,8,9,5,9);
//        HashSet<Integer> set = new HashSet<>();

//        List<Integer> numbersWithoutDuplicates = numbers.stream()
//                                                    .filter(set::add)
//                                                       .collect(Collectors.toList());

        // another approach using distinct keyword

//        List<Integer> numbersWithoutDuplicates = numbers.stream()
//                        .distinct().collect(Collectors.toList());
//
//        System.out.println(numbersWithoutDuplicates);

//        Find the frequency of each character in a string using Java 8 streams
//
//        Write a Java 8 program to find the frequency of each character in a given string using the stream API and collectors.

//        String str = "banana";
//
//        Map<Character,Long> freqChar = str.chars()
//                .mapToObj(ch -> (char) ch)
//                .collect(Collectors.groupingBy(ch-> ch,Collectors.counting()));
//        System.out.println(freqChar);

//        Find the frequency of each element in an array or a list
//
//        Write a Java 8 program to find the frequency of each element in an array or a list using streams and collectors.
//

//        Integer[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
//
//        Map<Integer,Long> integerWiseCount = Arrays.stream(arr)
//                .collect(Collectors.groupingBy(integer -> integer,Collectors.counting()));
//        System.out.println(integerWiseCount);

//        Sort a given list of decimals in reverse order
//
//        Write a Java 8 program to sort a given list of decimal numbers in reverse order.


//        List<Double> numbers = Arrays.asList(3.14, 1.5, 2.71, 4.5, 0.99);
//
//        List<Double> decreasingOrderedNumbers = numbers.stream()
//                            .sorted(Collections.reverseOrder())
//                              .collect(Collectors.toList());
//
//        System.out.println(decreasingOrderedNumbers);



    }
}
