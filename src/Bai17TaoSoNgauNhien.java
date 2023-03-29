import java.util.Random;
import java.util.Scanner;

public class Bai17TaoSoNgauNhien {
    public static void main(String[] args) {
        int num = 0;
        Random rd = new Random();
        int ranNum = rd.nextInt(9) + 1;
        Scanner sc = new Scanner(System.in);


        do {
            System.out.print("Nhập số bất kỳ từ 1-1000: ");
            num = sc.nextInt();

            if (num < ranNum) {
                System.out.println("Số vừa nhập nhỏ hơn số hệ thống.");
            } else if (num > ranNum) {
                System.out.println("Số vừa nhập lớn hơn số hệ thống.");
            }
        } while (num != ranNum);

        System.out.println("Số ngẫu nhiên của hệ thống là : " + ranNum);
    }
}
