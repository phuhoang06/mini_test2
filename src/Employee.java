public abstract class Employee {
    private String codeNV;
    private String name;
    private int age;
    private String numberPhone;
    private String email;

    public Employee(String codeNV, String name, int age, String numberPhone, String email) {
        this.codeNV = codeNV;
        this.name = name;
        this.age = age;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public String getCodeNV() {
        return codeNV;
    }

    public void setCodeNV(String codeNV) {
        this.codeNV = codeNV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Phương thức trừu tượng để tính lương
    public abstract double getSalary();
}
