import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        Long no = scan.nextLong();
        int cntr = 1;
        int max = 1;
        
        char []s = Long.toBinaryString(no).toCharArray();
        char prev = s[0];
        for(int i = 1; i < s.length; i++){
                if(s[i] == '1' && s[i] == prev){
                    cntr++;
                    if(cntr > max){
                        max = cntr;
                    }
                }
                else if(s[i] == '1'){
                    cntr = 1;
                }
                prev = s[i];
        }
//      System.out.println(Long.toBinaryString(no));
        System.out.print(max);
        
    }
}