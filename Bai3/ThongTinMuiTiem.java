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
public class ThongTinMuiTiem {
    private Vaccine tenVac;
    protected LocalDate ngayTiem;
    private String diaDiem;

    public ThongTinMuiTiem(Vaccine tenVac, LocalDate ngayTiem, String diaDiem) {
        this.tenVac = tenVac;
        this.ngayTiem = ngayTiem;
        this.diaDiem = diaDiem;
    }

    public Vaccine getTenVac() {
        return tenVac;
    }

    public void setTenVac(Vaccine tenVac) {
        this.tenVac = tenVac;
    }

    public LocalDate getNgayTiem() {
        return ngayTiem;
    }

    public void setNgayTiem(LocalDate ngayTiem) {
        this.ngayTiem = ngayTiem;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }

    
    
    
}
