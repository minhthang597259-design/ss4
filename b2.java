import java.util.Scanner;

public class SumEvenOdd2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so hang cua mang: ");
        int rows = scanner.nextInt();
        System.out.print("Nhap so cot cua mang: ");
        int cols = scanner.nextInt();
        
        int[][] arr = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhap gia tri cho phan tu o vi tri [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        
        int sumEven = 0;
        int sumOdd = 0;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] % 2 == 0) {
                    sumEven += arr[i][j];
                } else {
                    sumOdd += arr[i][j];
                }
            }
        }
        
        System.out.println("\n--- Ket Qua ---");
        System.out.println("Tong cac so chan: " + sumEven);
        System.out.println("Tong cac so le: " + sumOdd);
        
        scanner.close();
    }
}
