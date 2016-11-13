import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String time = scan.nextLine();
        
        String cond = time.substring(time.length()-2,time.length());
        StringBuilder part = new StringBuilder(time.substring(2,time.length()-2));
        
        Integer hh = Integer.parseInt(time.substring(0,2));
        
        if(cond.equalsIgnoreCase("PM")){
            if(hh < 12)
                hh += 12;
            System.out.println(new StringBuilder(hh.toString()).append(part));
        }
        if(cond.equalsIgnoreCase("AM")){
            if(hh == 12)
                System.out.println(new StringBuilder("00").append(part)); 
            else
                System.out.println(new StringBuilder(time.substring(0,2)).append(part));
        }          
    
    }
}