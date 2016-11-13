import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] a = new int[size];
        int temp;
        int swap = 0;
        
        for(int i = 0; i < size; i++){
            a[i] = scan.nextInt();
        }
        
        for(int i = 0; i < size-1; i++){
            for(int j = 0; j < size-i-1; j++){
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    
                    swap++;
                }
            }            
        }
        System.out.println("Array is sorted in "+swap+" swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[size-1]);
        
    }
}