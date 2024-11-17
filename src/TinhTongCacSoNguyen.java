import java.util.Scanner;
/*
 Vòng lặp do - while thực hiện các câu lệnh trong thân vòng lặp trước rồi mới
 kiểm tra điều kiện nên các câu lệnh nằm trong thân vòng lặp sẽ được thực hiện ít nhất là một lần.
 */
public class TinhTongCacSoNguyen {
    public static void main(String[] args) {
        int sum = 0, n;
        do {
            System.out.print("Enter your number: ");
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
            sum += n;
        } while (sum <= 50);
        System.out.print("Total = " + sum);
    }
}
