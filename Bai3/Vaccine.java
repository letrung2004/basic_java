/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author USER
 */
public class Vaccine {
    public static int dem;
    private int maVaccine;
    private String tenVaccine;
    private String xuatXu;
    private int soLuong;

    public Vaccine(String tenVaccine, String xuatXu, int soLuong) {
        this.maVaccine=++dem;
        this.tenVaccine = tenVaccine;
        this.xuatXu = xuatXu;
        this.soLuong = soLuong;
    }
    
    public void nhapTtVaccine(){
        System.out.print("Ten vaccine: ");
        this.tenVaccine=CauHinh.sc.nextLine();
        System.out.print("Xuat xu: ");
        this.xuatXu=CauHinh.sc.nextLine();
        System.out.print("So luong: ");
        this.soLuong=Integer.parseInt(CauHinh.sc.nextLine());
    }
    public void hienTtVaccine(){
        System.out.printf("========\nMa vaccine: %d\nTen: %s\nXuat xu: %s\nSo luong: %d\n",
                this.maVaccine,this.tenVaccine,this.xuatXu,this.soLuong);
    }
    
    

    public int getMaVaccine() {
        return maVaccine;
    }

    public void setMaVaccine(int maVaccine) {
        this.maVaccine = maVaccine;
    }

    public String getTenVaccine() {
        return tenVaccine;
    }

    public void setTenVaccine(String tenVaccine) {
        this.tenVaccine = tenVaccine;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
    
    
}
