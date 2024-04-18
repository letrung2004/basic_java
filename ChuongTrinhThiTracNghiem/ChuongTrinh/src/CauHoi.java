import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class CauHoi {
    public static final Scanner sc=new Scanner(System.in);
    private static final String folder="CauHoi/";
    private String cauHoi;
    private List<String> dapAn;
    private char dapAnDung;
    public CauHoi() {
        dapAn = new ArrayList<>();
    }

    public String getCauHoi() {
        return cauHoi;
    }

    public void setCauHoi(String cauHoi) {
        this.cauHoi = cauHoi;
    }

    public List<String> getDapAn() {
        return dapAn;
    }

    public void setDapAn(List<String> dapAn) {
        this.dapAn = dapAn;
    }

    public char getDapAnDung() {
        return dapAnDung;
    }

    public void setDapAnDung(char dapAnDung) {
        this.dapAnDung = dapAnDung;
    }

    public void nhapCauHoi(){
        sc.nextLine();
        System.out.print("Enter question: ");
        cauHoi=sc.nextLine();
        for (char option = 'A'; option <= 'D'; option++) {
            System.out.print("Answer " + option + ": ");
            String answer = sc.nextLine();
            dapAn.add(answer);
        }
        System.out.print("Corect answer(A, B, C, D): ");
        dapAnDung=sc.next().charAt(0);
        UUID uuid=UUID.randomUUID();
        String file= uuid.toString()+".txt";
        try {
            FileWriter ghiVaoFile=new FileWriter(folder+file);
            ghiVaoFile.write(cauHoi+"\n");
            for(String da: dapAn){
                ghiVaoFile.write(da+"\n");
            }
            ghiVaoFile.write(dapAnDung+"\n");
            System.out.println("Cau hoi da them thanh cong!!!");
            ghiVaoFile.close();

        } catch (IOException e) {
            System.out.println("Error!!!");
            throw new RuntimeException(e);
        }
    }
    public List<CauHoi> dsCauHoi(){
        List<CauHoi> dsCH=new ArrayList<>();
        File folder= new File("CauHoi");
        File[] fileCH=folder.listFiles();
        if(fileCH!=null){
            for (File file: fileCH){
                try(Scanner fileSC=new Scanner(file)){
                    CauHoi q =new CauHoi();
                    q.setCauHoi(fileSC.nextLine());
                    List<String> answers = new ArrayList<>();
                    for(int i=0;i<4;i++){
                        answers.add(fileSC.nextLine());
                    }
                    q.setDapAn(answers);
                    q.setDapAnDung(fileSC.nextLine().charAt(0));
                    dsCH.add(q);
                }catch (IOException e){
                    System.out.println("Error!!!");
                    throw new RuntimeException(e);
                }
            }
        }
        return dsCH;
    }

    public void luyenTap(){
        List <CauHoi> dsHienCo=dsCauHoi();
        if(dsHienCo.isEmpty()){
            System.out.println("No question!!!");
            return;
        }
        System.out.print("Enter the number of questions:");
        int numOfQuestion=sc.nextInt();
        sc.nextLine();
        if(numOfQuestion>dsHienCo.size()){
            System.out.print("The number of questions on the list is not enough!");
            return;
        }
        for(int i=0;i<numOfQuestion;i++){
            Random rn=new Random();
            int num=rn.nextInt(dsHienCo.size());
            CauHoi q = dsHienCo.get(num);
            System.out.print(q.getCauHoi());
            List <String> lc=q.getDapAn();
            System.out.println();
            System.out.println("A."+lc.get(0));
            System.out.println("B."+lc.get(1));
            System.out.println("C."+lc.get(2));
            System.out.println("D."+lc.get(3));
            System.out.print("Enter your answer(A,B,C,D): ");
            char a=sc.next().charAt(0);
            if(a==q.getDapAnDung()){
                System.out.println("Correct answer!");
            }
            else{
                System.out.println("Correct answer is "+q.getDapAnDung());
            }

        }
    }
}
