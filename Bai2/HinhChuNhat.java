public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    public double tinhDienTich(){
        return this.chieuDai*this.chieuRong;
    }
    public double tinhChuVi(){
        return (this.chieuRong+this.chieuDai)*2;
    }
    public String toString(){
        return " Hinh chu nhat \n Chu vi: "+tinhChuVi()+"\n Dien tich: "+tinhDienTich();
    }
}
