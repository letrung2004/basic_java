import java.util.Scanner;
public class bai2 {
    private int n; // số lượng pt mảng và bậc của ptrinh
    private int a[]; 
    public int x,bac; // giá trị nguyên để tính f(x)
    public int kq=0;

    public void setN(int n){
        this.n=n;
        this.a=new int[n+1];
    }

    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        for(int i=0 ; i<=n ; i++){
            System.out.print("Nhap he so bac " + i + ": ");
            a[i]=sc.nextInt();
        }
    }
    public int LuyThua(int x, int n) {
        return (int) Math.pow(x, n);
    }

    public int GiaTriDaThuc(){
    for(int i=0; i<=n; i++){
        kq=a[i]*LuyThua(x,i)+kq;
    }
        return kq;
    }


    public void HienThi(){
        for(int i=0 ; i<=n ; i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        bai2 luythua=new bai2();
        System.out.print("Nhap vao so bac cua phuong trinh: ");
        Scanner s=new Scanner(System.in);
        luythua.bac=s.nextInt(); 
        System.out.print("Nhap vao he so cua da thuc: ");  
        luythua.x=s.nextInt(); 
        luythua.setN(luythua.bac);
        luythua.Nhap();
        System.out.print("Ket qua cua da thuc co he so "+luythua.x+" la:"+luythua.GiaTriDaThuc());
    }
}
