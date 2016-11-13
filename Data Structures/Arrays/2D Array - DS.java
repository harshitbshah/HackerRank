import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int oldSum = 0;
        int newSum = 0;
        int sumArr[] = new int[16];
        int cntr = 0;
        
        int [][] mat = new int[6][6];
        
        for(int i = 0; i < 6; i++)
        {
            for(int j=0; j<6; j++)
                {
                mat[i][j] = scan.nextInt();
            }
        }
        
        
        for(int i = 0; i < 4; i++)
        {
            for(int j=0; j<4; j++)
                {
                    oldSum = 0;
                    int seq = 0;
                    for(int k = i; k < i+3; k++)
                        {
                        for(int l=j; l<j+3; l++)
                            {
                            seq++;
                            if(seq != 4 && seq != 6)
                            {
                                oldSum  += mat[k][l];
//                              System.out.print("S: " + oldSum + " ");
                            }
                            
                        }
                    }
//                  System.out.println(" ");
                    sumArr[cntr] = oldSum;
                    cntr++;
            }
        }
        
        int great = sumArr[0];
        for(int a: sumArr)
            {
                if(a > great)
                    great = a;
        }
        System.out.println(great);
            
    }
}