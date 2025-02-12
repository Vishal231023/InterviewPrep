package InterviewQuestions;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class oddNumberSUm {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};

        int ans = Arrays.stream(arr)
                .filter(n -> n%2!=0)
                .map(n -> n*n)
                .sum();

        System.out.println(ans);

        String s1 = new String("abc");
        String s2 = new String("abc");

        HashMap<String,Integer> map = new HashMap<>();

        map.put(s1,1);
        System.out.println(map);
        map.put(s2,2);

        System.out.println(map);

        //input = ["ant","eat","ate","tan","tea"]
        //output = [["ant","tan"], ["eat","ate","tea"]]

        String arr2 [] = {"ant","eat","ate","tan","tea"};


        Map<String,List<String>> list = Arrays.stream(arr2)
                .collect(groupingBy(word -> {
                    char [] characters = word.toCharArray();
                    Arrays.sort(characters);
                    return  new String(characters);
                }));

        System.out.println(list.values());
//                .

        //int [] freqArr = new int[26];



//        for(int i=0;i<26;i++){
//            freqArr[i] = 0;
//        }

        HashMap<String,List<String>> group = new HashMap<>();
        for(String word : arr2){

            char [] charArr = word.toCharArray();
            Arrays.sort(charArr);
            String sortedWord = new String(charArr);

            List<String> anagramString = new ArrayList<>();

            if(!group.containsKey(sortedWord)){
                group.put(sortedWord,new ArrayList<>());

            }

             group.get(sortedWord).add(word);



        }
        System.out.println(group.values());










    }
}
