import java.util.Scanner;

public class PhuongTrinhBacHai {
    private double a,b,c;
    public PhuongTrinhBacHai(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;

    }

    public double getA() {
        return a;

    }
    public double getB() {
        return b;

    }
    public double getC() {
        return c;

    }
    public double canBacHai(){
        return b*b-4*a*c;
    }
    public double nghiemThuNhat(){
        return (-b+Math.pow(b*b-4*a*c,0.5))/2*a;
    }
    public double nghiemThuHai(){
        return (-b-Math.pow(b*b-4*a*c,0.5))/2*a;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập a vào:");
        double q=scanner.nextDouble();
        System.out.println("nhập b vào:");
        double w=scanner.nextDouble();
        System.out.println("nhập c vào:");
        double e=scanner.nextDouble();
        PhuongTrinhBacHai i=new PhuongTrinhBacHai(q,w,e);
        System.out.println("tenta bằng:"+i.canBacHai());
        if (i.canBacHai()==0){
            System.out.println("có 1 nghiệm duy nhất:"+i.nghiemThuHai());

        }
        else if (i.canBacHai()<0){
            System.out.println("éo có nghiệm nào");
        }
        else {
            System.out.println("nghiệm thứ nhất là:"+i.nghiemThuNhat());
            System.out.println("nghiệm thứ hai là:"+i.nghiemThuHai());
        }




    }
}
