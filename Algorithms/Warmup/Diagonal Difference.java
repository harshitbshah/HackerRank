import java.io.*;
import java.util.*;
import java.lang.Math;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [][]arr = new int[size][size];
        int leftSum = 0;
        int rightSum = 0;
        
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        
        for(int i = 0, j = 0; i < size; i++,j++){
                  leftSum += arr[i][j];
        }
        
        for(int i = 0, j = size-1; j >= 0; i++,j--){
                  rightSum += arr[i][j];
        }
        
        System.out.print(Math.abs(leftSum - rightSum));
}
}