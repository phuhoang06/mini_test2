public class Main {
    public static void main(String[] args) {
        // Khởi tạo mảng đối tượng nhân viên
        Employee[] nhanvien = new Employee[5];

        // Khởi tạo các nhân viên full-time
        nhanvien[0] = new FullTimeStaff("C09", "Long", 27, "0123", "abc@gmail.com", 5000000, 3000000, 0);
        nhanvien[1] = new FullTimeStaff("C09", "Son", 27, "0123", "abc@gmail.com", 8000000, 2000000, 0);
        nhanvien[2] = new FullTimeStaff("C09", "Dung", 27, "0123", "abc@gmail.com", 10000000, 5000000, 200000);

        // Khởi tạo các nhân viên part-time
        nhanvien[3] = new PartTimeStaff("C09", "Phu", 18, "01234", "abc@gmail.com", 233, 100000);
        nhanvien[4] = new PartTimeStaff("C09", "Manh", 18, "01234", "abc@gmail.com", 33, 100000);

        // Hiển thị lương của từng nhân viên
        for (Employee nv : nhanvien) {
            System.out.println("Lương của nhân viên " + nv.getName() + " là " + (long) nv.getSalary());
        }

        // Tính trung bình lương của nhân viên trong công ty
        double sum = 0;
        for (Employee nv : nhanvien) {
            sum += nv.getSalary();
        }
        double averageSalary = sum / nhanvien.length;
        System.out.println("Lương trung bình của cả công ty là " + (long) averageSalary);

        // Tính tổng tiền lương phải trả cho nhân viên part-time
        double partTimeSalarySum = 0;
        for (Employee nv : nhanvien) {
            if (nv instanceof PartTimeStaff) {
                partTimeSalarySum += nv.getSalary();
            }
        }
        System.out.println("Tổng tiền lương phải trả cho nhân viên part-time là: " + (long) partTimeSalarySum);

        // Danh sách nhân viên full-time có mức lương thấp hơn mức lương trung bình của công ty
        for (Employee nv : nhanvien) {
            if (nv instanceof FullTimeStaff && nv.getSalary() < averageSalary) {
                System.out.println("Nhân viên " + nv.getName() + " có mức lương thấp hơn trung bình");
            }
        }
    }
}
