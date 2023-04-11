import java.util.Scanner;

public class Bai14XoaPhanTuLap {
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

//        System.out.println("Nhập vị trí phần tử cần xóa");
//        int index = sc.nextInt();
//        numArr = xoaPhanTu(numArr, index);
//
//
//        for (int i = 0; i < numArr.length; i++) {
//            System.out.print(numArr[i] + " ");
//        }

        numArr = xoaTrungLap(numArr);


        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + " ");
        }

    }

    public static double[] xoaPhanTu(double[] arr, int index) {
        double[] newArr = new double[arr.length - 1];

        if (index < 0 || index > arr.length) {
            return arr;
        }
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index + 1; i < arr.length; i++) {
            newArr[index] = arr[index + 1];
        }
        return newArr;
    }

    public static double[] xoaTrungLap(double[] arr) {

        double[] newArr = new double[arr.length];
        for (int i = 0; i < arr.length-1; i++) {
            int count = 0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                j--;
            }
            if (count == 0) {
                newArr[i] = arr[i];
            }
        }

        return newArr;
    }
}
