package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NhanVien[] nhanVien = new NhanVien[2];

        nhanVien[0] = new NhanVienFulltime(01, "Tuấn", 18, "0347183456", "luongminhtuan6498@gmail.com", 10000, 5000, 200000);
        nhanVien[1] = new NhanVienParttime(02, "Tuấn", 18, "0347183456", "luongminhtuan6498@gmail.com", 25);


        Scanner input = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("Quản lý nhân viên");
            System.out.println("1.Thêm Nhân viên: ");
            System.out.println("2.Hiển thị toàn bộ nhân viên: ");
            System.out.println("3.Danh sách nhân viên toàn thời gian có mức lương < mức lương trung bình!");
            System.out.println("0.Exit");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("1.Thêm nhân viên Fulltime:");
                    System.out.println("2.Thêm nhân viên Parttime");
                    int select = input.nextInt();
                    switch (select) {
                        case 1:
                            nhanVien = Manage.addFulltime(nhanVien);

                        case 2:
                            nhanVien = Manage.addParttime(nhanVien);

                    }
                    break;
                case 2:
                    Manage.showAll(nhanVien);
                    break;
                case 3:
                    Manage.getLuongTB(nhanVien);
                    break;
                case 0: System.exit(0);
            }
        }
    }
}
