package sec5;

import java.util.Scanner;

public class Student {
    public String Masinhvien;
    public Double Diemtrungbinh;
    public int Tuoi;
    public String Lop;


    public Student() {
    }

    public Student(String masinhvien, Double diemtrungbinh, int tuoi, String lop) {
        Masinhvien = masinhvien;
        Diemtrungbinh = diemtrungbinh;
        Tuoi = tuoi;
        Lop = lop;
    }

    public String getMasinhvien() {
        return Masinhvien;
    }

    public void setMasinhvien(String masinhvien) {
        Masinhvien = masinhvien;
    }

    public Double getDiemtrungbinh() {
        return Diemtrungbinh;
    }

    public void setDiemtrungbinh(Double diemtrungbinh) {
        Diemtrungbinh = diemtrungbinh;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String lop) {
        Lop = lop;
    }
    public void inputInfo(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap Ma sinh vien: ");
        Masinhvien=scanner.nextLine();
        scanner.nextLine();
        System.out.println("Nhap Diem trung binh: ");
        Diemtrungbinh=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        Tuoi=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap lop: ");
        Lop=scanner.nextLine();
    }
    public void showInfo(){
        while (Masinhvien.equals(8)){
            System.out.println("Nhap lai: ");
        }
        System.out.println("Ma sinh vien la: "+Masinhvien);
        if ((0 < Diemtrungbinh)&&(Diemtrungbinh <= 10)) {
            System.out.println("Diem la: "+Diemtrungbinh);
        }else
            System.out.println("Khong dung nhap lai");
        if (Tuoi>=18){
            System.out.println("Nhap tuoi: "+Tuoi);
        }else
            System.out.println("Khong duoc nhap lai");
        System.out.println("Lop la: "+Lop);

    }
    public void Xetdiem(){
        if (Diemtrungbinh>8){
            System.out.println("Duoc  hoc bong ");
        }else
            System.out.println("Khong duoc hoc bong ");
    }




    public static void main(String args[]){
        Student student=new Student();
        student.inputInfo();
        student.showInfo();
        student.Xetdiem();

    }
}


