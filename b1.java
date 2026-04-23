import java.util.Scanner;

public class BubbleSortDescending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap kich thuoc cua mang: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri cho phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Mang da sap xep theo thu tu giam dan:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        scanner.close();
    }
}
