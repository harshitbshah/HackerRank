import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        int sizeArr = scan.nextInt();
        int rotation = scan.nextInt();
        
        int[] arr = new int[sizeArr];
        
        for(int i = 0; i < sizeArr; i++)
            arr[i] = scan.nextInt();
               
        for(int i= 0; i < rotation; i++)
            {
            int temp = arr[0];
            for(int j = 1; j < sizeArr; j++){
                arr[j-1] = arr[j];
            }
            arr[sizeArr-1] = temp;
        }
        
        for(int i = 0; i < sizeArr; i++)
            System.out.print(arr[i] + " ");
    }
}