package sec4;

import java.util.Scanner;

public class User {
    public int id;
    public String ten;
    public int tien;
    public int soluong;
    public int getSoluong(){
        return soluong;
    }
    public User(int id,String ten,int tien,int soluong) {
        this.id=id;
        this.ten=ten;
        this.tien=tien;
        this.soluong=soluong;
        setSoluong(5);
    }
    public void setSoluong(int soluong){
        if (0<soluong&&soluong<10){
            System.out.println("So luong con la: "+soluong);
        }
    }
    public void Nhap(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap id ");
        id=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ten ");
        ten=scanner.nextLine();
        System.out.println("Nhap tien ");
        tien=scanner.nextInt();
        scanner.nextLine();
        System.out.println("So luong ");
        soluong=scanner.nextInt();
    }
    public void In(){
        System.out.println("Nhap id: "+id);
        System.out.println("Nhap ten: "+ten);
        System.out.println("Nhap tien: "+tien);
        System.out.println("So luong: "+soluong);
    }

    public static void main(String args[]){
        User u1=new User(1,"Nguyen Van A",12000,1);
        u1.Nhap();
        u1.In();
        User u2=new User(2 ,"Nguyen Van B",12400,3);
        u2.Nhap();
        u2.In();
        User u3=new User(3,"Nguyen Van C",13000,4);
        u3.Nhap();
        u3.In();
    }
}
