package CoreJava.Java8StreamsQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class Part3 {
    public static void main(String[] args) {

        // find numbers that are unique in the list
//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,1,2,3,4);
//
//        HashSet<Integer> set = new HashSet<>();
//       List<Integer> ans = list.stream()
//               .collect(Collectors.groupingBy(num -> num,Collectors.counting()))
//               .entrySet()
//               .stream()
//               .filter(entry -> entry.getValue()==1)
//               .map(Map.Entry::getKey)
//               .toList();
//        System.out.println(ans);

//        Find the second largest number in an integer array
//
//        Write a Java 8 program to find the second largest number in an integer array.

//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
//
//        Optional<Integer> ans = list.stream()
//                .distinct()
//                .sorted(Collections.reverseOrder())
//                .skip(1)
//                .findFirst();
//
//        ans.ifPresent(System.out::println);
//        Sort a list of strings according to the increasing order of their length
//
//        Write a Java 8 program to sort a given list of strings according to the increasing order of their length.

//        List<String> words = Arrays.asList("apple", "banana", "kiwi", "cherry", "mango", "grapes");
//
//        List<String> ans = words.stream()
//                .sorted((s1,s2) -> Integer.compare(s1.length(),s2.length()))
//                .toList();
//
//        System.out.println(ans);

//        find the sum and average of all elements in an integer array
//
//        Write a Java 8 program to find the sum and average of all elements in an integer array.

//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
//
//
//        Integer sum = list.stream().reduce((a,b) -> a+b).get();
//
//        Integer avg = list.stream().reduce((a,b) -> a+b).map(num -> num/list.size()).get();
//
//        System.out.println("Sum :"+ sum);
//        System.out.println("Average "+ avg);
//
//       // alternative approach to create int stream because list doesn't supports average and sum methods
//
//        Integer sum1 = list.stream().mapToInt(num -> (int) num).sum();
//        OptionalDouble avg1 = list.stream().mapToInt(num -> (int) num).average();
//        System.out.println(sum1);
//        System.out.println(avg1.getAsDouble());

//        Find the common elements between two arrays
//
//        Write a Java 8 program to find the common elements between two arrays using streams.

        //Approach 1

//        Integer[] array1 = {1, 2, 3, 4, 5, 6, 7};
//        Integer[] array2 = {5, 6, 7, 8, 9, 10};
//
//        Set<Integer> hashset = new HashSet<>(Arrays.asList(array1));
//
//        List<Integer> commonElements = Arrays.stream(array2).filter(num -> hashset.contains(num)).collect(Collectors.toList());
//
//        System.out.println("CommonElements "+ commonElements);


        //Approach 2
//
//        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//        List<Integer> list2 = Arrays.asList(5, 6, 7, 8, 9, 10);
//
//        List<Integer> commonList = new ArrayList<>(list1);
//
//        commonList.retainAll(list2);
//
//        System.out.println(commonList);

//        Reverse each word of a string using Java 8 streams
//
//        Write a Java 8 program to reverse each word of a given string using the stream API and lambda expressions.

        String input = "Hello World Java Streams";

        String reverseString = Arrays.stream(input.split("\\s+")).map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));

        System.out.println("ReverseString :" +reverseString);



    }
}
