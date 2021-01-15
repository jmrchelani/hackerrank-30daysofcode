import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        String[] arr = new String[num];
        for(int i = 0; i < num; i++) {
            arr[i] = scan.nextLine();
        }
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length(); j += 2) {
                System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");
            for(int j = 1; j < arr[i].length(); j += 2) {
                System.out.print(arr[i].charAt(j));
            }
            System.out.print("\n");
        }
    }
}
