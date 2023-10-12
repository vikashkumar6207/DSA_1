import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Equalise_the_Array {
        public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oddCount = 0;
        int evenCount = 0;
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            if(num%2==0){
                evenCount++;
            }else {
                oddCount++;
            }
        }
        System.out.println(oddCount>evenCount ? oddCount:evenCount);

    }
}
