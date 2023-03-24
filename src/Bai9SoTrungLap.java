import java.util.Scanner;

public class Bai9SoTrungLap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        do {
            System.out.println("Nhập vào hai số nguyên bất kỳ từ 10-99: ");
            System.out.print(" Nhập vào số thứ nhất(1): ");
            num1=sc.nextInt();

            System.out.print(" Nhập vào số thứ hai(2): ");
            num2=sc.nextInt();
        }while (num1<10||num2>99);

        int soHangChuc1 = num1/10;
        int soHangDV1 = num1%10;

        int soHangChuc2 = num2/10;
        int soHangDV2 = num2%10;

        if(soHangChuc1==soHangChuc2||soHangChuc1==soHangDV2||soHangDV1==soHangChuc2||soHangDV1==soHangDV2){
            System.out.println("TRUE");
        }else {
            System.out.println("FALSE");
        }
    }
}
