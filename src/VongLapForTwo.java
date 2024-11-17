/*
Vòng lặp for không có biểu_thức_1 và biểu_thức_3 (ý nghĩa giống vòng lặp while)
 */
public class VongLapForTwo {
    public static void main(String[] args) {
        int sum = 0, i = 1;
        for (; sum < 10; ) {
            sum += i;
            i++;
            System.out.println(sum);
        }
    }
}
