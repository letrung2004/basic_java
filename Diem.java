import java.util.Scanner;

public class Diem {
    private char poin;
    private double x; // hoành độ
    private double y; // tung độ

    public Diem(char poin, double x, double y){
        this.poin=poin;
        this.x=x;
        this.y=y;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    public double getX(){
        return this.x;
    }
    public double gety(){
        return this.y;
    }
    public char getPoint(){
        return poin;
    }
    public void hienThi(){
        System.out.printf("%c(%.2f,%.2f)", poin,x,y );
    }

    public static double khoangCach(double a, double b, double c, double d){
        double kc;
        kc=Math.sqrt((Math.pow((a-c), 2)+Math.pow((b-d), 2)));
        return kc;
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap vao diem: ");
        char diem=sc.next().charAt(0);
        System.out.print("Nhap vao toa do: ");
        double tung=sc.nextDouble();
        double hoanh=sc.nextDouble();
        Diem A=new Diem(diem,tung, hoanh);

        System.out.print("Nhap vao diem: ");
        char diem1=sc.next().charAt(0);
        System.out.print("Nhap vao toa do: ");
        double tung1=sc.nextDouble();
        double hoanh1=sc.nextDouble();
        Diem B=new Diem(diem1,tung1, hoanh1);
        A.hienThi();
        B.hienThi();
       System.out.println(khoangCach(tung,hoanh,tung1,hoanh1));

        sc.close();


    }

}
