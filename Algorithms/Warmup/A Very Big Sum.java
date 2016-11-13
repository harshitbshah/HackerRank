import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        long []arr = new long[size];
        long sum = 0;
        
        for(int i=0; i < size; i++)
            arr[i] = scan.nextInt();
        
        for(int i=0; i < size; i++)
            sum += arr[i];
        
        System.out.print(sum);
    }
}