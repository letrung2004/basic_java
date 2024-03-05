public class giaiPT {
    public int a,b,c;
    public double denta;
    public double x,y;
    public double candenta;
    public giaiPT(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    } 
    
    public void tinhDenta(){
        denta= (b*b)-(4*a*c);
    }
    public void tinhCanDenta(){
        candenta=Math.sqrt(denta);
    }
    
    public void ketQua(){
        if(denta<0){
            System.out.println("Phuong trinh vo nghiem !");
        }
        else if(denta==0){
            x=-b/(2*a);
            System.out.print("Phuong trinh co nghiem kep: x = y = ");
            System.out.println(x);
        }
        else {
           x=(-b+candenta)/(2*a);
           y=(-b-candenta)/(2*a);
           System.out.println("Phuong trinh co hai nghiem phan biet: ");
           System.out.print("x=");
           System.out.println(x);
           System.out.print("y=");
           System.out.println(y);
        }
    }

}
