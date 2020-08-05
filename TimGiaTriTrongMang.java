import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] array={"a","b","c","x","a"};
        System.out.println("Bạn muốn tìm gì");
        String timPhanTu=scanner.nextLine();
        boolean k=true;
        for (int i = 0; i <array.length ; i++) {
            if (timPhanTu.equals(array[i])){
                k=false;
                System.out.println("nằm ở vị trí thứ "+(i+1));

            }

        }
        if (k==true){
            System.out.println("nó không có thì tìm sao được");

        }

    }
}
