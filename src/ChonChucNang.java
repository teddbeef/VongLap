import java.util.Scanner;

public class ChonChucNang {
    public static void main(String[] args) {

        for (; ; ) {
            System.out.println("1. Input");
            System.out.println("2. View");
            System.out.println("3. Exit");

            int choiceNumber;
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.print("Enter the number do you want!: ");
                choiceNumber = scanner.nextInt();
            } while (choiceNumber > 3);

            switch (choiceNumber) {
                case 1:
                    System.out.println("You choose Input");
                    break;
                case 2:
                    System.out.println("You choose View");
                    break;
                case 3:
                    System.out.println("You choose Exit!! Good bye!");
                    System.exit(0);
                    break;
            }
        }
    }
}
