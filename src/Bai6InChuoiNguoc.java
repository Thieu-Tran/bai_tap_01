import java.util.Scanner;

public class Bai6InChuoiNguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi bất kỳ: ");
        String str = sc.nextLine();
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            newStr = str.substring(i, i + 1) + newStr;
        }

        System.out.println("Chuỗi đảo ngược là: " + newStr);
    }
}
