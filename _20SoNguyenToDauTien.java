import java.util.Scanner;

public class _20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("bạn muốn hiện bao nhiêu số nguyên tố");
        int soNguyenTo=scanner.nextInt();
        int K=0;

        int cacSoNguyenTo = 2;
        while (K<soNguyenTo) {
            int L=1;
        double value =  Math.sqrt(cacSoNguyenTo);
            for (int i = 2; i <= value; i++) {
                if (cacSoNguyenTo % i == 0) {
                    L=0;
                    break;
                }
            }
            if (L==1){
                System.out.println(cacSoNguyenTo);
                K=K+1;
            }
            cacSoNguyenTo++;
        }

    }
}
