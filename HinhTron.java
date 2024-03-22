public class HinhTron {
    private Diem tamHT;
    private Diem bkHT;
    public HinhTron(Diem tamHT, Diem bkHT){
        this.tamHT=tamHT;
        this.bkHT=bkHT;
    }
    public void setBK(Diem bkHT){
        this.bkHT=bkHT;
    }
    public void setTam(Diem tamHT){
        this.tamHT=tamHT;
    }
    public Diem getTamHT(){
        return tamHT;
    }
    public Diem getBkHT(){
        return bkHT;
    }
    public double chieuDaiBK(Diem bkHT, Diem tamHT){
        return Math.sqrt(Math.pow((bkHT.getX()-tamHT.getX()), 2)+Math.pow((bkHT.gety()-tamHT.gety()), 2));
    }
    public double chuViHT(){
        return chieuDaiBK(bkHT, tamHT)*2*3.14;
    }
    public double dienTichHT(){
        return 3.14*Math.pow(chieuDaiBK(bkHT, tamHT), 2);
    }
    public double khoangCach(Diem M){
        return Math.sqrt(Math.pow((bkHT.getX()-M.getX()), 2)+Math.pow((bkHT.gety()-M.gety()), 2));
    }
    public void viTri(Diem M){
        if(khoangCach(M)>chieuDaiBK(bkHT, tamHT)){
            System.out.println("Diem M nam ngoai duong tron tam I !");
        }
        else if(khoangCach(M)<chieuDaiBK(bkHT, tamHT)){
            System.out.println("Diem M nam trong duong tron tam I !");
        }
        else{
            System.out.println("Diem M nam tren duong tron tam I !");
        }
    }

    public static void main(String[] args) {
        Diem I= new Diem('I', 2, 3);
        Diem R= new Diem('R', 5, 3);
        Diem M= new Diem ('M', 4,6);
        HinhTron O=new HinhTron(I, R);
        System.out.println("Chieu dai ban kinh la: "+  O.chieuDaiBK(R, I));
        System.out.println("Chu vi hinh tron la: "+O.chuViHT());
        System.out.println("Dien tich hinh tron la: "+O.dienTichHT());
        O.viTri(M);
       
    }
}
