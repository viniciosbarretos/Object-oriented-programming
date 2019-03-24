import java.util.Scanner;

public class Sga {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		int i = 0;
		int age, gender;
		double height, weight;
		String name;

		System.out.print("Name: ");
		name = scan.nextLine();
		System.out.print("Age: ");
		age = scan.nextInt();
		System.out.print("Height: ");
		height = scan.nextDouble();
		System.out.print("Weight: ");
		weight = scan.nextDouble();
		System.out.print("Gender (0->Man / 1->Woman): ");
		gender = scan.nextInt();
		Atleta a1 = new Atleta(name, age, height, weight, gender);

		scan = new Scanner(System.in);

		System.out.print("\nName: ");
		name = scan.nextLine();
		System.out.print("Age: ");
		age = scan.nextInt();
		System.out.print("Height: ");
		height = scan.nextDouble();
		System.out.print("Weight: ");
		weight = scan.nextDouble();
		System.out.print("Gender (0->Man / 1->Woman): ");
		gender = scan.nextInt();
		Atleta a2 = new Atleta(name, age, height, weight, gender);

		height = (a1.getHeight() + a2.getHeight()) / 2;

		System.out.println("\nHeight Average: " + height);

	}
}
