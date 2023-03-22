import java.util.Scanner;

public class Bai2ChuyenDoiHeNhiPhan {
    public static void main(String[] args) {
        String nhiPhan="";

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương: ");
        int num = sc.nextInt();

        while(num>0){
            nhiPhan = num%2 + nhiPhan;

            num = num/2;
        }
        System.out.println("Hệ nhị phân là: "+nhiPhan);
    }
}
