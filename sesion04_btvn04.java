import java.util.Scanner;
import java.util.Arrays;

class sesion4_btvn04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang: ");
        int n = scanner.nextInt();
        while (n < 0) {
            System.out.print("Kich thuoc khong duoc am. Nhap lai: ");
            n = scanner.nextInt();
        }
        if (n == 0) {
            System.out.println("Kích thước rỗng");
            scanner.close();
            return;
        }
        int[] mang = new int[n];
        System.out.println("Nhap cac phan tu cho mang:");
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
        System.out.println("Mang ban dau: " + Arrays.toString(mang));
        for (int i = 0; i < n / 2; i++) {
            int tam = mang[i];
            mang[i] = mang[n - 1 - i];
            mang[n - 1 - i] = tam;
        }
        System.out.println(
                "Mang sau khi dao nguoc: " + Arrays.toString(mang)
        );
        scanner.close();
    }
}
