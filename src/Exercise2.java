import java.util.Scanner;

public class Exercise2 {
    // [Bài tập] Tìm chuỗi tăng dần có độ dài lớn nhất
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        String newStr = incrementSubString(str);
        System.out.println("Increment Sub String: " + newStr);
    }

    public static String incrementSubString(String str) {
        StringBuilder sb = new StringBuilder();
        char temp = str.charAt(0);
        int minChar = temp;
        sb.append(temp);

        for (int i = 1; i < str.length(); i++) {
            temp = str.charAt(i);
            if (temp >= minChar) {
                minChar = temp;
                sb.append(temp);
            }
        }
        return sb.toString();
    }
}
