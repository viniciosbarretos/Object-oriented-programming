import javax.swing.JOptionPane;

public class ordenar {
	public static void main (String args[]) {

	int n1, n2, n3, n4;
	String aux;

	aux = JOptionPane.showInputDialog(null,"Numero 1:");
	n1 = Integer.parseInt(aux);

	aux = JOptionPane.showInputDialog(null,"Numero 2:");
	n2 = Integer.parseInt(aux);

	aux = JOptionPane.showInputDialog(null,"Numero 3:");
	n3 = Integer.parseInt(aux);

	if(n1 >= n2) {
		n4 = n1;
		n1 = n2;
		n2 = n4;
	}

	if(n2 >= n3) {
		n4 = n2;
		n2 = n3;
		n3 = n4;
	}

	if(n1 >= n2) {
		n4 = n1;
		n1 = n2;
		n2 = n4;
	}

	JOptionPane.showMessageDialog(null, String.valueOf(n1) + " " + String.valueOf(n2) + " " + String.valueOf(n3));

	System.exit(0);
