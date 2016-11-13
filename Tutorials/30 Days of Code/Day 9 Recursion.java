import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int no = scan.nextInt();
        
        System.out.print(factorial(no));
    }
    public static int factorial(int no){
        for(int i=no-1; i>1; i--)
            no *= i;
        return no;
    }
}