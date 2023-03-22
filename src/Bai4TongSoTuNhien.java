import java.util.Scanner;

public class Bai4TongSoTuNhien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào 1 số tự nhiên bất kỳ n>0: ");
        int num = sc.nextInt();
        int sum = 0;

        while (num > 0) {
            sum = num % 10 + sum;
            num = num / 10;
        }
        System.out.println("Tổng các chữ số là = " + sum);
    }
}
