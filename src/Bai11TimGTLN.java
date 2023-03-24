import java.util.Scanner;

public class Bai11TimGTLN {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Nhập vào một số nguyên dương n>1: ");
            num = sc.nextInt();
        }while (num<=1);

        int max=0;
        //Đổi cơ số 2 sang cơ số 10
        double log2 = (Math.log(num) / Math.log(2));

        //Nếu log2 ra số nguyên thì phải trừ đi 1 đơn vị
        if (log2 - Math.floor(log2) == 0) {
            max = (int) Math.floor(log2) - 1;
        } else {
            //nếu chia dư thì làm tròn xuống lấy số nguyên gần nhất
            max = (int) Math.floor(log2);
        }
        System.out.println("Giá trị Max: " + max);
    }
}
