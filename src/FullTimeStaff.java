public class FullTimeStaff extends Employee {
    private double hardSalary;
    private double bonusSalary;
    private double penalty;

    public FullTimeStaff(String codeNV, String name, int age, String numberPhone, String email,
                         double hardSalary, double bonusSalary, double penalty) {
        super(codeNV, name, age, numberPhone, email);
        this.hardSalary = hardSalary;
        this.bonusSalary = bonusSalary;
        this.penalty = penalty;
    }

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

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    @Override
    public double getSalary() {
        return hardSalary + bonusSalary - penalty;
    }
}
