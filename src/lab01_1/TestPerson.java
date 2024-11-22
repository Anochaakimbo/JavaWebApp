package lab01_1;

public class TestPerson {

	public static void main(String[] args) {
		Person obj1 = new Person("SomSak", "ชาย", 45);
		System.out.println(obj1.display());

		Person obj2 = new Person("JomQuan", 30);
		System.out.println(obj2.display());

	}

}
