public class phanso {
    public int x,y;
    public phanso(){
        x=0;
        y=1;
     }
    public phanso(int x, int y){
        this.x=x;
        this.y=y;
    }
    public phanso(int x){
        this.x=x;
        this.y=1;
    }
   
    public phanso cong(phanso other){
        int newx=(this.x*other.y)+(other.x*this.y);
        int newy=this.y*other.y;
        return new phanso(newx,newy);
    }
    public void hienThi(){
        System.out.println(x+"/"+y);
    }
}
