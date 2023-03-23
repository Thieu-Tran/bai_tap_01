import java.util.Scanner;

public class Bai8InHoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi bất kỳ: ");
        String str = sc.nextLine();
        String newStr = "";

        str = str.trim().toLowerCase();

        String strArr[] = str.split(" ");
        for (String x : strArr) {
            newStr = newStr + x.substring(0, 1).toUpperCase() + x.substring(1);
            newStr = newStr + " ";
        }
        System.out.println("Kết quả: " + newStr);
    }
}
