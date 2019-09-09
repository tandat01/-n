package secssion3;

import java.util.Scanner;

public class Tamgiac {
    public double canh_1;
    public double canh_2;
    public double canh_3;

    public void Kiemtratamgiac() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao canh thu nhat");
        canh_1 = scanner.nextInt();
        System.out.println("nhap vao canh thu hai");
        canh_2 = scanner.nextInt();
        System.out.println("nhap vao canh thu ba");
        canh_3 = scanner.nextInt();
        if ((canh_1+canh_2>canh_3)||(canh_2+canh_3>canh_1)||(canh_3+canh_1>canh_2)){
            System.out.println("day la ba canh cua tam giac");
        }else {
            System.out.println("khong phai nhap lai");
        }

    }
    public int tinhChuVi() {
        double chuVi;
        chuVi = (canh_1 + canh_2 + canh_3);
        System.out.println("Chu vi Tam giac la: " + chuVi);

        return 0;
    }
    public void Dientich(){
        double t=(canh_1+canh_2+canh_3)/2;
        double dt;
        dt=Math.sqrt(t*(t-canh_1)+(t-canh_2)+(t-canh_3));
        System.out.println("Dien tich Tam giac la: "+dt);
    }

}
