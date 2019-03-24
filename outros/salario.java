import javax.swing.JOptionPane;

public class salario {
	public static void main (String args[]) {

	int opt = 0;
	float salario = 0;
	double imposto = 0;
	String aux;

	try {
		aux = JOptionPane.showInputDialog(null,"Salario:");
		salario= Float.parseFloat(aux);

		aux = JOptionPane.showInputDialog(null,"1 -> Imposto (Roubo)\n2 -> Novo Salario");
		opt = Integer.parseInt(aux);
	}
	catch(NumberFormatException erro) {
		JOptionPane.showMessageDialog(null, "Erro, digite apenas numeros", "Erro", JOptionPane.ERROR_MESSAGE);
	}

	if (opt == 1) {
		if(salario < 500)
			imposto = salario * 0.05;
		if(salario >= 500 && salario <= 850)
			imposto = salario * 0.1;
		if(salario > 850)
			imposto = salario * 0.15;
		JOptionPane.showMessageDialog(null, "O Estado te Rouba: " + imposto, "Roubo", JOptionPane.INFORMATION_MESSAGE);
	}

	if (opt == 2) {
		if(salario > 1500)
			salario += 25;
		if(salario >= 750 && salario <= 1500)
			salario += 50;
		if(salario >= 450 && salario < 750)
			salario += 75;
		if(salario < 450)
			salario += 100;
		JOptionPane.showMessageDialog(null, "Novo Salario: " + salario, "Salario", JOptionPane.INFORMATION_MESSAGE);
	}

	if(opt != 1 && opt != 2)
		JOptionPane.showMessageDialog(null, "Opcao Invalida Fiao!", "Erro", JOptionPane.ERROR_MESSAGE);


	System.exit(0);
	}
}
