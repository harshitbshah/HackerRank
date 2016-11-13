import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int actDay = scan.nextInt();
        int actMon = scan.nextInt();
        int actYr = scan.nextInt();
        
        int expDay = scan.nextInt();
        int expMon = scan.nextInt();
        int expYr = scan.nextInt();
        
        int fine = 0;
        
        if(actYr > expYr)
            fine = 10000;
        else if(actYr == expYr){
            if(actMon > expMon)
                fine = 500 * (actMon - expMon);
            else if(actMon == expMon){
                if(actDay > expDay)
                   fine = 15 * (actDay - expDay);
            }
        }
           
        System.out.println(fine);
    }
}