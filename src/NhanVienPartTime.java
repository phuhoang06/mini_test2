public class NhanVienPartTime extends NhanVien {
    private double hour;
    private double salary;

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public NhanVienPartTime() {
    }

    public NhanVienPartTime(double hour, double salary) {
        this.hour = hour;
        this.salary = salary;
    }

    public NhanVienPartTime(String codeNV, String name, int age, int numberPhone, String email, double hour, double salary) {
        super(codeNV, name, age, numberPhone, email);
        this.hour = hour;
        this.salary = salary;
    }
    @Override
    public double getSalary(){
        return salary*hour;
    }
}
