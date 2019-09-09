package Xoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class XoaThem extends Them {
    public ArrayList<Ten> Danhsach = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
        for (Ten pn : Danhsach) {
            if (pn.getTen().equals(name)) {
                if (pn.getPhone().equals(phone)) {
                    System.out.println("So dien thoai da ton tai");
                } else {
                    pn.setPhone(pn.getTen() + ":" + phone);
                    System.out.println("Da them vao so cu");
                }
                return;
            }
        }
        Ten px = new Ten(name, phone);
        Danhsach.add(px);
    }

    @Override
    public void removePhone(String name) {
        for (Ten pn : Danhsach) {
            if (pn.getTen().equals(name)) {
                Danhsach.remove(pn);
                return;
            }
        }
    }

    @Override
    public void updatePhone(String name, String newphone) {
        for (Ten pn : Danhsach) {
            if (pn.getTen().equals(name)) {
                pn.setPhone(newphone);
            }
        }
    }

    @Override
    public void searchPhone(String name) {
        for (Ten pn : Danhsach) {
            if (pn.getTen().equals(name)) {
                System.out.println(pn.getTen() + ":" + pn.getPhone());
            }
        }
    }

    @Override
    public void sort() {
        Collections.sort(Danhsach, new Comparator<Ten>() {
            @Override
            public int compare(Ten o1, Ten o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });
    }

    public static void main(String[] args){
    }
}
