

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class HocVien {
    private String nameStudent;
    private String addressStudent;
    private Date dayOfBirth;
    private static int count = 0;
    private int codeStudent;
    {

        this.codeStudent = ++count;
    }
    private double diemMon1;
    private double diemMon2;
    private double diemMon3;

    public HocVien(String name, String address, Date birth) {
        this.addressStudent = address;
        this.dayOfBirth = birth;
        this.nameStudent = name;
        this.diemMon1 = 0;
        this.diemMon2 = 0;
        this.diemMon3 = 0;
    }

    public void setName(String name) {
        this.nameStudent = name;
    }

    public String getName() {
        return this.nameStudent;
    }

    public void setAddress(String address) {
        this.addressStudent = address;
    }

    public String getAddress() {
        return this.addressStudent;
    }

    public void setDayOfBirth(Date birth) {
        this.dayOfBirth = birth;
    }

    public Date getDayOfBirth() {
        return this.dayOfBirth;
    }

    public void setCode(int code) {
        this.codeStudent = code;
    }

    public int getCode() {
        return this.codeStudent;
    }

    public void setDiem1(double diem1) {
        this.diemMon1 = diem1;
    }

    public void setDiem2(double diem2) {
        this.diemMon2 = diem2;
    }

    public void setDiem3(double diem3) {
        this.diemMon3 = diem3;
    }

    public double getDiem1() {
        return this.diemMon1;
    }

    public double getDiem2() {
        return this.diemMon2;
    }

    public double getDiem3() {
        return this.diemMon3;
    }

    public static void inputStudent(HocVien hv, ArrayList<HocVien> listStudent) {
        listStudent.add(hv);
    }

    public static void outputStudent(ArrayList<HocVien> listStudent) {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        for (HocVien a : listStudent) {
            System.out.println(" Student ID: " + a.getCode());
            System.out.println(" Student name: " + a.getName());
            System.out.println(" Student address: " + a.getAddress());
            System.out.println(" Student birth: " + f.format(a.getDayOfBirth()));
            System.out.println(" Student mark 1: " + a.getDiem1());
            System.out.println(" Student mark 2: " + a.getDiem2());
            System.out.println(" Student mark 3: " + a.getDiem3());
        }
    }

    public static void inputMark(ArrayList<HocVien> listStudent){
        Scanner s=new Scanner(System.in);
       for(HocVien a:listStudent){
        System.out.printf("Enter grade 1 of student have ID %d: ",a.codeStudent);
        double d1=s.nextDouble();
        a.setDiem1(d1);
        System.out.printf("Enter grade 2 of student have ID %d: ",a.codeStudent);
        double d2=s.nextDouble();
        a.setDiem2(d2);
        System.out.printf("Enter grade 3 of student have ID %d: ",a.codeStudent);
        double d3=s.nextDouble();
        a.setDiem3(d3);
       }
    }

    public static void main(String[] args) {
        int choice;
        ArrayList<HocVien> listStudent = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Input infomation of student ");
            System.out.println("2. Out infomation of list student ");
            System.out.println("3. Enter grade of list student. ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Date dayOfBirth = new Date();
                    sc.nextLine();
                    System.out.print("Enter name of student: ");
                    String nameStudent = sc.nextLine();
                    System.out.print("Enter address of student: ");
                    String addressStudent = sc.nextLine();
                    System.out.print("Enter day of birth of student: ");
                    String day = sc.nextLine();
                    SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
                    try {

                        dayOfBirth = f.parse(day);
                    } catch (Exception e) {
                        System.out.println("Date of birth is not in correct format!!!");
                    }
                    HocVien hv = new HocVien(nameStudent, addressStudent, dayOfBirth);
                    inputStudent(hv, listStudent);
                   
                    break;
                case 2:
                    outputStudent(listStudent);
                    break;
                case 3:
                    inputMark(listStudent);
                    break;
                default:
                    break;
            }
         
        } while (true);
      

    }

}
