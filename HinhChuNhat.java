public class HinhChuNhat {
    private Diem topLeft;
    private Diem bottomRight;
    public HinhChuNhat(Diem topLeft, Diem bottomRight){
       this.topLeft= topLeft;
       this.bottomRight=bottomRight;
    }
    public void setTopLeft(Diem topLeft){
        this.topLeft= topLeft;
    }
    public void setBottomRight(Diem bottomRight){
        this.bottomRight=bottomRight;
    }
    public Diem getTopLeft(){
        return this.topLeft;
    }
    public Diem getBottomRight(){
        return this.bottomRight;
    }
    public double chieuDai(Diem bottomRight){
        return Math.abs(bottomRight.getX())-Math.abs(bottomRight.gety());
    }
    public double chieuRong(Diem topLeft){
        return Math.abs(topLeft.gety())-Math.abs(topLeft.getX());
    }
    public double dienTich(Diem topLeft, Diem bottomRight){
        return chieuDai(bottomRight)*chieuRong(topLeft);
    }
    public double chuVi(Diem topLeft, Diem bottomRight){
        return (chieuDai(bottomRight)+chieuRong(topLeft))*2;
    }
    public static void main(String[] args) {
        Diem topL= new Diem('A', -1, 3);
        Diem bottomR= new Diem('B', -4, 1);
        topL.hienThi();
        bottomR.hienThi();
        System.out.println();
        HinhChuNhat HCN=new HinhChuNhat(topL, bottomR);
        System.out.println("Dien tich HCN la: "+HCN.dienTich(topL,bottomR));
        System.out.println("Chu vi HCN la: "+HCN.chuVi(topL, bottomR));
        System.out.println();
    }
}
