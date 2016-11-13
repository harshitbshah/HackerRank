import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int n = size-1;
        
        for(int i=0; i < size; i++){
            for(int j = 0; j< size; j++){
                if(j < n)
                    System.out.print(" ");
                else{
                    if(j == size-1)
                        System.out.println("#");
                    else
                        System.out.print("#");
                }
            }
            n--;
        }
    }
}