import java.util.ArrayList;
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
        timPhanTuAm(numArr, true);
        timPhanTuAm(numArr, false);

        //Giá trị dương lớn nhất, nhỏ nhất trong mảng
        timPhanTuDuong(numArr, true);
        timPhanTuDuong(numArr, false);

        //In phần tử chẵn lẻ
        inChanLe(numArr);

        //Thêm phần tử cho mảng
        System.out.print("Nhập vào index cần thêm vào mảng: ");
        int indexAddNum = sc.nextInt();
        System.out.print("Nhập vào giá trị cần thêm tại vị trí index: ");
        double addNum = sc.nextDouble();

        double[] newArr1 = themPhanTu(numArr, indexAddNum, addNum);
        for (int i = 0; i < newArr1.length; i++) {
            System.out.print(newArr1[i] + " ");
        }

        //Xóa phần tử
        System.out.println();
        System.out.print("Nhập vào index cần xóa khỏi mảng: ");
        int indexDelNum = sc.nextInt();
        double[] newArr2 = xoaPhanTu(numArr, indexDelNum);
        for (int i = 0; i < newArr2.length; i++) {
            System.out.print(newArr2[i] + " ");
        }


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

    //Tìm giá trị âm lớn nhất nhỏ nhất
    public static void timPhanTuAm(double[] arr, boolean isValue) {
        double minValue = tinhMaxMin(arr, false);
        double value = minValue;

        if (minValue >= 0) {
            System.out.println("Mảng không chứa phần tử âm............");
        } else {
            if (isValue) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > value && arr[i] < 0) {
                        value = arr[i];
                    }
                }
                System.out.println("Giá trị âm lớn nhất là: " + value);
            } else {
                System.out.println("Giá trị âm nhỏ nhất là: " + minValue);
            }
        }
    }

    //Tìm giá trị dương lớn nhất nhỏ nhất
    public static void timPhanTuDuong(double[] arr, boolean isValue) {
        double maxValue = tinhMaxMin(arr, true);
        double value = maxValue;

        if (maxValue <= 0) {
            System.out.println("Mảng không chứa phần tử dương............");
        } else {
            if (isValue) {
                System.out.println("Giá trị dương lớn nhất là: " + maxValue);
            } else {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > 0 && arr[i] < value) {
                        value = arr[i];
                    }
                }
                System.out.println("Giá trị dương nhỏ nhất là: " + value);
            }
        }
    }

    public static void inChanLe(double[] arr) {
        ArrayList<Double> arrChan = new ArrayList<>();
        ArrayList<Double> arrLe = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arrChan.add(arr[i]);
            } else {
                arrLe.add(arr[i]);
            }
        }
        System.out.println("Danh sách số chẵn trong mảng: " + arrChan);
        System.out.println("Danh sách số lẻ trong mảng: " + arrLe);
    }

    //Hàm thêm phần tử theo index
    public static double[] themPhanTu(double[] arr, int index, double num) {
        int n = arr.length + 1;
        double[] newArr = new double[n];

        if (index < 0 || index > n) {
            return arr;
        }
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = n - 1; i > index; i--) {
            newArr[i] = arr[i - 1];
        }
        newArr[index] = num;
        return newArr;
    }


    //Hàm xóa phần tử theo index
    public static double[] xoaPhanTu(double[] arr, int index) {
        double[] newArr = new double[arr.length - 1];

        if (index < 0 || index >= arr.length) {
            return arr;
        }
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index + 1; i < arr.length; i++) {
            newArr[i-1] = arr[i];
        }
        return newArr;
    }

}
