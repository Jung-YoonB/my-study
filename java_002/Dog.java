package java_002;

public class Dog {

	private String name;
	private int age;
	private char gender;
	private String breed;
	private double weight;
	private String sick;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getSick() {
		return sick;
	}
	public void setSick(String sick) {
		this.sick = sick;
	}
	
	public void info( ) {
		System.out.println("---------------- INFO CHART ----------------");
		System.out.printf("이름 : %s(%d살 / %c)\n", this.name, this.age, this.gender);
		System.out.printf("품종 : %s / 몸무게 : %.1f kg\n", this.breed, this.weight);
		System.out.printf("증상 : %s\n", this.sick);
		System.out.println("--------------------------------------------");
	}

}
