import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        int cntr = 0;
        int temp = 0;
        
        if((x2 > x1 && v2 > v1) || (x1 > x2 && v1 > v2))
            System.out.print("NO");
        else{
            if(x1 > x2){
                for(int i = x1, j = x2; i < 2147483647 || j < 2147483647; i+= v1, j+= v2){
                    if(i == j){
                        cntr++;
                        break;
                    }
                    if(j > i)
                        break;
                }
            }
            else{
                for(int i = x1, j = x2; i < 2147483647 && j < 2147483647; i+= v1, j+= v2){
                    if(i == j){
                        cntr++;
                        break;
                    }
                    if(i > j)
                        break;
                }
            }
            
            if(cntr == 0)
                System.out.print("NO");
            else
                System.out.print("YES");
        }
    }
}
