import java.util.Scanner;

public class EvenOddSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Mảng không có phần tử");
            scanner.close();
            return;
        }
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        
        int[] temp = new int[n];
        int index = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                temp[index++] = arr[i];
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                temp[index++] = arr[i];
            }
        }
        
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
        
        System.out.println("Mang sau khi sap xep:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
