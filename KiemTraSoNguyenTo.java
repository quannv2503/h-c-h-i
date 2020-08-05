import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("cho 1 số bất kì vào đi bạn ê");
        int soNguyenTo=scanner.nextInt();
        if (soNguyenTo<2){
            System.out.println(soNguyenTo+" không phải số nguyên tố");

        }
        else if (soNguyenTo==2){
            System.out.println("2 là số nguyên tố");

        }
        else{
            int k=1;
            for (int i = 2; i <=Math.sqrt(soNguyenTo) ; i++) {
                if (soNguyenTo%i==0){
                    k=0;
                    break;
                }


            }
            if (k==1){
                System.out.println(soNguyenTo+" là số nguyên tố");
            }
            if (k==0){
                System.out.println(soNguyenTo+" không phải số nguyên tố");

            }
        }
    }
}
