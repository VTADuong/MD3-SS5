import java.util.Random;
import java.util.Scanner;

public class Ex5_7 {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập độ dài chuỗi n (1 <= n <= 1000): ");
        int n = sc.nextInt();

        if (n < 1 || n > 1000) {
            System.out.println("Độ dài n không hợp lệ! Vui lòng nhập trong khoảng [1, 1000].");
            sc.close();
            return;
        }

        String randomString = generateRandomString(n);

        System.out.println("\nChuỗi ngẫu nhiên được tạo (độ dài " + n + "):");
        System.out.println(randomString);

        sc.close();
    }

    public static String generateRandomString(int length) {
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();

        int charSetLength = CHARACTERS.length();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(charSetLength);

            sb.append(CHARACTERS.charAt(randomIndex));
        }

        return sb.toString();
    }
}
