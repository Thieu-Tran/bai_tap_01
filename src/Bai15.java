import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi bất kỳ: ");
        String str = sc.nextLine();

        System.out.println("Độ dài chuỗi vừa nhập là: "+ str.length());

        //Chuyển đổi chuỗi sang mảng ký tự
        char[] strArr = str.toCharArray();
        System.out.print("Nhập vào vị trí muốn in ký tự: ");
        int index = sc.nextInt();
        System.out.println("Ký tự tại vị trí index: "+ strArr[index]);

        String subStr = "abcdef";

        if(str.contains(subStr)){
            System.out.println("Chuỗi vừa nhập có chứa 'abcdef'");
        }else {
            System.out.println("Chuỗi vừa nhập không chứa 'abcdef'");
        }
    }
}
