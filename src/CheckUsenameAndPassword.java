import java.util.Scanner;

/*
Vì chúng ta không biết được khi nào người dùng sẽ nhập đúng username và password
nên sẽ không biết được số lần lặp, vì vậy chúng ta sử dụng vòng lặp do - while.
 */
public class CheckUsenameAndPassword {
    public static void main(String[] args) {
        String username = "tedd", password = "123456";
        String guestName, guestPassword;
        Scanner scan = new Scanner(System.in);

        do {
            //Enter your Name and Password
            System.out.print("Enter your Name: ");
            guestName = scan.nextLine();
            System.out.print("Enter your Password: ");
            guestPassword = scan.nextLine();
        } while (!username.equalsIgnoreCase(guestName) || (!password.equals(guestPassword)));

        System.out.println("Good night " + guestName);
    }
}

