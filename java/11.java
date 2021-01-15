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
        int[][] mat = new int[6][6];
        int max_sum = Integer.MIN_VALUE; 
        int sum = 0;
        for (int a = 0; a < 6; a++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int b = 0; b < 6; b++) {
                int arrItem = Integer.parseInt(arrRowItems[b]);
                mat[a][b] = arrItem;
            }
            
        }
        
        for (int i = 0; i < 6 - 2; i++) 
        { 
            for (int j = 0; j < 6 - 2; j++) 
            { 
                sum = (mat[i][j] + mat[i][j + 1] +  
                        mat[i][j + 2]) + (mat[i + 1][j + 1]) +  
                        (mat[i + 2][j] + mat[i + 2][j + 1] +  
                        mat[i + 2][j + 2]); 

                if(sum > max_sum) max_sum = sum;
            } 
        } 
        
        System.out.println(max_sum);
        System.err.println(max_sum);
        scanner.close();
    }
}
