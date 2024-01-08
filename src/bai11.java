import java.util.Scanner;

public class bai11 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Nhập vào 2 số và toán tử
            System.out.print("Nhập số x: ");
            double x = scanner.nextDouble();

            System.out.print("Nhập số y: ");
            double y = scanner.nextDouble();

            System.out.print("Nhập toán tử (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            // Xử lý và in ra kết quả
            switch (operator) {
                case '+':
                    System.out.println(x + y);
                    break;
                case '-':
                    System.out.println(x - y);
                    break;
                case '*':
                    System.out.println(x * y);
                    break;
                case '/':
                    if (y != 0) {
                        System.out.println(x / y);
                    } else {
                        System.out.println("Không chia được, vui lòng nhập y khác 0.");
                    }
                    break;
                default:
                    System.out.println("Toán tử không hợp lệ.");
                    break;
            }

        }
}
