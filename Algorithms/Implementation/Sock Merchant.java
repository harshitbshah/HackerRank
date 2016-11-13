import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cntr = 0;
        int pair = 1;
        int prev = 0;
        int noSocks[] = new int[n];
        
        for(int i=0; i < n; i++){
            noSocks[i] = in.nextInt();
        }
        
        Arrays.sort(noSocks);
        
        prev = noSocks[0];
        
        for(int i = 1; i < n; i++){
            pair++;
            
            if(prev == noSocks[i] && pair == 2)
                cntr++;       
            
            if(pair == 2)
                pair = 0;
            if(prev != noSocks[i])
                pair = 1;
            
            prev = noSocks[i];
        }
        
        System.out.print(cntr);
    }
}