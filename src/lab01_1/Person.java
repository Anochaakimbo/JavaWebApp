package lab01_1;

public class Person {
	public String name;
	public String gender;
	public int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		gender = "ไม่ระบุ";

	}

	public Person(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public int calulateBirthYear() {
		return 2567 - age;
	}

	public String display() {
		return "ชื่อ:" + name + ", อายุ:" + age + ", เพศ : " + gender + ", ปีเกิด " + calulateBirthYear();
	}

}
