
public class DoanThang {
    private Diem A;
    private Diem B;
     public DoanThang(Diem A, Diem B){
        this.A=A;
        this.B=B;
     }
     public void setA(Diem a) {
         this.A = a;
     }
     public void setB(Diem b){
        this.B = b;
     }
     public Diem getA(){
        return A;
     }
     public Diem getB(){
        return B;
     }
     public static void hienThiDT(Diem A, Diem B){
        System.out.printf("%c%c[(%.2f,%.2f),(%.2f,%.2f)]", A.getPoint(),B.getPoint(),A.getX(),A.gety(),B.getX(),B.gety());
     }
    public static Diem mid(Diem A, Diem B){
        char M='M';
        double x=((A.getX()+B.getX())/2);
        double y=((A.gety()+B.gety())/2);
        return new Diem(M, x, y);
    }

    public static boolean check(Diem A,Diem B,Diem C,Diem D){
        double v1=(A.getX()-B.getX())/(A.gety()-B.gety());
        double v2=(C.getX()-D.getX())/(C.gety()-D.gety());
        if(v1==v2){
            return true;
        }
        else{
            return false;
        }
    }


    public static void main(String[] args) {
       Diem A= new Diem('A',2, 1);
       Diem B=new Diem('B', -4, 9);
       hienThiDT(A, B);
       System.out.println();
       Diem C=new Diem('C', 2, -3);
       Diem D=new Diem('D', -4, 6);
       hienThiDT(C, D);
       System.out.println();
       System.out.print("Trung diem AB: ");
       mid(A, B).hienThi();
       if(check(A, B, C, D)){
            System.out.println("Song song");
       }
       else {
        System.out.println("Khong song song");
       }

    }
}
