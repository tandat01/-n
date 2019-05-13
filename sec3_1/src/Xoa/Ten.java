package Xoa;

public class Ten {
     String Ten;
     String phone;

    public Ten() {
    }

    public Ten(String ten, String phone) {
        Ten = ten;
        this.phone = phone;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
