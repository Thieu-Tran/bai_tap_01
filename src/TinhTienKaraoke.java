import java.util.Scanner;

public class TinhTienKaraoke {
    public static void main(String[] args) {
        double phiBaGioDau = 30000;
        double phiSauBaGio = 0.3 * phiBaGioDau;
        double giaMotChaiNuoc = 10000;
        double timeIn = 0;
        double timeOut = 0;
        int soLuongNuoc = 0;
        double bill;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Thời gian mở cửa từ 9h-24h");

            System.out.print(" Nhập thời gian vào: ");
            timeIn = sc.nextDouble();
            System.out.print(" Nhập thời gian ra: ");
            timeOut = sc.nextDouble();

        } while (timeIn < 9 || timeOut > 24);

        System.out.print(" Nhập vào số lượng chai nước: ");
        soLuongNuoc = sc.nextInt();

        if (timeOut - timeIn <= 3) {
            bill = (timeOut - timeIn) * phiBaGioDau + soLuongNuoc * giaMotChaiNuoc;

        } else {
            bill = 3 * phiBaGioDau + (timeOut - timeIn - 3) * phiSauBaGio + soLuongNuoc * giaMotChaiNuoc;
        }

        //Thời gian vào cửa từ 9h-17h thì giảm giá 20% tổng hóa đơn
        if (timeIn <= 17) {
            bill = bill * 0.8;
        }
        System.out.println("Tổng hóa đơn của khách là: " + bill);
    }
}
