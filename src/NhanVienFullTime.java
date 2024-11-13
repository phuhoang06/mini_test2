public class NhanVienFullTime extends NhanVien {
    private double hardSalary;
    private double bonusSalary;
    private double finalSalary;

    public double getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(double hardSalary) {
        this.hardSalary = hardSalary;
    }

    public double getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(double bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public double getFinalSalary() {
        return finalSalary;
    }

    public void setFinalSalary(double finalSalary) {
        this.finalSalary = finalSalary;
    }

    public NhanVienFullTime() {
    }

    public NhanVienFullTime(double hardSalary, double bonusSalary, double finalSalary) {
        this.hardSalary = hardSalary;
        this.bonusSalary = bonusSalary;
        this.finalSalary = finalSalary;
    }

    public NhanVienFullTime(String codeNV, String name, int age, int numberPhone, String email, double hardSalary, double bonusSalary, double finalSalary) {
        super(codeNV, name, age, numberPhone, email);
        this.hardSalary = hardSalary;
        this.bonusSalary = bonusSalary;
        this.finalSalary = finalSalary;
    }

    @Override
    public double getSalary() {
        return hardSalary+(bonusSalary-finalSalary);
    }
}
