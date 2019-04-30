package sec5;

import java.util.Scanner;

public class NhanVien {
    public String Ten;
    public int Tuoi;
    public String Diachi;
    public double TienLuong;
    public int Tonggiolam;

    public NhanVien() {
    }

    public NhanVien(String ten, int tuoi, String diachi, double tienLuong, int tonggiolam) {
        Ten = ten;
        Tuoi = tuoi;
        Diachi = diachi;
        TienLuong = tienLuong;
        Tonggiolam = tonggiolam;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public double getTienLuong() {
        return TienLuong;
    }

    public void setTienLuong(double tienLuong) {
        TienLuong = tienLuong;
    }

    public int getTonggiolam() {
        return Tonggiolam;
    }

    public void setTonggiolam(int tonggiolam) {
        Tonggiolam = tonggiolam;
    }
    public void inputInfo(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ten: ");
        Ten=scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        Tuoi=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Dia chi : ");
        Diachi=scanner.nextLine();
        System.out.println("Tien luong la: ");
        TienLuong=scanner.nextByte();
        System.out.println("Tong gio lam: ");
        Tonggiolam=scanner.nextByte();
    }
    public void printInfo(){
        System.out.println("Ten la: "+Ten);
        System.out.println("Tuoi la: "+Tuoi);
        System.out.println("Dia chi la: "+Diachi);
        System.out.println("Tien la: "+TienLuong);
        System.out.println("Tong gio lam la: "+Tonggiolam);
    }
    public void tinhThuong(){
        if (Tonggiolam>=200){
            TienLuong=TienLuong+(TienLuong*0.2);
        }else if (100<=Tonggiolam&&Tonggiolam<200){
            TienLuong=TienLuong+(TienLuong*0.1);
        }else if (Tonggiolam<100){
            System.out.println("Khong duoc thuong");
        }
            System.out.println("Tong tien luong va thuong la: "+TienLuong);
    }
}
