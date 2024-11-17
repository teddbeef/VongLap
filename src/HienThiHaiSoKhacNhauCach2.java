/*
For in For
 */
public class HienThiHaiSoKhacNhauCach2 {
    public static void main(String[] args) {
        int n1, n2;
        // Vòng lặp for bên ngoài thực thi 3 lần với row = 1, 2, 3.
        for (n1 = 1; n1 <= 3; n1++) {
            // Mỗi lần lặp for bên ngoài
            // thì vòng lặp for trong sẽ thực thi 2 lần với col = 1, 2, 3.
            for (n2 = 1; n2 <= 3; n2++) {
                System.out.println("number 1 = " + n1 + " number 2 = " + n2);
            }
        }
    }
}
