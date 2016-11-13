import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int cntr = 0;
        
        int arr[] = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        
        for(int i=0 ; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if((arr[i] + arr[j]) % k == 0){
//                  System.out.print(arr[i] + " " + arr[j] + "  ");
                    cntr++;
                }
            }
        }
        
        System.out.print(cntr);
    }
}
