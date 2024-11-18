import java.util.Scanner;

public class Exercise5 {
    // [Optional] [Bài tập] Tìm chuỗi liên tiếp có độ dài lớn nhất
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        StringBuilder max = new StringBuilder();
        StringBuilder current = new StringBuilder();
        current.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {

            if ((int) s.charAt(i) < (int) s.charAt(i-1)) {
                current = new StringBuilder();
            }
            current.append(s.charAt(i));

            if (current.length() > max.length()) {
                max = new StringBuilder(current);
            }
        }

        System.out.println("Longest increment sub string: " + max);
    }
}
