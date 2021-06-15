package com.codegym;

import java.util.Scanner;

public class Manage {
    public static void showAll(NhanVien[] arr) {
        for (NhanVien n : arr) {
            System.out.println(n);
        }
    }

    public static NhanVien[] addFulltime(NhanVien[] arr) {
        Scanner input = new Scanner(System.in);

        System.out.println("Thêm nhân viên Fulltime");
        System.out.println("Nhập ID: ");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Nhập tên: ");
        String name = input.nextLine();
        System.out.println("Nhập email: ");
        String email = input.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(input.nextLine());
        System.out.println("Nhập số điện thoại");
        String phoneNumber = input.nextLine();
        System.out.println("Nhập lương cứng: ");
        double salary = Double.parseDouble(input.nextLine());
        System.out.println("Nhập tiền thưởng: ");
        double tienThuong = Double.parseDouble(input.nextLine());
        System.out.println("Nhập tiền phạt: ");
        double tienPhat = Double.parseDouble(input.nextLine());

        NhanVien nhanVien = new NhanVienFulltime(id, name, age, phoneNumber, email, tienThuong, tienPhat, salary);
        NhanVien[] arrNew = new NhanVien[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        arrNew[arrNew.length - 1] = nhanVien;
        return arrNew;
    }

    public static NhanVien[] addParttime(NhanVien[] arr) {
        Scanner input = new Scanner(System.in);

        System.out.println("Thêm nhân viên partime");
        System.out.println("Nhập ID: ");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Nhập tên: ");
        String name = input.nextLine();
        System.out.println("Nhập email: ");
        String email = input.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(input.nextLine());
        System.out.println("Nhập số điện thoại: ");
        String phone = input.nextLine();
        System.out.println("Nhập số giờ làm:");
        int soGio = Integer.parseInt(input.nextLine());

        NhanVien nhanVien = new NhanVienParttime(id, name, age, phone, email, soGio);
        NhanVien[] arrNew = new NhanVien[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        arrNew[arrNew.length - 1] = nhanVien;
        return arrNew;
    }
    public static void getLuongTB(NhanVien[] arr){
        int average = 0;
        int count =0;
        for(NhanVien s : arr){
            if (s instanceof NhanVienFulltime){
                average += ((NhanVienFulltime) s).getLuongCung();
                count ++;
            }
        }
        average /= count;
        System.out.println("Mức lương trung bình là:" + average);
        for(NhanVien s : arr){
            if (s instanceof NhanVienFulltime){
                if(((NhanVienFulltime) s).getLuongCung() < average){
                    System.out.println(s);
                }
            }
        }
    }

}
