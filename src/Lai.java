import java.util.Scanner;

public class Lai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double laiSuat = 1.0;
        System.out.println("Nhap so luong dau tu: ");
        money = sc.nextDouble();
        System.out.println("Nhap so thang: ");
        month = sc.nextInt();
        System.out.println("Nhap lai suat hang nam(%): ");
        laiSuat = sc.nextDouble();
        double tongLaiSuat = 0;
        for (int i = 0; i < month; i++) {
            tongLaiSuat += money * (laiSuat/100)/12 * month;
        }
        System.out.println("Tong lai suat la: " + tongLaiSuat);
    }
}
