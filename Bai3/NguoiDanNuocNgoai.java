/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author USER
 */
public class NguoiDanNuocNgoai extends NguoiDan{
    private String soHoChieu;
    private String quocTich;

    public NguoiDanNuocNgoai() {}

    public NguoiDanNuocNgoai(String soCCCD, String hoTen, String ngaySinh, String soHoChieu, String quocTich) {
        super(soCCCD, hoTen, ngaySinh);
        this.soHoChieu=soHoChieu;
        this.quocTich=quocTich;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.print("So ho chieu: ");
        this.soHoChieu = CauHinh.sc.nextLine();
        System.out.print("Quoc tich: ");
        this.quocTich = CauHinh.sc.nextLine();
    }


    @Override
    public void hienThongTin() {
        super.hienThongTin(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.printf("So ho chieu: %s\nQuoc tich: %s\n",
                this.soHoChieu,this.quocTich);
    }
    
    
    
    
    

    public String getSoHoChieu() {
        return soHoChieu;
    }

    public void setSoHoChieu(String soHoChieu) {
        this.soHoChieu = soHoChieu;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }
    
    
    
}
