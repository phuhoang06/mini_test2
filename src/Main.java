import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// khoi tao doi tuong
        NhanVien[] nhanvien = new NhanVien[5];
//        nhan vien full time
        nhanvien[0] = new NhanVienFullTime("C09","long",27,0123,"abc@gmail.com",5000000,3000000,0);
        nhanvien[1] = new NhanVienFullTime("C09","son",27,0123,"abc@gmail.com",8000000,2000000,0);
        nhanvien[2] = new NhanVienFullTime("C09","dung",27,0123,"abc@gmail.com",10000000,5000000,200000);
//        nhan vien parttime
        nhanvien[3] = new NhanVienPartTime("C09","Phu",18,01234,"abc@gmail.com",233,100000);
        nhanvien[4] = new NhanVienPartTime("C09","manh",18,01234,"abc@gmail.com",33,100000);

//        kiem tra xem tien luong
long sum = 0;
long sum1 = 0;
        for (int i = 0; i < nhanvien.length; i++){
            if (nhanvien[i] instanceof NhanVienFullTime){
                System.out.println("Luong cua nhan vien "+ nhanvien[i].getName() + " la " + (long)nhanvien[i].getSalary());
                sum += nhanvien[i].getSalary();
            }
            else {
                System.out.println("Luong cua nhan vien "+ nhanvien[i].getName() + " la " + (long)nhanvien[i].getSalary());
                //so tien luong phai tra cho nhan vien part time
                sum1 += nhanvien[i].getSalary();
            }
        }

//        tính trung bình lương của nhân viên cả công ty
        sum = (sum1 + sum)/nhanvien.length;
        System.out.println("Luong trung binh cua ca cong ty la "+sum);
        System.out.println("Tong luong phai tra cho nhan vien part time la  "+sum1);

//danh sách nhân viên toàn thời gian có mức lương thấp hơn mức lương trung bình của các nhân viên trong công ty
for (int i = 0; i < nhanvien.length; i++){
    if (nhanvien[i] instanceof NhanVienFullTime){
        if (nhanvien[i].getSalary() < sum){
            System.out.println("nhan vien " + nhanvien[i].getName() + " co muc luong thap hon trung binh");
        }
    }
}

    }
}