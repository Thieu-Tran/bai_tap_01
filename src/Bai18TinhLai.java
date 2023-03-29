import java.util.Scanner;

public class Bai18TinhLai {
    public static void main(String[] args) {
        final double laiSuat = 0.09;
        double year =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lãi suất ngân hàng hiện nay: "+ laiSuat*100+"/năm");
        System.out.print("Nhập vào số tiền muốn gửi: ");
        double tienGui = sc.nextDouble();

        System.out.print("Nhập vào số tiền kỳ vọng: ");
        double tienKyVong = sc.nextDouble();

        if(tienKyVong<0 || tienGui<0){
            return;
        }

        year = ((tienKyVong/tienGui)-1)/laiSuat;

        System.out.println("Số năm tối thiểu cần là: "+(double)Math.round(year*100)/100+" năm");
    }
}
