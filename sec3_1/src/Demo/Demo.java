package Demo;

import java.util.Scanner;

public class Demo {
    public int id;
    public String name;
    public int age;
    public String address;
    public float gpa;

    public void NhapThongTin(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap id:");
        id=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ten:");
        name=scanner.nextLine();
        System.out.println("Nhap tuoi:");
        age=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap address:");
        address=scanner.nextLine();
        System.out.println("Nhap diem:");
        gpa=scanner.nextFloat();
    }

    public void InThongTin(){
        System.out.println("Id la: "+id);
        System.out.println("Ten la: "+name);
        if (age>18){
            System.out.println("Tuoi la: "+age);
        }else {
            System.out.println("Khong du tieu chuan:");
        }
        System.out.println("Address la: "+address);
        if (gpa>5){
            System.out.println("Diem la: "+gpa);
        }else {
            System.out.println("Rot roi nhe thi lai di:");
        }
    }
    public void Dieukien(){
        if (gpa>8){
            System.out.println("Duoc hoc bong");
        }else {
            System.out.println("Khong dc hoc bong nhe");
        }
    }
    public static void main(String args[]){
        Demo demo=new Demo();
        demo.NhapThongTin();
        demo.InThongTin();
        demo.Dieukien();
    }




}
