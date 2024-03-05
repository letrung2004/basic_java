import java.util.Scanner;
public class bai3 {
    private String mail;
    
    public void setMail(){
        Scanner sc=new Scanner(System.in);
        mail=sc.nextLine();
    }
    public void chuoiXuat(){
       System.out.println(mail.substring(0,mail.indexOf("@")));
    }
    public static void main(String[] args) {
        bai3 MAIL=new bai3();
        System.out.print("Nhap vao email: ");
        MAIL.setMail();
        MAIL.chuoiXuat();
    }

}
