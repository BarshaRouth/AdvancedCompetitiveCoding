// the maximum equilibrium sum refers to the highest value of a prefix sum that is also equal to a suffix sum at a specific index

import java.util.Scanner;
public class MaxEquilibriumSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.err.println(arr);
        int diff=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int prefix_sum=arr[i];
            int suffix_sum=arr[arr.length-1];
            for (int j = 0; j < i; j++) {
                prefix_sum+=arr[j];
            }
            for (int j = i; j < arr.length; j++) {
                suffix_sum+=arr[j];
            }
            if(prefix_sum==suffix_sum){
                
            }
        }

    }
}
