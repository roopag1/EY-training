package ExceptionDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws NumberFormatException, IOException {
        

        System.out.println("Enter a number");
        int num1 = System.in.read();
       System.out.println(num1);

    //    InputStreamReader is = new InputStreamReader(System.in);
    //    BufferedReader br = new BufferedReader(is);

    //    int n1 = Integer.parseInt(br.readLine());
    //    System.out.println(n1);

    //     br.close();


        // Scanner sc = new Scanner(System.in);
        // int n2 = sc.nextInt();
        // System.out.println(n2);
    }
}