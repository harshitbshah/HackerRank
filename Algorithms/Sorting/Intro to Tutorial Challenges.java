import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int ele = scan.nextInt();
        int size = scan.nextInt();
        int arr[] = new int[size];
        int pos = -1;
        
        for(int i = 0; i < size; i++)
            arr[i] = scan.nextInt();
        
        for(int i = 0; i < size; i++){
            if(arr[i] == ele){
                pos = i;
                break;
            }
        }        
        System.out.println(pos);
        
    }
}