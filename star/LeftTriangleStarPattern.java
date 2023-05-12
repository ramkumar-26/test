package star;

import java.util.Scanner;

public class LeftTriangleStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            //space loop
            for(int j=i;j<n-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
