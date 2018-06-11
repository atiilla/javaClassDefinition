package student;

public class Student {
	
	private String name;
	private int id;
	
	
	
	public Student() {
		
		
	}
	
	public Student(String name, String id) { // ? is ID int of String?
		this.name = name;
		this.id = Integer.parseInt(id); // zonder parseInt id gaat niet werken
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	
	
	

}

	
