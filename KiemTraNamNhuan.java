import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        int year;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap năm vao đê");
        year=scanner.nextInt();
        boolean b=false;
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    b = true;
                }
            } else {
                b = true;
            }
        }

        if(b){
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }


    }
}
