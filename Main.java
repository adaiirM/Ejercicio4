package ej4;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] a = new int[10];
        for(int i = 0; i < 10; i++){
            a[i] = (int)(Math.random()*100);
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int[] a2 = Arrays.copyOf(a, 10);
        for(int i = 0; i < 10; i++){
            System.out.print(a2[i]+" ");
        }
    }
}
