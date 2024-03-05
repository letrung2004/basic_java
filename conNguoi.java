public class conNguoi {
    public String name;
    public int age;
    public String address;

    public conNguoi(String ten, int tuoi, String diaChi){
        this.name=ten;
        this.age=tuoi;
        this.address=diaChi;
    }

    public void getInfo(){
        System.out.println("Ten: "+this.name);
        System.out.println("Tuoi: "+this.age);
        System.out.println("Dia Chi: "+this.address);
    }
}
