public class Aluno {
	private String ra;
	private String name;
	private String course;
	private double cr;
	private double year;

	public Aluno(String ra, String name, String course, double cr, double year) {
		this.ra = ra;
		this.name = name;
		this.course = course;
		this.cr = cr;
		this.year = year;
	}

	public void setCr(double cr) {
		this.cr = cr;
	}

	public double getCr() {
		return cr;
	}

	public double getYear() {
		return year;
	}

	public String getCourse() {
		return course;
	}

	public String getName() {
		return name;
	}

	public String getRa() {
		return ra;
	}
} //fim classe
