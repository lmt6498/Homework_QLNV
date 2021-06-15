package com.codegym;

public class NhanVienFulltime extends NhanVien {
    private double soTienThuong = 1000;
    private double soTienPhat = 1000;
    private double luongCung = 200000;

    public NhanVienFulltime() {

    }

    public NhanVienFulltime(double soTienThuong, double soTienPhat, double luongCung) {
        this.soTienThuong = soTienThuong;
        this.soTienPhat = soTienPhat;
        this.luongCung = luongCung;
    }

    public NhanVienFulltime(int maNV, String tenNV, int tuoiNV, String phone, String email, double soTienThuong, double soTienPhat, double luongCung) {
        super(maNV, tenNV, tuoiNV, phone, email);
        this.soTienThuong = soTienThuong;
        this.soTienPhat = soTienPhat;
        this.luongCung = luongCung;
    }

    public double getSoTienThuong() {
        return soTienThuong;
    }

    public void setSoTienThuong(double soTienThuong) {
        this.soTienThuong = soTienThuong;
    }

    public double getSoTienPhat() {
        return soTienPhat;
    }

    public void setSoTienPhat(double soTienPhat) {
        this.soTienPhat = soTienPhat;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double tinhLuongFulltime() {
        return luongCung + (soTienThuong - soTienPhat);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNhanVienFulltime{" +
                "soTienThuong=" + soTienThuong +
                ", soTienPhat=" + soTienPhat +
                ", luongCung=" + luongCung +
                ", Lương=" + tinhLuongFulltime() +
                '}';
    }
}
