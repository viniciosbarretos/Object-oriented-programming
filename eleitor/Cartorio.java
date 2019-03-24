import java.util.Scanner;

public class Cartorio {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		int gender, i = 1, edit;
		long rg, cpf;
		String name, adress, birthday, search;

		System.out.print("Name: ");
		name = scan.nextLine();
		System.out.print("RG: ");
		rg = scan.nextLong();
		System.out.print("CPF: ");
		cpf = scan.nextLong();
		scan = new Scanner(System.in);
		System.out.print("Birthday: ");
		birthday = scan.nextLine();
		System.out.print("Adress: ");
		scan = new Scanner(System.in);
		adress = scan.nextLine();
		System.out.print("Gender (0->Male / 1->Female): ");
		gender = scan.nextInt();
		Eleitor e1 = new Eleitor(name, rg, cpf, gender, birthday, adress);

		scan = new Scanner(System.in);

		System.out.print("\nName: ");
		name = scan.nextLine();
		System.out.print("RG: ");
		rg = scan.nextLong();
		System.out.print("CPF: ");
		cpf = scan.nextLong();
		scan = new Scanner(System.in);
		System.out.print("Birthday: ");
		birthday = scan.nextLine();
		scan = new Scanner(System.in);
		System.out.print("Adress: ");
		adress = scan.nextLine();
		System.out.print("Gender (0->Male / 1->Female): ");
		gender = scan.nextInt();
		Eleitor e2 = new Eleitor(name, rg, cpf, gender, birthday, adress);

		scan = new Scanner(System.in);

		do {
			System.out.println("\nOptions:");
			System.out.println("0 -> Exit");
			System.out.println("1 -> Print Data");
			System.out.print("2 -> Edit Data ");
			i = scan.nextInt();
			if(i ==1) {
				scan = new Scanner(System.in);
				System.out.print("\nType a name to search: ");
				search = scan.nextLine();
				if(e1.getName().equals(search))
					e1.printData();
				if(e2.getName().equals(search))
					e2.printData();
			}
			if(i == 2) {
				scan = new Scanner(System.in);
				System.out.print("\nType a name to search: ");
				search = scan.nextLine();
				scan = new Scanner(System.in);
				if(e1.getName().equals(search)) {
					scan = new Scanner(System.in);
					System.out.print("\nNew Name: ");
					name = scan.nextLine();
					scan = new Scanner(System.in);
					System.out.print("New Adress: ");
					adress = scan.nextLine();
					e1.setName(name);
					e1.setAdress(adress);
				}
				if(e2.getName().equals(search)) {
					scan = new Scanner(System.in);
					System.out.print("\nNew Name: ");
					name = scan.nextLine();
					scan = new Scanner(System.in);
					System.out.print("New Adress: ");
					adress = scan.nextLine();
					e2.setName(name);
					e2.setAdress(adress);
				}
			}
		} while(i != 0);

	}
}
