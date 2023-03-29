import java.util.Scanner;

public class Bai16KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập năm cần kiểm tra: ");
        int year = sc.nextInt();

        if (year <= 0) {
            System.out.println("Năm nhập vào là số nguyên dương!");
        } else {
            if (year % 4 == 0 && year % 100 != 0){
                System.out.printf("%d là năm nhuận.",year);
            }else {
                System.out.printf("%d không phải là năm nhuận.",year);
            }
        }
    }
}
