import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chỉ số cũ và chỉ số mới
        System.out.print("Nhập chỉ số cũ: ");
        int chiSoCu = scanner.nextInt();

        System.out.print("Nhập chỉ số mới: ");
        int chiSoMoi = scanner.nextInt();

        // Kiểm tra chỉ số mới phải lớn hơn chỉ số cũ
        if (chiSoMoi < chiSoCu) {
            System.out.println("Chỉ số mới không được nhỏ hơn chỉ số cũ.");
            scanner.close();
            return;
        }

        // Tính số KW sử dụng
        int soKW = chiSoMoi - chiSoCu;

        // Tính tiền điện
        double tienDinhMuc = calculateDinhMuc(soKW);
        double tienVuotDinhMuc = calculateVuotDinhMuc(soKW);

        // Tính tổng tiền
        double tongTien = tienDinhMuc + tienVuotDinhMuc;

        // In ra kết quả
        System.out.println("Chỉ số cũ: " + chiSoCu);
        System.out.println("Chỉ số mới: " + chiSoMoi);
        System.out.println("Tiền trả định mức: " + tienDinhMuc + " đồng");
        System.out.println("Tiền trả vượt định mức: " + tienVuotDinhMuc + " đồng");
        System.out.println("Tổng tiền phải trả: " + tongTien + " đồng");

        scanner.close();
    }

    private static double calculateDinhMuc(int soKW) {
        return 50 * 230; // Định mức 50 KW với giá 230đ/KW
    }

    private static double calculateVuotDinhMuc(int soKW) {
        double tienVuotDinhMuc = 0;

        if (soKW > 50 && soKW <= 100) {
            tienVuotDinhMuc = (soKW - 50) * 700;
        } else if (soKW > 100) {
            tienVuotDinhMuc = 50 * 700 + (soKW - 100) * 900;
        }

        return tienVuotDinhMuc;
    }
}
