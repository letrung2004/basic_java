import java.util.Scanner;
public class bai1 {
    public double randomNum;
    public int newNum, yourNum;
    public void randomNumber(){
        randomNum=Math.random();
        randomNum=randomNum*100+1;
        newNum=(int) randomNum;
    }

    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.print("So ban doan: ");
        yourNum=sc.nextInt();
    }
    public boolean check(){
        if (yourNum>newNum) {
            System.out.println("So ban nhap lon hon ! ");
            return false;
        }
        else if(yourNum<newNum){
            System.out.println("So ban nhap nho hon ! ");
            return false;
        }
        else{
            System.out.println("Ban da nhap dung ! ");
            return true;
        }
    }
    public void hienThi(){
        System.out.println(newNum);
    }
    public static void main(String[] args) {
       bai1 num1=new bai1();
       num1.randomNumber();
       do {
        num1.nhap();
       } while (num1.check()==false);
       
      
    }
}
