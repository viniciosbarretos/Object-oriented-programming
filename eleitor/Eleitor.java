public class Eleitor {
	private String name;
	private long rg;
	private long cpf;
	private int gender;
	private String birthday;
	private String adress;

	public Eleitor(String name, long rg, long cpf, int gender, String birthday, String adress) {
		this.name = name;
		this.rg = rg;
		this.cpf = cpf;
		this.gender = gender;
		this.birthday = birthday;
		this.adress = adress;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public String getAdress() {
		return adress;
	}

	public long getRg() {
		return rg;
	}

	public long getCpf() {
		return cpf;
	}

	public String getBirthday() {
		return birthday;
	}

	public int getGender() {
		return gender;
	}

	public void printData() {
		System.out.println("\nName: " + name);
		System.out.println("RG: " + rg);
		System.out.println("CPF: " + cpf);
		if(gender == 0)
			System.out.println("Gender: Male");
		else
			System.out.println("Gender: Female:");
		System.out.println("Birthday: " + birthday);
		System.out.println("Adress: " + adress);
	}

} //fim classe
