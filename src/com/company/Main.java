package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        Set<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);

        symmetricSetDifference(set,set1);
    }
    public static void symmetricSetDifference(Set<Integer> set,Set<Integer>set2){
        Set<Integer> newSet = new HashSet<>(set);
        newSet.removeAll(set2);
        set2.removeAll(set);
        newSet.addAll(set2);
        System.out.println(newSet);
    }
}
