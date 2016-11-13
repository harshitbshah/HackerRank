import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int noTest = scan.nextInt();
        for(int i =0; i < noTest; i++){
            int n = scan.nextInt();
            int k = scan.nextInt();
            int []stu = new int[n];
            int cntr = 0;
            
            for(int j = 0; j < n ; j++){
                stu[i] = scan.nextInt();
                if(stu[i] <= 0)
                    cntr++;
            }
            
            if(cntr < k)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}