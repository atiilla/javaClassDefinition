package JavaKlassenDef;

public class StudentApp {

	public static void main(String[] args) {

		Student anna = new Student();
		anna.setId(1);
		anna.setName("Anna");

		Student elsa = new Student("Elsa", "2");
		System.out.println(anna.getName());
		System.out.println(elsa.getName());
		

	}

}
