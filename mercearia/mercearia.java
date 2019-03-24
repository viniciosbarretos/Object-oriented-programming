import javax.swing.JOptionPane;
import java.util.Scanner;

public class mercearia {
	public static void main (String args[]) {



		int opt = 0, i;
		float price[] = new float[10];
		int quant[] = new int[10];
		String produto[] = new String[10];
		String aux;

		try {
			for(i=0; i<2; i++) {
				Scanner scan = new Scanner(System.in);
				System.out.println("\n<> PRODUTO " + (i+1));

				System.out.print("   Produto: ");
				produto[i] = scan.nextLine();

				System.out.print("   Preço: ");
				price[i] = scan.nextFloat();

				System.out.print("   Quantidade: ");
				quant[i] = scan.nextInt();
			}
			for(i=0; i<2; i++) {
				System.out.println("\n > " + produto[i]);
				System.out.println(" > R$" + price[i]);
				System.out.println(" > " + quant[i] + " Vendas");
			}
		}
		catch(Exception erro) {
			System.out.println("\n   Digite apenas numeros cusao\n");
		}




	System.exit(0);
	}
}
