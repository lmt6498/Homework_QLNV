package com.codegym;

public class NhanVienParttime extends NhanVien {
    private int soGioLam = 24;

    public NhanVienParttime() {

    }

    public NhanVienParttime(int soGioLam) {
        this.soGioLam = soGioLam;
    }

    public NhanVienParttime(int maNV, String tenNV, int tuoiNV, String phone, String email, int soGioLam) {
        super(maNV, tenNV, tuoiNV, phone, email);
        this.soGioLam = soGioLam;
    }

    public int getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(int soGioLam) {
        this.soGioLam = soGioLam;
    }

    public float tinhLuongParttime() {
        return soGioLam * 100000;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNhanVienParttime{" +
                "soGioLam=" + soGioLam +
                "Lương=" + tinhLuongParttime() +
                '}';
    }
}
