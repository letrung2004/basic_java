import java.util.Scanner;
import java.util.ArrayList;

public class DSPhanSo {
    private ArrayList<PhanSo> ps;

    public DSPhanSo() {
        ps = new ArrayList<>();
    }

    public void setDSPhanSo(ArrayList<PhanSo> ps) {
        this.ps = ps;
    }

    public ArrayList<PhanSo> getDSPhanSo() {
        return this.ps;
    }

    public ArrayList<PhanSo> nhapDS() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap vao tu ps[%d]=", i);
            int x = sc.nextInt();
            System.out.printf("Nhap vao mau ps[%d]=", i);
            int y = sc.nextInt();
            ps.add(new PhanSo(x, y));

        }
        sc.close();
        return ps;
    }

    public void hienThiDS() {
        for (int i = 0; i < ps.size(); i++) {
            ps.get(i).hienThi();
        }
    }

    public void xoaPS(int x, int y) {
        for (int i = 0; i < ps.size(); i++) {
            if (ps.get(i).getTuSo() == x && ps.get(i).getMauSo() == y) {
                ps.remove(i);
                break;
            }
        }
    }
    public void xoaPS(PhanSo a) {
        for (int i = 0; i < ps.size(); i++) {
            if (ps.get(i).getTuSo() == a.getTuSo() && ps.get(i).getMauSo() == a.getMauSo()) {
                ps.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        DSPhanSo ps = new DSPhanSo();
        ps.nhapDS();
        ps.hienThiDS();
        PhanSo a = new PhanSo(3, 4);
        ps.xoaPS(a);
        ps.xoaPS(a);
        ps.xoaPS(1, 5);
        System.out.println("Danh sach sau khi xoa: ");
        ps.hienThiDS();

    }
}