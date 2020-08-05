import java.util.Scanner;

public class HienThuCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("mời bạn lựa chọn");
        System.out.println("1:hình chữ nhật");
        System.out.println("2:hình tam giác vuông,có cạnh góc vuông ở botton-left");
        System.out.println("3:hình tam giác vuông,có cạnh góc vuông ở top-left ");
        int soCanNhap=scanner.nextInt();
        switch (soCanNhap){
            case 1:
                for (int i = 0; i <3 ; i++) {
                    for (int j = 0; j <10 ; j++) {
                        System.out.print("*");

                    }
                    System.out.printf("\n");

                }
                break;
            case 2:
                for (int i = 0; i <5 ; i++) {
                    for (int j = 0; j <=i ; j++) {
                        System.out.print("*");

                    }
                    System.out.println();

                }
                break;
            case 3:
                for (int i = 5; i >=0 ; i--) {
                    for (int j = 0; j <=i ; j++) {
                        System.out.print("*");

                    }
                    System.out.println();

                }
                break;
        }




    }
}
