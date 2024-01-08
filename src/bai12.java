import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập điểm các môn thi
        System.out.print("Nhập điểm môn Toán: ");
        double toan = scanner.nextDouble();

        System.out.print("Nhập điểm môn Lý: ");
        double ly = scanner.nextDouble();

        System.out.print("Nhập điểm môn Hóa: ");
        double hoa = scanner.nextDouble();

        // Tính tổng điểm
        double tongDiem = toan + ly + hoa;

        // Kiểm tra và in ra kết quả
        if (tongDiem >= 15 && toan >= 4 && ly >= 4 && hoa >= 4) {
            System.out.println("Đậu");
            if (toan > 5 && ly > 5 && hoa > 5) {
                System.out.println("Học đều các môn");
            } else {
                System.out.println("Học chưa đều các môn");
            }
        } else {
            System.out.println("Thi hỏng");
        }

        scanner.close();
    }
}
