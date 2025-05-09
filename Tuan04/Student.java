public class Student {
    private String name;
    private String id;
    private String birth;
    private String gender;
    private String address;

    public Student(String name, String id, String birth, String gender, String address) {
        this.name = name;
        this.id = id;
        this.birth = birth;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getBirth() {
        return birth;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Student[" + "ID=" + id + ", " + "Name=" + name + ", " + "Birth=" + birth + ", " + "Gender=" + gender
                + ", " + "Address=" + address + "]";
    }
}
