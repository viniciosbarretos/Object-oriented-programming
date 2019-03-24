public class Atleta {
	private String name;
	private int age;
	private double height;
	private double weight;
	private int gender;

	public Atleta(String name, int age, double height, double weight, int gender) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public int getGender() {
		return gender;
	}

} //fim classe
