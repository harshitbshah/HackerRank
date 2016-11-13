import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int noTest = scan.nextInt();
        
        for(int i = 0; i < noTest; i++){
            int n = scan.nextInt();
            int k = scan.nextInt();
            int max = 0;
            
            for(int j = 1; j < n; j++){
                for(int l = j+1; l <= n; l++){
                    int a = j;
                    int b = l;
                    int opr = a & b;
                    if(opr > max && opr < k){
                        max = opr;
                    }                    
                }
            }
            System.out.println(max);
        }
    }
}