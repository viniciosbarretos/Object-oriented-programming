import javax.swing.JOptionPane;

public class calculadora {
	public static void main (String args[]) {

	int n1 = 0, n2 = 0, opt = 0;
	float result = 0;
	String aux;

	try {
		aux = JOptionPane.showInputDialog(null,"Numero 1:");
		n1 = Integer.parseInt(aux);

		aux = JOptionPane.showInputDialog(null,"Numero 2:");
		n2 = Integer.parseInt(aux);

		aux = JOptionPane.showInputDialog(null,"1 -> Somar\n2 -> Multiplicar\n3 -> Dividir");
		opt = Integer.parseInt(aux);
	}
	catch(NumberFormatException erro) {
		JOptionPane.showMessageDialog(null, "Erro, digite apenas inteiros", "Erro", JOptionPane.ERROR_MESSAGE);
	}

	switch(opt) {
		case 1: result = n1 + n2; break;
		case 2: result = n1 * n2; break;
		case 3: try {
							result =  n1 / n2;
						}
						catch(ArithmeticException erro) {
							JOptionPane.showMessageDialog(null, "Erro de divisão por 0!: ","Erro", JOptionPane.ERROR_MESSAGE);
						}
						break;
		default: result = 0;
	}

	JOptionPane.showMessageDialog(null, "Resultado: " + String.valueOf(result), "Resultado", JOptionPane.INFORMATION_MESSAGE);

	System.exit(0);
	}
}
