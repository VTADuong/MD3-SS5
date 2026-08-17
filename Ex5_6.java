import java.util.Scanner;

public class Ex5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mật khẩu cần kiểm tra: ");
        String password = sc.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Mật khẩu hợp lệ");
        } else {
            System.out.println("Mật khẩu không hợp lệ");
        }

        sc.close();
    }
    public static boolean isValidPassword(String password) {
        // Biểu thức chính quy thỏa mãn tất cả các điều kiện:
        // (?=.*[A-Z])       : Có ít nhất 1 chữ cái viết hoa
        // (?=.*[a-z])       : Có ít nhất 1 chữ cái viết thường
        // (?=.*\\d)         : Có ít nhất 1 ký tự số (\d)
        // (?=.*[@#$%!])     : Có ít nhất 1 ký tự đặc biệt (@, #, $, !, %)
        // .{8,}             : Độ dài tối thiểu 8 ký tự
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%!]).{8,}$";

        return password.matches(regex);
    }
}
