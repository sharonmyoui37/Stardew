package Human;

public class Employee implements Human {
    String name;
    String position;
    double baseSalary;
    int experience;

    public Employee(String name, String position, double baseSalary, int experience) {
        this.name = name;
        this.position = position;
        this.baseSalary = baseSalary;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public int getExperience() {
        return experience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getSalary() {
        return baseSalary + experience * 500000;
    }

    public String toString() {
        return "Employee=[" +
                "Name=" + name + 
                ", Position=" + position +
                ", Salary=" + getSalary() +
                "]";
    }
}
