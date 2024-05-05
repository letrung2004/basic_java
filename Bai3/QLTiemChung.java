/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author USER
 */
public class QLTiemChung {
    List<Vaccine> dsVaccine=new ArrayList<>();
    List<NguoiDan> dsNguoiDan=new ArrayList<>();
    
    //Thong tin tiem chung
    private String vaccine;
    private String diaDiem;
    private LocalDate ngayTiem;

    public QLTiemChung() {
    }
    
    public void themVaccine(Vaccine...vac){
        this.dsVaccine.addAll(Arrays.asList(vac));
    }
    public void themNguoiDan(NguoiDan...p){
        this.dsNguoiDan.addAll(Arrays.asList(p));
    }
    
    public void hienDsVaccine(){
        this.dsVaccine.forEach(vac->vac.hienTtVaccine());
    }
    public void hienDsNguoi(){
        this.dsNguoiDan.forEach(p->p.hienThongTin());
    }
    //lay nguoi dan nuoc ngoai
    public List<NguoiDan> locNguoiDan(String path) throws ClassNotFoundException{
        Class c=Class.forName(path);
        return this.dsNguoiDan.stream().filter(p->c.isInstance(p)).collect(Collectors.toList());
    }

    //Danh sach tiem đủ 2 mũi
    public List<NguoiDan> duHaiMui(){
        return this.dsNguoiDan.stream().filter(p->p.soMui>=2).toList();
    }
    
    //Kiem tra đủ điều kiện tiêm chủng chưa
   public boolean isCheck(NguoiDan p){
       
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public String getVaccine() {
        return vaccine;
    }
    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }

    public LocalDate getNgayTiem() {
        return ngayTiem;
    }

    public void setNgayTiem(LocalDate ngayTiem) {
        this.ngayTiem = ngayTiem;
    }
    
    
    
    
    
    
    
}
