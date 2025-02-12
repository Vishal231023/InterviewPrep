package CoreJava.Java8StreamsQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Part2 {
    public static void main(String[] args) {

//        Join a list of strings with '[' as prefix, ']' as suffix, and ',' as delimiter
//
//        Given a list of strings, write a Java 8 program to join the strings with '[' as a prefix, ']' as a suffix, and ',' as a delimiter.
//        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
//
//        String formatedString = strings.stream()
//                .collect(Collectors.joining(",","[","]"));
//        System.out.println(formatedString);


//        Print the numbers from a given list of integers that are multiples of 5
//
//        Write a Java 8 program to print the numbers from a given list of integers that are multiples of 5.
//

//        List<Integer> numbers = Arrays.asList(5,12,10,15,20,25,34,43);
//
//        List<Integer> multiplesOfFive = numbers.stream()
//                .filter(number -> number %5==0)
//                .collect(Collectors.toList());
//        System.out.println(multiplesOfFive);

//        Find the maximum and minimum of a list of integers
//
//        Given a list of integers, write a Java 8 program to find the maximum and minimum numbers in the list.

//        List<Integer> numbers = Arrays.asList(5,12,10,15,20,25,34,43);
//
//        Optional<Integer> maximum = numbers.stream().max(Integer::compareTo);
//        Optional<Integer> minimum = numbers.stream().min(Integer::compareTo);
//
//        System.out.println("Maximum " + maximum);
//        System.out.println("Minimum "+ minimum);

//        Merge two unsorted arrays into a single sorted array using Java 8 streams
//
//        Write a Java 8 program to merge two unsorted arrays into a single sorted array using the stream API.

//        int[] arr1 = {5, 1, 9, 3};
//        int[] arr2 = {8, 2, 4, 7, 6};
//
//        int [] mergeSortedArray = IntStream
//                .concat(Arrays.stream(arr1),Arrays.stream(arr2))
//                .sorted()
//                .toArray();
//        System.out.println("Sorted Merged Array " + Arrays.toString(mergeSortedArray));

//        Merge two unsorted arrays into a single sorted array without duplicates
//
//        Write a Java 8 program to merge two unsorted arrays into a single sorted array without duplicates.

//        int[] arr1 = {5, 1, 9, 3,3,6};
//        int[] arr2 = {8, 2, 4, 7, 6,5,1};
//
//        int [] mergedSortedWithoutDuplicates = IntStream
//                .concat(Arrays.stream(arr1),Arrays.stream(arr2))
//                .distinct()
//                .sorted()
//                .toArray();
//        System.out.println("Merged Sorted Array Without Duplicates "+ Arrays.toString(mergedSortedWithoutDuplicates));


//        Get the three maximum and three minimum numbers from a given list of integers
//
//        Write a Java 8 program to get the three maximum and three minimum numbers from a given list of integers.

//        List<Integer> numbers = Arrays.asList(10, 25, 5, 30, 15, 50, 40, 20);
//
//        List<Integer> threeMinNumbers = numbers
//                .stream()
//                .sorted()
//                .limit(3)
//                .collect(Collectors.toList());
//        System.out.println(threeMinNumbers);
//
//        List<Integer> threeMaxNumbers = numbers
//                .stream()
//                .sorted((a,b) -> b-a)
//                .limit(3)
//                .collect(Collectors.toList());
//
//        System.out.println(threeMaxNumbers);

        // if numbers have duplicates, and distinct is required then add distinct() before sorted

//        Check if two strings are anagrams or not using Java 8 streams
//
//        Write a Java 8 program to check if two strings are anagrams or not using the stream API and lambda expressions.

//        String str1 = "listen";
//        String str2 = "silent";
//
//        boolean isAnagram = checkAnagrams(str1,str2);
//        System.out.println(isAnagram);

//        Find the sum of all digits of a number in Java 8
//
//        Write a Java 8 program to find the sum of all digits of a given number.
        int number = 12345;

        int sumOfAllDigits = String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .sum();
        System.out.println(sumOfAllDigits);

    }

    private static boolean checkAnagrams(String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }

        return  Arrays
                .stream(str1.split(""))
                .sorted()
                .collect(Collectors.joining())
                .equals(Arrays.stream(str2.split(""))
                .sorted()
                .collect(Collectors.joining()));
    }
}
