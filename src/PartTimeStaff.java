public class PartTimeStaff extends Employee {
    private int hoursWorked;   // Số giờ làm việc
    private double hourlyRate; // Lương theo giờ

    public PartTimeStaff(String codeNV, String name, int age, String numberPhone, String email,
                         int hoursWorked, double hourlyRate) {
        super(codeNV, name, age, numberPhone, email);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    // Phương thức tính lương dựa trên số giờ làm và mức lương theo giờ
    @Override
    public double getSalary() {
        return hoursWorked * hourlyRate;
    }
}
