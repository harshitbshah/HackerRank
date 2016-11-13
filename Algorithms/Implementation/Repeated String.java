import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long counter = 0;
        char[] charArr = s.toCharArray();
        long noDiv = n / s.length();
        long noRem = n % s.length();
        
        int charCnt = 0;
        
        for(int i = 0; i < charArr.length; i++){
                        
            if(charArr[i] == 'a')
                counter++;
            
        }
        counter *= noDiv;
        
        for(int i = 0; i < noRem; i++){
                        
            if(charArr[i] == 'a')
                counter++;
            
        }
        
        System.out.print(counter);
    }
}
