public class TinhTrungBinhCong {
    public static void main(String[] args) {
        int sum = 0, i;
        float avgNumber;
        for (i = 1; i <= 6; i++) {
            sum += i;
            System.out.println(sum + " ");
        }
        avgNumber = (float) sum / 6;
        System.out.println("Trung binh cong cua tong: " + sum + " va so phan tu: " + i + " la " + avgNumber);
    }
}
