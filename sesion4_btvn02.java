import java.util.Scanner;
public class sesion4_btvn02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap kich thuoc mang: ");
        int n = scanner.nextInt();

        while (n <= 0) {
            System.out.print("Kich thuoc phai lon hon 0. Nhap lai: ");
            n = scanner.nextInt();
        }
        int[] mang = new int[n];

        System.out.println("Nhap cac phan tu cho mang:");
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
        long tong = 0;

        for (int i = 0; i < n; i++) {
            tong += mang[i];
        }
        System.out.println("Tong cac phan tu trong mang la: " + tong);

        scanner.close();
    }
}



