import java.util.Scanner;

public  class LopHinhChuNhat {
  private   double chieuDai,chieuRong;


    public LopHinhChuNhat() {
    };
    public LopHinhChuNhat(double chieuDai,double chieuRong){
        this.chieuDai=chieuDai;
        this.chieuRong=chieuRong;
    };
    public double chuVi(){
        return (this.chieuRong+this.chieuDai)*2;
    }
    public double dienTich(){
        return this.chieuDai*this.chieuRong;
    }
    public String display() {
        return "Rectangle{" + "chieu dai=" + chieuDai + ", chiều rộng=" + chieuRong + "}";
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("mời bạn nhập vào");
        double chieuDai=scanner.nextDouble();
        double chieuRong=scanner.nextDouble();
        LopHinhChuNhat s=new LopHinhChuNhat(chieuDai,chieuRong);
        System.out.println("thông tin"+s.display());
        System.out.println("chu vi là:"+s.chuVi());
        System.out.println("diện tích là:"+s.dienTich());

    }
}
/*import java.util.Scanner;

public class LopHinhChuNhat {
    double chieuDai,chieuRong;

    public LopHinhChuNhat() {
    };
    public LopHinhChuNhat(double chieuDai,double chieuRong){
        this.chieuDai=chieuDai;
        this.chieuRong=chieuRong;
    };
    public double chuVi(){
        return (this.chieuRong+this.chieuDai)*2;
    }
    public double dienTich(){
        return this.chieuDai*this.chieuRong;
    }
    public String display() {
        return "Rectangle{" + "chieu dai=" + chieuDai + ", chiều rộng=" + chieuRong + "}";
    }
    public void nhap(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("mời bạn nhập vào");
        this.chieuDai=scanner.nextDouble();
        this.chieuRong=scanner.nextDouble();
    }
    public void xuat(){
        System.out.println("thông tin"+this.display());
        System.out.println("chu vi là:"+this.chuVi());
        System.out.println("diện tích là:"+this.dienTich());

    }

    public static void main(String[] args) {

        LopHinhChuNhat s=new LopHinhChuNhat();
        s.nhap();
        s.xuat();

    }
}

 */
