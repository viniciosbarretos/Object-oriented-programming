import java.util.Scanner;
public class Sga {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		String ra, name, course;
		double cr, year;

		System.out.print("Nome: ");
		name = scan.nextLine();
		System.out.print("RA: ");
		ra = scan.nextLine();
		System.out.print("Course: ");
		course = scan.nextLine();
		System.out.print("CR: ");
		cr = scan.nextDouble();
		System.out.print("Year: ");
		year = scan.nextDouble();
		Aluno student1 = new Aluno(ra, name, course, cr, year);

		scan = new Scanner(System.in);
		System.out.print("\nNome: ");
		name = scan.nextLine();
		System.out.print("RA: ");
		ra = scan.nextLine();
		System.out.print("Course: ");
		course = scan.nextLine();
		System.out.print("CR: ");
		cr = scan.nextDouble();
		System.out.print("Year: ");
		year = scan.nextDouble();
		Aluno student2 = new Aluno(ra, name, course, cr, year);

/*
		System.out.print("\nNome: ");
		name = scan.nextLine();
		System.out.print("RA: ");
		ra = scan.nextLine();
		System.out.print("Course: ");
		course = scan.nextLine();
		System.out.print("CR: ");
		cr = scan.nextDouble();
		System.out.print("Year: ");
		year = scan.nextDouble();
		Aluno student3 = new Aluno(ra, name, course, cr, year); */


		scan = new Scanner(System.in);
		System.out.print("\nPesquisar: ");
		String search = scan.nextLine();

		String aux = student1.getName();
		if(aux.equals(search)) {
			System.out.println("\nEncontrado!\n");
			System.out.println("RA: " + student1.getRa());
			System.out.println("Course: " + student1.getCourse());
			System.out.println("CR: " + student1.getCr());
			System.out.println("Year: " + student1.getYear());
		}

		aux = student2.getName();
		if(aux.equals(search)) {
			System.out.println("\nEncontrado!\n");
			System.out.println("RA: " + student2.getRa());
			System.out.println("Course: " + student2.getCourse());
			System.out.println("CR: " + student2.getCr());
			System.out.println("Year: " + student2.getYear());
		}
	}
}
