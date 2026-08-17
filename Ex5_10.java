import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex5_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập đoạn văn bản cần xử lý:");
        String input = sc.nextLine();

        if (input == null || input.trim().isEmpty()) {
            System.out.println("Không có văn bản để xử lý.");
            sc.close();
            return;
        }

        List<String> numbers = extractNumbers(input);

        String cleanText = input.replaceAll("[^a-zA-Z0-9\\s]", "");

        String normalizedText = cleanText.toLowerCase()
                .replaceAll("\\s+", " ")
                .trim();

        System.out.println("\n--- KẾT QUẢ XỬ LÝ ---");
        System.out.println("Văn bản đã chuẩn hóa: " + normalizedText);

        System.out.print("Danh sách các số tìm được: ");
        if (numbers.isEmpty()) {
            System.out.println("Không có số nào trong văn bản.");
        } else {
            System.out.println(numbers);
        }

        sc.close();
    }

    public static List<String> extractNumbers(String text) {
        List<String> numbersList = new ArrayList<>();

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            numbersList.add(matcher.group());
        }

        return numbersList;
    }
}
