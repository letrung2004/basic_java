/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.time.LocalDate;

/**
 *
 * @author USER
 */
public class Tester {

    public static void main(String[] args) throws ClassNotFoundException {
        QLTiemChung quanLy = new QLTiemChung();
        NguoiDan p1 = new NguoiDan("01019101", "Nguyen Thi A", "10/10/2000");
        NguoiDan p2 = new NguoiDan("01012101", "Nguyen Thi A", "10/10/2000");
        NguoiDan p3 = new NguoiDanNuocNgoai("0101151101", "David Le", "10/10/2000", "09091", "Brazil");
        NguoiDan p4 = new NguoiDanNuocNgoai("0101827101", "Tomy Nguyen", "10/10/2000", "0981", "Cannada");
        Vaccine v1 = new Vaccine("CovidA", "American", 3000);
        Vaccine v2 = new Vaccine("CovidB", "China", 4000);
        Vaccine v3 = new Vaccine("CovidC", "Korea", 1000);
        //Cau 1
        quanLy.themVaccine(v1, v2, v3);
        quanLy.hienDsVaccine();
        //Cau 2
        quanLy.themNguoiDan(p1, p2, p3, p4);
        quanLy.locNguoiDan("Bai3.NguoiDanNuocNgoai").forEach(p->p.hienThongTin());
        //Cau 3
        p1.tiemChung(v3, "HCM","12/04/2024");
        p1.tiemChung(v1, "HCM","12/08/2023");
        p1.hienThongTin();
        // cau 4
        quanLy.duHaiMui().forEach(p->p.hienThongTin());
        //câu 5
        
       
       
        
      
    }
}
