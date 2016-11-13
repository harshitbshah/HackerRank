import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        Integer size = scan.nextInt();
        int []arr = new int[size];
        Integer noPos = 0;
        Integer noNeg = 0;
        Integer noZero = 0;
        
        for(int i = 0; i < size; i++){
            arr[i] = scan.nextInt();
            if(arr[i] > 0)
                noPos++;
            else if(arr[i] < 0)
                noNeg++;
            else
                noZero++;
        }
        
        DecimalFormat f = new DecimalFormat("#0.000000"); 
        
        System.out.println(f.format(noPos.doubleValue() / size.doubleValue()));
        System.out.println(f.format(noNeg.doubleValue() / size.doubleValue()));
        System.out.println(f.format(noZero.doubleValue() / size.doubleValue()));
    }
}