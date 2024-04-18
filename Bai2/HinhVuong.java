package Bai2;
public class HinhVuong extends HinhChuNhat{
    public HinhVuong(double canh) {
        super(canh, canh);
    }
    public String toString(){
        return " Hinh Vuong \n Chu vi: "+tinhChuVi()+"\n Dien tich: "+tinhDienTich();
    }
}
