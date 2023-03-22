import java.util.Scanner;

public class Bai5TinhDoDaiAB {
    public static void main(String[] args) {
        double ABLength=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tọa độ x(A): ");
        double xa = sc.nextDouble();

        System.out.print("Nhập tọa độ y(A): ");
        double ya = sc.nextDouble();

        ToaDo A = new ToaDo(xa,ya);

        System.out.print("Nhập tọa độ x(B): ");
        double xb = sc.nextDouble();

        System.out.print("Nhập tọa độ y(B): ");
        double yb = sc.nextDouble();

        ToaDo B = new ToaDo(xb,yb);

        ABLength = Math.sqrt((Math.pow((xb-xa),2)+Math.pow((yb-ya),2)));

        System.out.println("Độ dài đoạn thẳng AB là: "+ ABLength);
    }
}
class ToaDo{
    private double x;
    private double y;

    public ToaDo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

}
