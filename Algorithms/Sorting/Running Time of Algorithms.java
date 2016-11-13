import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSortPart2(int[] ar)
    {       
           // Fill up the code for the required logic here
           // Manipulate the array as required
           // The code for Input/Output is already provided
            int noShi = 0;
            for(int i = 1; i < ar.length; i++){
                
                int cntr = 0;
                int tempVar = ar[i];
                for(int j = i-1; j > -1 ; j--){
                    if(ar[j] > tempVar){
                        ar[j+1] = ar[j];
                        cntr++;
                        noShi++;
                    }
                    else
                    {   
                        cntr = 0;
                        ar[j+1] = tempVar;
                        break;
                    }
                }

                if(cntr != 0){
                    ar[0] = tempVar;
                }

            }
            System.out.println(noShi);
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print("|" + n+" ");
      }
        System.out.println("|");
   }
}
