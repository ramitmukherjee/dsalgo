package com.rm.dsalgo;

import java.util.LinkedList;
import java.util.List;

public class TowerOfHanoi {

    public static void main(String[] args) {
        int n = 4;
        List<String> steps = new LinkedList<>();
        TowerOfHanoi.hanoi(n, "S", "E", "A", steps);

        steps.forEach(System.out::println);
        System.out.println("Minimum Steps: " + steps.size());
    }

    public static void hanoi(int n, String start, String end, String aux, List<String> steps) {
        if(n == 0) {
            return;
        }
        hanoi(n-1, start, aux, end, steps);
        steps.add(start + " -> " + end);
        hanoi(n-1, aux, end, start, steps);
    }

}
