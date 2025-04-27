package Human;

public class Employer implements Human {
    String name;
    double baseSalary;
    double scale;

    public Employer(String name, double baseSalary, double scale) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.scale = scale;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalarySalary() {
        return baseSalary;
    }

    public double getScale() {
        return scale;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setScale(double scale) {
        this.scale = scale;
    }

    public double getSalary() {
        return baseSalary * (1 + scale);
    }

    public String toString() {
        return "Employer=[" +
                "Name=" + name + 
                ", Salary=" + getSalary() + 
                "]";
    }
}
