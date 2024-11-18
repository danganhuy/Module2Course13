import java.util.Scanner;

public class Exercise3 {
    // [Optional] [Thực hành] Tính độ phức tạp của thuật toán
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int[] frequentChar = new int[255];
        for (int i = 0; i < s.length(); i++) {
            int ascii = s.charAt(i);
            frequentChar[ascii] ++;
        }

        int max = frequentChar[0];
        char character = (char) 0;
        for (int i = 1; i < 255; i++) {
            if (frequentChar[i] > max) {
                max = frequentChar[i];
                character = (char) i;
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
}
