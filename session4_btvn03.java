import java.util.Scanner;
import java.util.Arrays;

public class session4_btvn03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập kích thước mảng
        System.out.print("Nhap kich thuoc mang: ");
        int n = scanner.nextInt();

        while (n <= 0) {
            System.out.print("Kich thuoc phai lon hon 0. Nhap lai: ");
            n = scanner.nextInt();
        }

        // 2. Nhập các phần tử
        int[] mang = new int[n];

        System.out.println("Nhap cac phan tu cho mang:");
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }

        // 3. Bubble Sort: sắp xếp giảm dần
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (mang[j] < mang[j + 1]) {
                    int tam = mang[j];
                    mang[j] = mang[j + 1];
                    mang[j + 1] = tam;
                }
            }
        }

        // 4. In kết quả
        System.out.println(
                "Mang sau khi sap xep giam dan: "
                        + Arrays.toString(mang)
        );

        scanner.close();
    }
}