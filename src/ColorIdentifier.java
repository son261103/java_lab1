import java.util.Scanner;

public class ColorIdentifier{
    private char color;

    public ColorIdentifier(char color) {
        this.color = color;
    }

    public String identifyColor() {
        switch (Character.toUpperCase(color)) {
            case 'R':
                return "RED";
            case 'G':
                return "GREEN";
            case 'B':
                return "BLUE";
            default:
                return "BLACK";
        }
    }
}
class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập giá trị của biến ký tự color
        System.out.print("Nhập giá trị của biến ký tự color: ");
        String input = scanner.next();

        // Lấy ký tự đầu tiên từ chuỗi nhập
        char color = input.charAt(0);

        // Tạo đối tượng ColorIdentifier
        ColorIdentifier colorIdentifier = new ColorIdentifier(color);

        // In ra thông báo tương ứng với màu sắc
        System.out.println(colorIdentifier.identifyColor());

        scanner.close();
    }
}

