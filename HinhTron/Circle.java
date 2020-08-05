package HinhTron;

public class Circle {
    private double banKinh;
    private String mauSac;

    public Circle() {
    }

    public Circle(double banKinh, String mauSac) {
        this.banKinh = banKinh;
        this.mauSac = mauSac;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    public double dienTich(){
        return Math.PI*banKinh*banKinh;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "banKinh=" + banKinh +
                ", mauSac='" + mauSac + '\'' +
                '}';
    }
}
