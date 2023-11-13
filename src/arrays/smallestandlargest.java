package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class smallestandlargest {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int s = Sc.nextInt();
        int[] arrays = new int[s];
        for (int i = 0; i < s; i++) {
            arrays[i] = Sc.nextInt();
        }
        Arrays.sort(arrays);
        largest(arrays);
        smallest(arrays);
    }

    public static void largest(int arr[]) {
        System.out.println(arr[arr.length - 1]);
    }

    public static void smallest(int arr[]) {
        System.out.println(arr[0]);
    }
}
