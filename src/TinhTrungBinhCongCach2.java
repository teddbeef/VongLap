import java.text.DecimalFormat;
import java.util.Scanner;

public class TinhTrungBinhCongCach2 {
    public static void main(String[] args) {
        int i, sum = 0, amount, number;
        float avgNumber;

        // làm tròn đến 2 chữ số thập phân
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        amount = scanner.nextInt();
        /*
         * bắt đầu duyệt từ biến đếm i = 1
         * nếu i còn <= amount thì nhập vào số number thứ count
         * sau đó cộng giá trị của biến number vào biến sum
         * vòng lặp dừng khi biến đếm i > amount.
         */
        for (i = 1; i <= amount; i++) {
            System.out.println("Nhập số thứ " + i + ": ");
            number = scanner.nextInt();
            sum += number;

//            System.out.println("i: " + i + " , " + "sum: " + sum + " ");

        }
        avgNumber = (float) sum / amount;
        System.out.println("Trung bình cộng = " + decimalFormat.format(avgNumber));
    }
}
