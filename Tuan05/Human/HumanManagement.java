package Human;
import java.util.ArrayList;
import java.util.Scanner;

public class HumanManagement {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Human> humans = inputData(sc);
		outputData(humans);
		System.out.println("");
		outputData(humans);
	}
	
	public static ArrayList<Human> inputData(Scanner sc) {
		String name, position;
		double baseSalary, scale;
		int experience;
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Human> data = new ArrayList<Human> ();
		for(int i = 0; i < n; i++) {
			String line = sc.nextLine();
			String[] mang = line.split(" ");
			if(mang[0].equals("Employee:")) {
				name = mang[1];
				position = mang[2];
				baseSalary = Double.parseDouble(mang[3]);
				experience = Integer.parseInt(mang[4]);
				data.add(new Employee(name, position, baseSalary, experience));
			} else if(mang[0].equals("Employer:")) {
				name = mang[1];
				baseSalary = Double.parseDouble(mang[2]);
				scale = Double.parseDouble(mang[3]);
				data.add(new Employer(name, baseSalary, scale));
			} 
		}
		return data;
	}
	
	public static void outputData(ArrayList<Human> humans) {
		for(Human human : humans) {
			System.out.println(human);
		}
	}
}