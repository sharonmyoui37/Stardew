import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = inputStudent(scanner);

        outputStudent(students);
        students = sortByName(students);
        System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo tên:");
        outputStudent(students);

        students = sortByGender(students);
        System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo giới tính:");
        outputStudent(students);

        System.out.print("\nNhập giới tính cần lọc (Male/Female): ");
        String inputGender = scanner.nextLine();
        students = filterByGender(students, inputGender);
        System.out.println("\nDanh sách sinh viên sau khi lọc theo giới tính " + inputGender + ":");
        outputStudent(students);

        System.out.print("\nNhập khóa cần lọc: ");
        String inputClass = scanner.nextLine();
        students = filterById(students, inputClass);
        System.out.println("\nDanh sách sinh viên sau khi lọc theo khóa " + inputClass + ":");
        outputStudent(students);
    }

    private static Student[] inputStudent(Scanner scanner) {
        System.out.print("Nhập số lượng sinh viên: ");
        int n = Integer.parseInt(scanner.nextLine());

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\nNhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print("\nTên: ");
            String name = scanner.nextLine();
            System.out.print("Mã sinh viên: ");
            String id = scanner.nextLine();
            System.out.print("Ngày sinh: ");
            String birth = scanner.nextLine();
            System.out.print("Giới tính (Male/Female): ");
            String gender = scanner.nextLine();
            System.out.print("Địa chỉ: ");
            String address = scanner.nextLine();

            students[i] = new Student(name, id, birth, gender, address);
        }

        return students;
    }

    private static void outputStudent(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static Student[] sortByName(Student[] students) {
        for (int i = students.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (students[j].getName().compareToIgnoreCase(students[j + 1].getName()) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        return students;
    }

    public static Student[] sortByGender(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getGender().compareToIgnoreCase(students[j].getGender()) > 0) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        return students;
    }

    public static Student[] filterByGender(Student[] students, String inputGender) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getGender().equalsIgnoreCase(inputGender)) {
                filteredStudents.add(student);
            }
        }

        return filteredStudents.toArray(new Student[0]);
    }

    public static Student[] filterById(Student[] students, String inputClass) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getId().startsWith(inputClass)) {
                filteredStudents.add(student);
            }
        }

        return filteredStudents.toArray(new Student[0]);
    }
}