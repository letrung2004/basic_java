public class TamGiac {
    private double a;
    private double b;
    private double c;

    public TamGiac(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public boolean isTamGiac(){
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
    public double tinhCVTG(){
        double cv = 0;
        if(isTamGiac()){
           cv= this.a+this.b+this.c;
        }
        return cv;
    }

    public double tinhDTTG(){
        double dt=0;
        if(isTamGiac()){
            double nuaCV=tinhCVTG()/2;
           dt= Math.sqrt(nuaCV*(nuaCV-this.a)*(nuaCV-this.b)*(nuaCV-this.c));
        }
        return dt;
    }

    public String toString(){
        return " Tam Giac \n Chu vi: "+tinhCVTG()+"\n Dien tich: "+tinhDTTG();
    }

}
