import java.util.Scanner;

public class CheckAnswerTrueFalse {
    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("Cách nào cho phép người dùng khai báo "
                    + "1 giá trị số nguyên trong 4 đáp án sau?");
            // dấu \" sẽ được hiển thị ra màn hình là "
            System.out.println("a. int number = 123;");
            System.out.println("b. int number = \"123\";");
            System.out.println("c. int number = '1';");
            System.out.println("d. boolean number = 1;");

            String result;
            Scanner scan = new Scanner(System.in);

            do {
                System.out.println("Nhập vào câu trả lời: ");
                result = scan.nextLine();
            } while (!result.equals("a") && !result.equals("b") && !result.equals("c") && !result.equals("d"));

            switch (result) {
                case "a":
                    System.out.println("Kết quả đúng!");
                    System.exit(0);
                    break;
                case "b":
                case "c":
                case "d":
                    System.out.println("Bạn chọn không đúng!");
                    break;
            }
        }
    }
}
