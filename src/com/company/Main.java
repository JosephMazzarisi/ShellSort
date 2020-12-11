package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] num = {9,12,15,36,1,0,34};
        int[] increments = {1};
        num = ShellSort.shellsort(num,increments);
        for(int i=0; i<num.length; i++){
            System.out.print("(" + num[i] + ")" + ",");
        }

    }
}
