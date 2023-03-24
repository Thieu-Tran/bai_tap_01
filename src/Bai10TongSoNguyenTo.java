import java.util.ArrayList;
import java.util.Scanner;

public class Bai10TongSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số tự nhiên n: ");
        int num = sc.nextInt();

        ArrayList<Integer> arrListNum = new ArrayList<>();

        for (int i = 2; i <= num; i++) {
            int count = 0;

            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 1) {
                arrListNum.add(i);
            }
        }
        System.out.println("Tổng các nguyên tố từ 1 đến "+ num +" là : "+arrListNum.size());
        System.out.println(arrListNum);

    }
}
