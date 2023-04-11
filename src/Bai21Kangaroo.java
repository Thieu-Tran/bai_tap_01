import java.util.Scanner;

public class Bai21Kangaroo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, x2, v1, v2;
        x1 = x2 = v1 = v2 = 0;
        do {
            System.out.print("Nhập tọa độ x1 của Kangaroo 1(0-10000): ");
            x1 = sc.nextDouble();
            System.out.print("Nhập vận tốc v1 của Kangaroo 1(1-10000): ");
            v1 = sc.nextDouble();

            System.out.print("Nhập tọa độ x2>x1 của Kangaroo 2(0-10000): ");
            x2 = sc.nextDouble();
            System.out.print("Nhập vận tốc v2 của Kangaroo 2(1-10000): ");
            v2 = sc.nextDouble();
        } while (x1 < 0 || x1 > 10000 || v1 < 1 || v1 > 10000||x2 < 0 || x2 > 10000 || x2 < x1 || v2 < 1 || v2 > 10000);

        double toaDo1=0;
        double toaDo2=0;

        for (int i = 0; i < 10000; i++) {
            toaDo1=x1+i*v1;
            toaDo2=x2+i*v2;

            if (toaDo1==toaDo2){
                break;
            }
        }

        if(toaDo1>10000||toaDo2>10000){
            System.out.println("Hai con Kangaroo không gặp nhau.");
        }else {
            System.out.println("Hai con Kangaroo gặp nhau tại vị trí x= "+toaDo1);
        }
//
    }
}
