import java.util.Scanner;

public class DaoNguocPhanTuMang {
    public static void main(String[] args) {
        int toiDa;
        int[] array;
        int phanTu;
       Scanner scanner =new Scanner(System.in);
       do {
           System.out.println("bạn muốn mảng chứa bao nhiêu phần tử");
            toiDa=scanner.nextInt();
           if (toiDa>20){
               System.out.println("nhap lại đi bạn ê");
           }
       } while (toiDa>20);
       array=new int[toiDa];

        for (int i = 0; i <toiDa ; i++) {
            System.out.println("phần tử số "+(i+1)+" bạn muốn nhập bao nhiêu");
           phanTu=scanner.nextInt();
           array[i]=phanTu;


        }
        System.out.println("mảng bạn đã khởi tạo là");
        System.out.print("Elements in array: ");
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+"\t");

        }
        for (int i = 0; i <array.length/2 ; i++) {
            int k;
            k=array[i];
            array[i]=array[toiDa-1-i];
            array[toiDa-1-i]=k;

        }
        for (int j = 0; j <array.length ; j++) {
            System.out.print(array[j]+"\t");
        }


    }
}
// hiểu được mảng trong java luôn phải khai báo và khởi tạo,khai báo thì mọi thứ trong java
// khởi tạo phải kèm theo chiều dài của mảng.vì mảng ở đây không thêm,không bớt được
// chỉ có thể thay đổi các phần tử trong mảng

