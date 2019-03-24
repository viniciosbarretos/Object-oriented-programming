import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class mercearia {
	public static void main (String args[]) {

		int opt = 0, i=0;

		String aux;

		List<String> produto = new ArrayList<>();
		List<Integer> quant = new ArrayList<>();
		List<Float> preco = new ArrayList<>();

		try {
			while(opt != 2) {
				i++;
				Scanner scan = new Scanner(System.in);
				System.out.println("\n<> PRODUTO " + i);

				System.out.print("   Nome: ");
				produto.add(scan.nextLine());

				System.out.print("   Preço: ");
				preco.add(scan.nextFloat());

				System.out.print("   Quantidade: ");
				quant.add(scan.nextInt());

				System.out.print("\n   1: Adicionar mais\n   2: Sair ");
				opt = scan.nextInt();
			}
		}
		catch(Exception erro) {
			System.out.println("\n   Digite apenas numeros cusao\n");
		}

		for(i=0; i<produto.size(); i++) {
			System.out.println("\n > " + produto.get(i));
			System.out.println(" > R$" + preco.get(i));
			System.out.println(" > " + quant.get(i) + " Vendas");
		}


	System.exit(0);
	}
}
