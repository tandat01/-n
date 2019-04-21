import com.sun.tools.javac.Main;

import java.util.Scanner;

public class NhanVien {
    public int Maso ;
    public String Ten;
    public int Tuoi;
    public int Nam;
    public double Luong;
    public void ThongTin (){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ma so");
        Maso=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap Ten");
        Ten=scanner.nextLine();
        scanner.nextLine();
        System.out.println("Nhap Tuoi");
        Tuoi=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap so nam");
        Nam=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap luong ");
        Luong=scanner.nextFloat();

    }
    public void InThongTin (){
        System.out.println("Ma so:"+Maso);
        System.out.println("Ten:"+Ten);
        System.out.println("Tuoi:"+Tuoi);
        System.out.println("So nam:"+Nam);
        System.out.println("Luong:"+Luong);

    }
    public void TinhThuong (){
        if (Nam<=1){
           Luong=Luong+(Luong*0.2);
        }else if (1<Nam&&Nam<=2){
            Luong=Luong+(Luong*0.5);
        }else
            Luong=Luong+(Luong*0.5);
        System.out.println("Tong luong va tien thuong:"+Luong);
    }
    public static void main(String args[]){
        NhanVien nhanVien=new NhanVien();
        nhanVien.ThongTin();
        nhanVien.InThongTin();
        nhanVien.TinhThuong();
    }
}
