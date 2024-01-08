import java.util.Scanner;
import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        person person_1 = new person();
        chanle chanle1 = new chanle();
        // Tạo một đối tượng Scanner để nhập dữ liệu từ bàn phím

        // Nhập số nguyên từ người dùng
        System.out.print("Nhập vào một số nguyên N: ");
        int N = scanner.nextInt();

        // Gọi phương thức từ lớp NumberChecker để kiểm tra số chẵn hay số lẻ
        String result = chanle1.checkEvenOdd(N);

        // In kết quả ra màn hình
        System.out.println(N + " là " + result);

        //bài 6

        // Nhập ba số nguyên từ người dùng
        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập số nguyên c: ");
        int c = scanner.nextInt();

        // Kiểm tra xem a, b, c có tạo thành tam giác hay không
        if (Triangle.isTriangle(a, b, c)) {
            // Nếu là tam giác, tính diện tích và chu vi
            double area = Triangle.calculateArea(a, b, c);
            int perimeter = Triangle.calculatePerimeter(a, b, c);

            // In kết quả ra màn hình
            System.out.println("Ba số " + a + ", " + b + ", " + c + " tạo thành tam giác.");
            System.out.println("Diện tích tam giác là: " + area);
            System.out.println("Chu vi tam giác là: " + perimeter);
        } else {
            // Nếu không phải tam giác, thông báo cho người dùng
            System.out.println("Ba số " + a + ", " + b + ", " + c + " không tạo thành tam giác.");
        }

        // Đóng đối tượng Scanner sau khi sử dụng
        scanner.close();

        //bài 7

        // Nhập vào 4 số nguyên từ người dùng
        System.out.print("Nhập số nguyên thứ nhất: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Nhập số nguyên thứ ba: ");
        int thirdNumber = scanner.nextInt();
        System.out.print("Nhập số nguyên thứ tư: ");
        int fourthNumber = scanner.nextInt();

        // Tìm số lớn nhất của cặp (firstNumber, secondNumber)
        int maxFirstSecond = NumberFinder.findMax(firstNumber, secondNumber);

        // Tìm số lớn nhất của cặp (thirdNumber, fourthNumber)
        int maxThirdFourth = NumberFinder.findMax(thirdNumber, fourthNumber);

        // Tìm số lớn nhất trong tổng cả 4 số
        int maxNumber = NumberFinder.findMax(maxFirstSecond, maxThirdFourth);

        // In số lớn nhất ra màn hình
        System.out.println("Số lớn nhất là: " + maxNumber);

        // Đóng đối tượng Scanner sau khi sử dụng
        scanner.close();

        //bài 8
        // Nhập lựa chọn của người chơi (B, K, G)
        System.out.print("Chọn B (Búa), K (Kéo), hoặc G (Giấy): ");
        char playerChoice = scanner.next().toUpperCase().charAt(0);

        // Lựa chọn của máy (B, K, G)
        char computerChoice = getRandomChoice();

        System.out.println("Lựa chọn của máy: " + computerChoice);

        // Kiểm tra và in ra kết quả
        result = determineWinner(playerChoice, computerChoice);
        System.out.println(result);

        scanner.close();
    }

    private static char getRandomChoice() {
        char[] choices = {'B', 'K', 'G'};
        return choices[new Random().nextInt(choices.length)];
    }

    private static String determineWinner(char player, char computer) {
        if (player == computer) {
            return "Hòa nhau!";
        } else if ((player == 'B' && computer == 'K') ||
                (player == 'K' && computer == 'G') ||
                (player == 'G' && computer == 'B')) {
            return "Bạn thắng!";
        } else {
            return "Bạn thua!";
        }

//        bài 10
        // Nhập giá trị của biến ký tự color
        // Nhập giá trị của biến ký tự color
//bài 11\






    }
}