import java.util.Scanner;

public class SoNgayTrongThang {
    public static void main(String[] args) {
        System.out.println("so ngay trong thang");
        Scanner scanner = new Scanner(System.in);
        System.out.println("thang bao nhieu ban ơi");
        int month = scanner.nextInt();
        switch (month) {
            case 2:
                System.out.println("thang 2 có 28 hoặc 29 ngày");
                break;
            case 3:
                System.out.println("thang 3 có 31 ngày");
                break;
        }
    }
}