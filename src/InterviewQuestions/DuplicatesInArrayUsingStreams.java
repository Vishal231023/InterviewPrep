package InterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesInArrayUsingStreams {
    public static void main(String[] args) {
        Integer [] nums = {1,2,3,1,4,5,4,5,6,7,8,6};

        ;
        System.out.println(getAnsDuplicates(nums));
    }

    //this is a generic method that return the Set, <T> specify that this is generic method
    // Set<T> refers that it return set of type given in T
    // T[] speciffy that it is an array of Type T
    private static <T> Set<T> getAnsDuplicates(T[] nums) {

        Set<T> seenRecords = new HashSet<>();

       return Arrays.stream(nums)
                .filter(val -> !seenRecords.add(val))
                .collect(Collectors.toSet());


    }
}
