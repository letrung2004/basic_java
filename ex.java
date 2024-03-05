public class ex {
    private static int n;
    public ex() {
    n = 3;
    }
    public void inc() {
    n++;
    }
    public static int getN() {
    return n;
    }
    public static void main(String[] args) {
        ex t1 = new ex();
        t1.inc();
        t1.inc();
        ex t2 = new ex();
        t2.inc();
        System.out.print(ex.getN());
    }
    
}
    
   