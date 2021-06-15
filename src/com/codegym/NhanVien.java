package com.codegym;

public class NhanVien {
    private int maNV;
    private String tenNV;
    private int tuoiNV;
    private String phone;
    private String email;

    public NhanVien() {

    }

    public NhanVien(int maNV, String tenNV, int tuoiNV, String phone, String email) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.tuoiNV = tuoiNV;
        this.phone = phone;
        this.email = email;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getTuoiNV() {
        return tuoiNV;
    }

    public void setTuoiNV(int tuoiNV) {
        this.tuoiNV = tuoiNV;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNV=" + maNV +
                ", tenNV='" + tenNV + '\'' +
                ", tuoiNV=" + tuoiNV +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
