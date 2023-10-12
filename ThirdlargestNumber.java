// package DSA1.java;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this c5lass
// you can add inner classes if needed
class Main {
        public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int nums[] = new int[n];
       for(int i = 0;i<n;i++){
           nums[i] = sc.nextInt();
       }
        Arrays.sort(nums); //convert array to ascending order
           System.out.print(nums[n-3]);
    
    }
}