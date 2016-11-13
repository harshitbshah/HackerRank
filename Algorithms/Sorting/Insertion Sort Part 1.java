import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function
        int cntr = 0;
        int tempVar = ar[ar.length - 1];
            for(int j = ar.length - 2; j >= 0 ; j--){
                if(ar[j] > tempVar){
                    ar[j+1] = ar[j];
                    printArray(ar);
                    cntr++;
                }
                else
                {
                    cntr = 0;
                    ar[j+1] = tempVar;
                    printArray(ar);
                    break;
                }
            }
        
            if(cntr != 0){
                ar[0] = tempVar;
                printArray(ar);
            }
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
