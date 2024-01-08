import java.util.Scanner;

public class luong {
    private int luong;
    private int phucap;
    private int ngaycong;
    private int ngaylam;

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public int getPhucap() {
        return phucap;
    }

    public void setPhucap(int phucap) {
        this.phucap = phucap;
    }

    public int getNgaycong() {
        return ngaycong;
    }

    public void setNgaycong(int ngaycong) {
        this.ngaycong = ngaycong;
    }

    public int getNgaylam() {
        return ngaylam;
    }

    public void setNgaylam(int ngaylam) {
        this.ngaylam = ngaylam;
    }
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.printf("Nhập lương của bạn: \n ");
        luong = sc.nextInt();
        System.out.printf("Nhập phụ cấp: \n ");
        phucap = sc.nextInt();
        System.out.printf("Nhập ngày công của bạn: \n");
        ngaycong = sc.nextInt();
        System.out.println("Bạn đã làm được bao ngày: \n");
        ngaylam = sc.nextInt();

    }

    void output(){
        System.out.println("Bạn có lương là " + this.luong);
        System.out.println("Phụ cấp bạn có là " + this.phucap);
        System.out.println("Tháng này có số ngày công là " + this.ngaycong);
        System.out.println("Số ngày bạn làm được là " + this.ngaylam);
    }

    void tinhluong(){
        int Nluong = (this.luong + this.phucap) / (this.ngaycong * this.ngaylam);
        System.out.println("Bạn nhận được số lương là " + Nluong);
    }


}
