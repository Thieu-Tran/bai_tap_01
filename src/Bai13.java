import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử mảng: ");
        int soPhanTu = sc.nextInt();
        double[] numArr;

        if (soPhanTu <= 0) {
            return;
        } else {
            numArr = new double[soPhanTu];
            for (int i = 0; i < soPhanTu; i++) {
                System.out.printf("Nhập phần tử thứ a[%d] = ", i);
                numArr[i] = sc.nextInt();
            }
        }
        double giaTriTrungBinh = tinhGiaTriTB(numArr);
        System.out.println("Giá trị trung bình của mảng là: " + giaTriTrungBinh);

        //Giá trị lớn nhất, nhỏ nhất trong mảng
        System.out.println("Giá trị lớn nhất trong mảng: " + tinhMaxMin(numArr, true));
        System.out.println("Giá trị nhỏ nhất trong mảng: " + tinhMaxMin(numArr, false));

        //Giá trị âm lớn nhất, nhỏ nhất trong mảng
        timPhanTuAm(numArr,true);
        timPhanTuAm(numArr,false);

    }

    //Hàm tính giá trị trung bình của mảng
    public static double tinhGiaTriTB(double[] arr) {
        double sum = 0;
        double average;

        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        average = sum / arr.length;
        return average;
    }

    //Hàm tính GTLN,GTNN trong mảng
    public static double tinhMaxMin(double[] arr, boolean isMax) {
        //isMax = true: Hàm tìm giá trị lớn nhất trong mảng
        //isMax = false: hàm tìm giá trị nhỏ nhât trong mảng
        double value = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (isMax) {
                if (arr[i] > value) {
                    value = arr[i];
                }
            } else {
                if (arr[i] < value) {
                    value = arr[i];
                }
            }
        }
        return value;
    }

    public static void timPhanTuAm(double[] arr, boolean isValue) {
        double value = arr[0];
        double minValue = tinhMaxMin(arr, false);

        if (minValue >= 0) {
            System.out.println("Không chứa phần tử âm............");
        } else {
            if (isValue) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > minValue && arr[i] < 0) {
                        value = arr[i];
                    }
                }
                System.out.println("Giá trị âm lớn nhất là: " +value);
            } else {
                System.out.println("Giá trị âm nhỏ nhất là: " +minValue);
            }
        }
    }
}
