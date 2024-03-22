public class PhanSo {
    private int tuSo;
    private int mauSo;
    private static int soPS = 0;

    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
        soPS++;
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        soPS++;
    }
    public void setTuSo(int tuSo){
        this.tuSo=tuSo;
    }
    public void setMauSo(int mauSo){
        this.mauSo=mauSo;
    }
    public int getTuSo() {
        return tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public int getSoPS() {
        return soPS;
    }

    public static int uocChungLN(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    public void hienThi(){
        System.out.printf("%d/%d",tuSo, mauSo );
        System.out.println();
    }
    public static PhanSo rutGon(PhanSo ps){
        int x= ps.tuSo/uocChungLN(ps.tuSo, ps.mauSo);
        int y=ps.mauSo/uocChungLN(ps.tuSo, ps.mauSo);
        return new PhanSo(x, y);
    }
    public PhanSo congPS(PhanSo ps){
        int x=(this.tuSo*ps.mauSo)+(this.mauSo*ps.tuSo);
        int y=(this.mauSo*ps.mauSo);
        return new PhanSo(x, y);
    }
    public PhanSo truPS(PhanSo ps){
        int x=(this.tuSo*ps.mauSo)-(this.mauSo*ps.tuSo);
        int y=(this.mauSo*ps.mauSo);
        return new PhanSo(x, y);
    }
    public PhanSo nhanPS(PhanSo ps){
        int x=this.tuSo*ps.tuSo;
        int y=this.mauSo*ps.mauSo;
        return new PhanSo(x, y);
    }
    public PhanSo chiaPS(PhanSo ps){
        int x=this.tuSo*ps.mauSo;
        int y=this.mauSo*ps.tuSo;
        return new PhanSo(x,y);
    }
    public void sosanhPS(PhanSo ps){
        double ps1=(double) this.tuSo/this.mauSo;
        double ps2=(double) ps.tuSo/ps.mauSo;
        if(ps1==ps2){
            System.out.println("Hai phan so bang nhau !!!");
        }
        else if(ps1>ps2){
            System.out.printf("Phan so %d/%d lon hon !!!", this.tuSo, this.mauSo);
        }
        else{
            System.out.printf("Phan so %d/%d nho hon !!!",this.tuSo,this.mauSo);

        }
    }
    
    public static void duyetMangPS(PhanSo []a){
        for(int i=0;i<a.length;i++){
            a[i].hienThi(); 
        }
    }

    public static void main(String[] args) {
        PhanSo ps1=new PhanSo();
        PhanSo ps2=new PhanSo(6, 7);
        PhanSo ps3=new PhanSo(1,6);
        //System.out.println("uoc chung lon nhat cua phan so: "+uocChungLN(56, 84));
        //ps2.hienThi();
        //System.out.println();
        //rutGon(ps2).hienThi();
        rutGon(ps2.congPS(ps3)).hienThi();
        rutGon(ps2.truPS(ps3)).hienThi();
        rutGon(ps2.nhanPS(ps3)).hienThi();
        rutGon(ps2.chiaPS(ps3)).hienThi();
        ps2.sosanhPS(ps3);

        PhanSo []a=new PhanSo[5];
        a[0]=new PhanSo(1, 2);
        a[1]=new PhanSo(6, 7);
        a[2]=new PhanSo(1,6);
        a[3]= new PhanSo(3, 4);
        a[4]=new PhanSo(5, 6);
        duyetMangPS(a);
    }
}
