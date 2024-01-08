public class Triangle {
        // Phương thức kiểm tra xem a, b, c có tạo thành tam giác hay không
        public static boolean isTriangle(int a, int b, int c) {
            return (a > 0 && b > 0 && c > 0) && (a + b > c) && (a + c > b) && (b + c > a);
        }

        // Phương thức tính diện tích của tam giác
        public static double calculateArea(int a, int b, int c) {
            double s = (a + b + c) / 2.0;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }

        // Phương thức tính chu vi của tam giác
        public static int calculatePerimeter(int a, int b, int c) {
            return a + b + c;
        }
    }

