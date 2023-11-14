package arrays;

import java.util.Scanner;

public class sortelement {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int [] arr=new int[n];
        int min;
        for (int i = 0; i < n; i++) {
            arr[i]=Sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            min=i;
            for(int j=i+1;j<arr.length;j++) {
                if (arr[j]< arr[min])
                   min=j;
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
