import java.util.Scanner;

/*Viết chương trình duyệt vòng lặp từ 1 đến 10 nhưng chỉ hiển thị dòng chữ "Chào bạn" 3 lần,
 sau khi lặp đủ 3 lần thì thoát khỏi chương trình.
 */
public class ShowAnnoucement {
    public static void main(String[] args) {
        int count;
        for (count = 1; count <= 10; count++) {
            System.out.println("Hello my friend: " + count);

            if (count == 3) {
                break;
            }
        }
        System.out.println("See you later!!!");
    }
}
