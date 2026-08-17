import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex5_9 {
    private static final String URL_REGEX = "^(https?)://([^/:]+)((?:/.*)?)$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi URL cần kiểm tra: ");
        String inputUrl = sc.nextLine().trim();

        Pattern pattern = Pattern.compile(URL_REGEX);
        Matcher matcher = pattern.matcher(inputUrl);

        if (matcher.matches()) {
            System.out.println("\n--- URL HỢP LỆ ---");

            String protocol = matcher.group(1);
            String domain = matcher.group(2);
            String path = matcher.group(3);

            if (path.isEmpty()) {
                path = "Không có (hoặc /)";
            }

            System.out.println("Giao thức (Protocol) : " + protocol);
            System.out.println("Tên miền (Domain)     : " + domain);
            System.out.println("Đường dẫn (Path)      : " + path);
        } else {
            System.out.println("\nLỗi: Chuỗi vừa nhập không phải là URL hợp lệ!");
        }

        sc.close();
    }
}
