import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap ten ban");
        String name=scanner.nextLine();
        System.out.println("toi chao bạn đó,hello:"+name);
    }
}
