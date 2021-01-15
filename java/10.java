import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s = Integer.toString(n, 2);
        int max = 0, now = 0;
        if(s.charAt(0) == '1') now++;
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == '1' && s.charAt(i-1) == '0') now++;
            if(s.charAt(i) == '1' && s.charAt(i-1) == '1') now++;
            if(s.charAt(i) == '0' && s.charAt(i-1) == '1') {
                if(now > max) max = now;
                now = 0;
            }
            if(i == s.length()-1) if(now > max) max = now;
        }
        System.out.print(max);
        scanner.close();
    }
}
