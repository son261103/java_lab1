import java.util.Scanner;

public class bai13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số giờ làm và lương giờ
        System.out.print("Nhập số giờ làm: ");
        double soGioLam = scanner.nextDouble();

        System.out.print("Nhập lương giờ: ");
        double luongGio = scanner.nextDouble();

        // Tính số tiền lương tổng cộng
        double luongTotal = calculateSalary(soGioLam, luongGio);

        // In ra kết quả
        System.out.println("Tổng số tiền lương: $" + luongTotal);

        scanner.close();
    }

    private static double calculateSalary(double soGioLam, double luongGio) {
        double luongTotal;

        if (soGioLam > 40) {
            // Tính lương cho 40 giờ và giờ làm thêm
            double luong40Gio = 40 * luongGio;
            double luongThem = (soGioLam - 40) * 1.5 * luongGio;

            // Tổng lương
            luongTotal = luong40Gio + luongThem;
        } else {
            // Tính lương cho số giờ làm ít hơn hoặc bằng 40
            luongTotal = soGioLam * luongGio;
        }

        return luongTotal;
    }
}
