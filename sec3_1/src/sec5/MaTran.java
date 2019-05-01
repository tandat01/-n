package sec5;

import java.util.Scanner;

public class MaTran {
    public static void main(String[] args) {
        int m;
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println(" So Dong");
        m = scanner.nextInt();
        System.out.println("So Cot");
        n = scanner.nextInt();
        int A[][] = new int[m][n];
        int B[][] = new int[m][n];
        int C[][] = new int [m][n];
        int D[][] =new int[m][n];

        System.out.println("Phan tu trong A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "," + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Phan tu trong B:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("B[" + i + "," + j + "] = ");
                B[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma tran A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("Ma tran B:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println("\n");
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Tong ma tran C:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println("\n");
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                D[i][j] = (A[i][j] * B[i][j]);
            }
        }
        System.out.println("Tich ma tran D:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(D[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
