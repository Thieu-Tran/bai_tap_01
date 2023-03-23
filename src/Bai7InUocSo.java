import java.util.ArrayList;
import java.util.Scanner;

public class Bai7InUocSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số tự nhiên bất kỳ: ");
        int num = sc.nextInt();

        ArrayList<Integer> arrListNumber = new ArrayList<Integer>();

        for (int i = 1; i <= num; i++) {
            if(num%i==0){
                arrListNumber.add(i);
            }
        }
        System.out.println("Tập hợp ước là : "+arrListNumber);
    }
}
