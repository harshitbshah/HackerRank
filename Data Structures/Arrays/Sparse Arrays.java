import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        
        int sizeStr = scan.nextInt();scan.nextLine();
        String[] noString = new String[sizeStr];
        
        for(int i = 0; i < sizeStr; i++)
            noString[i] = scan.nextLine();
        

        int sizeQuery = scan.nextInt();scan.nextLine();
        String[] noQuery = new String[sizeQuery];
              
        for(int i = 0; i < sizeQuery; i++)
            noQuery[i] = scan.nextLine();
        
    
        
        for(String compare : noQuery)
            {
            int counter = 0;
            for(String oriString : noString)
                {
                if(compare.equalsIgnoreCase(oriString))
                    counter++;
            }
            System.out.println(counter);
        }
        
    }
}