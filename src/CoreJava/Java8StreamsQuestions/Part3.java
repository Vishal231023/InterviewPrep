package CoreJava.Java8StreamsQuestions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

//        String input = "Hello World Java Streams";
//
//        String reverseString = Arrays.stream(input.split("\\s+"))
//                .map(word -> new StringBuilder(word).reverse().toString())
//                .collect(Collectors.joining(" "));
//
//        System.out.println("ReverseString :" +reverseString);


//        Find the sum of the first 10 natural numbers
//
//        Write a Java 8 program to find the sum of the first 10 natural numbers using streams.

//        int ans = IntStream.range(1,10).sum();
//        System.out.println(ans);

//        Reverse an integer array
//
//        Write a Java 8 program to reverse an integer array.


//        int [] nums = {1,23,3,2,4,5};
//
//       int [] ans = IntStream.range(0,nums.length).map(num -> nums[nums.length-num-1]).toArray();
//        System.out.println(Arrays.toString(ans));

//        Print the first 10 even numbers
//
//        Write a Java 8 program to print the first 10 even numbers.

//        int [] ans = IntStream
//                .rangeClosed(1,10)
//                .map(n -> n*2).toArray();
//
//        System.out.println(Arrays.toString(ans));
//
//       int [] ansList = IntStream.iterate(2,n -> n+2).limit(10).toArray();
//
//        System.out.println(Arrays.toString(ansList));

//        Find the most repeated element in an array
//
//        Write a Java 8 program to find the most repeated element in an array.

//        int[] array = {1, 3, 2, 3, 4, 5, 3, 2, 2, 2, 2, 5, 6, 2, 2};
//
//        List<Integer> list = Arrays.stream(array).boxed().toList();
//
//        Integer ans = list.stream()
//                .collect(Collectors.groupingBy(num -> num, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .max(Map.Entry.comparingByValue())
//                .map(entry -> entry.getKey())
//                .orElse(null);
//
//        System.out.println(ans);

//        Check if a string is a palindrome using Java 8 streams
//
//        Write a Java 8 program to check if a given string is a palindrome using the stream API and lambda expressions.

//        String strCaseSensitive = "Madam";
//        String str = strCaseSensitive.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
//
//        boolean isPalindrome = IntStream.
//                range(0,str.length()/2)
//                .allMatch(i -> str.charAt(i) == str.charAt(str.length()-i-1));
//
//        System.out.println(isPalindrome);

//        Find strings in a list that start with a number
//
//        Given a list of strings, write a Java 8 program to find the strings that start with a number.

//        List<String> words = Arrays.asList("123apple", "banana", "7up", "42life", "hello", "99problems", "test");
//
//        List<String> wordStartingWithDigit = words.stream().filter(word -> Character.isDigit(word.charAt(0))).toList();
//
//        System.out.println(wordStartingWithDigit);

//        Extract duplicate elements from an array
//
//        Write a Java 8 program to extract duplicate elements from an array.
//

//        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,1,2,3,4);
//
//        List<Integer> dupIntegers = integers
//                .stream()
//                .collect(Collectors.groupingBy(number -> number, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(entry -> entry.getValue() >= 2)
//                .map(Map.Entry::getKey)
//                .toList();
//
//        System.out.println(dupIntegers);

//        Print duplicate characters in a string
//
//        Write a Java 8 program to print the duplicate characters in a string.

//        String str = "programming";
//
//        List<Character> ans = str.chars()
//                .mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(number -> number, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(entry -> entry.getValue() >= 2)
//                .map(Map.Entry::getKey)
//                .toList();
//
//        System.out.println(ans);






    }
}
