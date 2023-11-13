package arrays;

import java.util.Scanner;

public class sumofelement {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int arr[]=new int[s];
        for (int i = 0; i < s; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length ; i++) {
            sum=sum+arr[i];

        }
        System.out.println(sum);

    }
}
