package com.codingshuttle.project.uber.uberApp.strategies.impl;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static  void main(String[] args) {
        String s= "vishal";

        Map<Character,Long> map = s.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

        System.out.println(map);


        List<Integer> list1 = Arrays.asList(1,2,3,4,1,2,1);

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();

        List<Integer> list2  = list1.stream()
                .filter( i -> set.add(i))
                .collect(Collectors.toList());

        List<Integer> list  = list1.stream()
                .filter( i -> !set1.add(i))
                .collect(Collectors.toList());

        List<Integer> ans = list1.stream()
                        .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                                .entrySet()
                                        .stream()
                                                .filter(entry -> entry.getValue()==1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(ans);




        System.out.println(list);

        System.out.println(list2);
    }
}
