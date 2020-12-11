package com.company;

public class ShellSort {
    public static int[] shellsort(int[] list, int[] increments) {
        int k;
        int x;
        int j;
        int y;

        for (int i = 0; i < increments.length; i++) {
            j = increments[i];
            for (k = j; k < list.length; k++) {
                y = list[k];
                for (x = k - j; x >= 0 && y < list[x]; x -= j) {
                    list[x + j] = list[x];
                }
                list[x + j] = y;
            }
        }
        return list;
    }
}



