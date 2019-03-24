public class market {
	public static void main(String args[]) {
		//cria os itens
		Item milk = new Item("011", "Galao de leite", 2, 2.50);
		Item yogurt = new Item("032", "Iogurte de pessego", 4, 0.68);
		Item bread = new Item("023", "Pao de forma", 1, 2.55);
		Item soap = new Item("021", "Pacote de sabao", 1, 4.51);

		//aplica cupons
		milk.setDiscount(0.15);

		//obtém preços ajustados
		double milk_price = milk.getAdjustedPrice();
		double yogurt_price = yogurt.getAdjustedPrice();
		double bread_price = bread.getAdjustedPrice();
		double soap_price = soap.getAdjustedPrice();

		//Imprime recibo
		System.out.println("\nObrigado pela compra!\n");
		System.out.println(milk.getDescription() + "\tR$" + milk_price);
		System.out.println(yogurt.getDescription() + "\tR$" + yogurt_price);
		System.out.println(bread.getDescription() + "\tR$" + bread_price);
		System.out.println(soap.getDescription() + "\tR$" + soap_price);
		double total = milk_price+yogurt_price+bread_price+soap_price;
		System.out.println("\nValor total \t R$" + total);
	}
}
