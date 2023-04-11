import java.util.Scanner;

public class Bai20TachMang {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử mảng: ");
        int soPhanTu = sc.nextInt();
        int[] numArr;

        if (soPhanTu <= 0) {
            return;
        } else {
            numArr = new int[soPhanTu];
            for (int i = 0; i < soPhanTu; i++) {
                System.out.printf("Nhập phần tử thứ a[%d] = ", i);
                numArr[i] = sc.nextInt();
            }
        }
        int soPhanTuChan = 0;
        int soPhanTuLe = 0;

        for (int i : numArr) {
            if (i % 2 == 0) {
                soPhanTuChan++;
            } else {
                soPhanTuLe++;
            }
        }

        int[] mangChan = new int[soPhanTuChan];
        int[] mangLe = new int[soPhanTuLe];

        int a=0;
        int b=0;
        for (int i:numArr) {

           if (i % 2 == 0){
               mangChan[a]=i;
               a++;

           }else {
               mangLe[b]=i;
               b++;
           }
        }
        System.out.print("Mảng chẵn: ");
        for (int i = 0; i < mangChan.length; i++) {
            System.out.print(mangChan[i]+" ");
        }
        System.out.println();

        System.out.print("Mảng lẻ: ");
        for (int i = 0; i < mangLe.length; i++) {
            System.out.print(mangLe[i]+" ");
        }
    }
}
