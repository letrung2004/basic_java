/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class NguoiDan {

    private String soCCCD;
    private String hoTen;
    private LocalDate ngaySinh;
    
    protected int soMui;
    protected List<ThongTinMuiTiem> dsMuiDaTiem=new ArrayList<>();

    public NguoiDan() {
    }

    public NguoiDan(String soCCCD, String hoTen, String ngaySinh) {
        this.soCCCD = soCCCD;
        this.hoTen = hoTen;
        this.ngaySinh = LocalDate.parse(ngaySinh, CauHinh.FORMATTER);
    }
    //Nhap thong tin nguoi dan

    public void nhapThongTin() {
        System.out.print("Ten: ");
        this.hoTen = CauHinh.sc.nextLine();
        System.out.print("CCCD: ");
        this.soCCCD = CauHinh.sc.nextLine();
        System.out.print("Ngay sinh: ");
        this.ngaySinh = LocalDate.parse(CauHinh.sc.nextLine(), CauHinh.FORMATTER);
    }

    public void hienThongTin() {
        System.out.printf("========\nSo CCCD: %s\nHo ten: %s\nNgay sinh: %s\n",
                this.soCCCD, this.hoTen, this.ngaySinh);
        System.out.println("Danh sach mui tiem: ");
        for (ThongTinMuiTiem muiTiem : dsMuiDaTiem) {
            System.out.printf("- Loai vaccine: %s\n Ngay tiem: %s\n Dia diem: %s\n",
                    muiTiem.getTenVac().getTenVaccine(), muiTiem.getNgayTiem().format(CauHinh.FORMATTER),muiTiem.getDiaDiem());
        }
    }
    
    public void tiemChung(Vaccine vac, String diaDiem, String ngayTiem){
        if(dsMuiDaTiem.size()<4){
            dsMuiDaTiem.add(new ThongTinMuiTiem(vac,LocalDate.parse(ngayTiem, CauHinh.FORMATTER),diaDiem));
            this.soMui++;
            System.out.printf("Da ghi nhan tiem chung cho %s\n",this.hoTen);
        }else{
            System.out.println("Da tiem du 3 mui ");
        }
    }
    
    
    
    

    public String getSoCCCD() {
        return soCCCD;
    }

    public void setSoCCCD(String soCCCD) {
        this.soCCCD = soCCCD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public List<ThongTinMuiTiem> getDsMuiDaTiem() {
        return dsMuiDaTiem;
    }

    public void setDsMuiDaTiem(List<ThongTinMuiTiem> dsMuiDaTiem) {
        this.dsMuiDaTiem = dsMuiDaTiem;
    }
    

}
