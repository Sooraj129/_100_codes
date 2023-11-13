package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class secondsmallest {
    public static void main(String[] args) {


        Scanner Sc = new Scanner(System.in);
        int s = Sc.nextInt();
        int[] arrays = new int[s];
        for (int i = 0; i < s; i++) {
            arrays[i] = Sc.nextInt();
        }
        Arrays.sort(arrays);
        System.out.println(arrays[1]);
    }
}