import java.util.Arrays;
import java.util.Scanner;

public class Mang {
    public static void main(String[] args) {
        System.out.println("mời bạn nhập mảng");
        int[] array=new int[4];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <array.length; i++) {
            array[i]=scanner.nextInt();
        }
        Arrays.sort(array);
        for (int i = 0; i <array.length ; i++) {


            System.out.print(array[i]+" ");
        }
        System.out.print("\n phần tử nhỏ nhất là:"+array[0]);
        double tong=0;
        int u=0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]%3==0){
                tong+=array[i];
                u++;
            }
        }
        double l=tong/u;
        System.out.println("trung bình cộng số chia hết cho 3 là:"+l);
    }
}
