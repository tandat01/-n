package sec5;

import java.util.Scanner;

public class Student {
    public int Masinhvien;
    public Double Diemtrungbinh;
    public int Tuoi;
    public String Lop;


    public Student() {
    }

    public Student(int masinhvien, Double diemtrungbinh, int tuoi, String lop) {
        Masinhvien = masinhvien;
        Diemtrungbinh = diemtrungbinh;
        Tuoi = tuoi;
        Lop = lop;
    }

    public int getMasinhvien() {
        return Masinhvien;
    }

    public void setMasinhvien(int masinhvien) {
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
        Masinhvien=scanner.nextInt();
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

        if (Masinhvien>=8) {
            System.out.println("Nhap ma: "+Masinhvien);
        } else
            System.out.println("vui long nhap lai");
        if ((0 < Diemtrungbinh)&&(Diemtrungbinh <= 10)) {
            System.out.println("Diem la: "+Diemtrungbinh);
        }else
            System.out.println("Khong dung nhap lai");
        if (Tuoi>=18){
            System.out.println("Nhap tuoi: "+Tuoi);
        }else
            System.out.println("Khong duoc nhap lai");
        String s1="A";
        String s2="C";
        if ((Lop==s1)||(Lop==s2)){
            System.out.println("Nhap lop: "+Lop);
        }else
            System.out.println("Nhap lai");

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


