import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        scan.nextLine();
        for(int i=0; i < size; i++){
            String str = scan.nextLine();
            char [] arrStr = str.toCharArray();
            
            for(int j = 0; j < arrStr.length; j += 2){
                System.out.print(arrStr[j]);
            }
            System.out.print(" ");
            for(int j = 1; j < arrStr.length; j += 2){
                System.out.print(arrStr[j]);
            }
            System.out.println("");
        }
    }
}