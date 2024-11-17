import java.util.Scanner;

/*Viết chương trình hiển thị ra màn hình các số chẵn nhỏ hơn hoặc bằng 20, mỗi số được in ra phải nằm trên 1 dòng. */
public class HienThiSoChan {
    public static void main(String[] args) {
        int number, count = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number:");
        number = scan.nextInt();
        for (; number <= 20; number++) {
            if (number % 2 == 0) {
                System.out.println(number + " la so chan");
                count++;
            }
        }
        System.out.println("Have " + count + " so chan");
    }
}
