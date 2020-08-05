import java.util.Scanner;

public class ChuyenTienTe {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("nhap so tien vao a ơi:");
        double a=scanner.nextFloat();
        System.out.println("USD");
        double b=2300*a;
        System.out.printf("đổi sang VN nha:%.3f",b);
    }
}
