import java.util.Scanner;

public class Main {
    public static final Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            System.out.println("1. Add question.");
            System.out.println("2. Take a multiple-choice test.");
            System.out.println("3. Exit.");
            System.out.print("Enter your choice: ");
            int lc=sc.nextInt();
            sc.nextLine();
            CauHoi q=new CauHoi();
            switch (lc){
                case 1:
                    q.nhapCauHoi();
                    break;
                case 2:
                    q.luyenTap();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid selection!");
            }
        }

    }
}