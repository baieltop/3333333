package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[]distribution=new int[]{-56, 4, -22, 90, 31,56};

        for (int i = 0; i < distribution.length - 1; i++) {
            for (int j = distribution.length - 1; j > i; j--) {
                if (distribution[j - 1] > distribution[j]) {
                    int tmp = distribution[j - 1];
                    distribution[j - 1] = distribution[j];
                    distribution[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(distribution));


    }
}