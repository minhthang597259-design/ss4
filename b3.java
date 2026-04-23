import java.util.Scanner;

public class SortAndSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap kich thuoc mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }
        
        System.out.println("Mang da sap xep giam dan:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        System.out.print("Nhap so can tim: ");
        int target = scanner.nextInt();
        
        int linearResult = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                linearResult = i;
                break;
            }
        }
        
        int left = 0;
        int right = n - 1;
        int binaryResult = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                binaryResult = mid;
                break;
            } else if (arr[mid] < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        if (linearResult != -1) {
            System.out.println("Tim kiem tuyen tinh: Tim thay tai chi so " + linearResult);
        } else {
            System.out.println("Tim kiem tuyen tinh: Khong tim thay");
        }
        
        if (binaryResult != -1) {
            System.out.println("Tim kiem nhi phan: Tim thay tai chi so " + binaryResult);
        } else {
            System.out.println("Tim kiem nhi phan: Khong tim thay");
        }
        
        scanner.close();
    }
}
