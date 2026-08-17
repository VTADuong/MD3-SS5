import java.util.Scanner;

public class Ex5_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi chữ cái cần nén: ");
        String input = sc.nextLine();

        String compressedString = compressString(input);
        System.out.println("Chuỗi sau khi nén: " + compressedString);

        sc.close();
    }
    public static String compressString(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        char currentChar = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                count++;
            } else {
                sb.append(currentChar).append(count);
                currentChar = s.charAt(i);
                count = 1;
            }
        }
        sb.append(currentChar).append(count);

        return sb.toString();
    }
}
