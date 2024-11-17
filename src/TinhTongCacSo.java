import java.util.Scanner;
/*
cấu trúc này điều kiện lặp được kiểm tra trước khi thực hiện thân của vòng lặp
vòng lặp while sẽ tính giá trị của biểu thức điều_kiện_lặp.
Khi biểu thức này có giá trị đúng (true) thì những lệnh nằm trong thân của vòng lặp sẽ được thực hiện
 */
public class TinhTongCacSo {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner scan = new Scanner(System.in);
        while (sum < 33) {
            System.out.print("Enter number: ");
            number = scan.nextInt();
            sum += number;
        }
        System.out.print("The sum of all number is: " + sum);
    }
}

