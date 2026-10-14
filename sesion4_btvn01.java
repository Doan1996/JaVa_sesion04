import java.util.Scanner;
import java.util.Arrays;

public class sesion4_btvn01 {
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
        for (int i = 0; i < n - 1; i++) {
            int viTriMax = i;
            for (int j = i + 1; j < n; j++) {
                if (mang[j] > mang[viTriMax]) {
                    viTriMax = j;
                }
            }
            int tam = mang[i];
            mang[i] = mang[viTriMax];
            mang[viTriMax] = tam;
        }
        System.out.println(
                "Mang sau khi sap xep theo thu tu giam dan: "
                        + Arrays.toString(mang)
        );
        System.out.println(
                "Phan tu lon nhat trong mang la: " + mang[0]
        );
        scanner.close();
    }
}

