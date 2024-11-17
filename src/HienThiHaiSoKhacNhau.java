import java.util.Scanner;

/*
Vòng lặp for có biểu_thức_1 và biểu_thức_3 có 2 biểu thức đơn
 */
public class HienThiHaiSoKhacNhau {
    public static void main(String[] args) {
        int n1, n2;
        /*
         * Khởi tạo biến number1 = 0 và number2 = number1 + 3.
         * Nếu number2 còn nhỏ hơn 8 thì hiển thị biến number1 và number2
         * Tăng biến number1 và number2 lên 1 và tiếp tục kiểm tra.
         */
        for (n1 = 0, n2 = n1 + 3; n2 < 10; n1++, n2++) {
            System.out.println(n1 + " , " + n2);
        }
    }
}
