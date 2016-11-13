import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int []sticks = new int[size];
        int []cntr = new int[10000000];
        int cut = 0;
        int flag = 1;
        int inc = 0;
        
        for(int i = 0; i < size; i++){
            sticks[i] = scan.nextInt();
        }
        
            Arrays.sort(sticks);
            
            while(flag == 1){
                
            for(int i = 0; i < size ; i++){
                if(sticks[i] != 0){
                    cut = sticks[i];
                    break;
                }
            }
            
            cntr[inc] = 0;
            for(int i = 0; i < size ; i++){
                if(sticks[i] != 0){
                     sticks[i] = sticks[i] - cut;
                     cntr[inc] ++ ;
                }
            }
                
            if(cntr[inc] == 0)
                flag = 0;
                
            inc ++ ;
         }
        
         for(int finInc : cntr){
             if(finInc == 0)
                 break;
             System.out.println(finInc);
         }               
    }
}