/*Viết chương trình duyệt vòng lặp từ 10 trở về 0 nhưng chỉ hiển thị các số từ 10 trở về 5.*/
public class HienThiSo {
    public static void main(String[] args) {
        int n;
        for (n = 10; n >= 0; n--){
            System.out.println(n);
            if(n <= 5){
                break;
            }
        }
    }
}
