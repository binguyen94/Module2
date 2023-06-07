package learnJava.java61;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<Sinhvien> danhSach;

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<>();
    }

    public DanhSachSinhVien(ArrayList<Sinhvien> danhsach) {
        this.danhSach = danhsach;
    }

    public void themSinhVien(Sinhvien sv){
        this.danhSach.add(sv);
    }

    public void inDanhSachSinhVien(){
        for (Sinhvien sinhVien: danhSach) {
            System.out.println(sinhVien);
        }
    }

    public boolean kiemTraDanhSachRong(){
        return this.danhSach.isEmpty();
    }

    public int laySoLuongSinhVien(){
        return this.danhSach.size();
    }

    public void lamRongDanhSach(){
        this.danhSach.removeAll(danhSach);
    }

    public boolean kiemTraTonTai(Sinhvien sv){
        return this.danhSach.contains(sv);
    }

    public  boolean xoaSinhVien(Sinhvien sv) {
        return this.danhSach.remove(sv);
    }

    public void timSinhVien(String ten) {
        for(Sinhvien sinhVien : danhSach){
            if(sinhVien.getHoVaTen().indexOf(ten) >= 0){
                System.out.println(sinhVien);
            }
        }
    }

    public void sapXepSinhVienGiamDanTheoDiem() {
        Collections.sort(this.danhSach, new Comparator<Sinhvien>() {
            @Override
            public int compare(Sinhvien sv1, Sinhvien sv2) {
                if(sv1.getDiemTrungBinh()< sv2.getDiemTrungBinh()){
                    return 1;
                } else if (sv1.getDiemTrungBinh()>sv2.getDiemTrungBinh()) {
                    return -1;
                } else{
                    return 0;
                }
            }
        });
    }

}
