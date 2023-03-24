import java.util.Scanner;

public class Bai12TamGiacVuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Nhập vào số nguyên dương bất kỳ từ 1-9: ");
            num = sc.nextInt();
        }while (num<1||num>9);

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
