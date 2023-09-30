package hacker_rank_codes;

class Student{
	private int age;
	private String name;
	public Student(int age, String name) {
		this.age=age;
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=18)
			this.age=age;
		else {
			System.out.println("Age can't be -ve");
			
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public  String displayInformation() {
		return name+" Age is "+age+" years old";
	}
	
}
public class TestEncapsulation{
	public static void main(String[] args) {
		Student s=new Student(25, "Omm");
		System.out.println(s.displayInformation());
		s.setAge(-25);
		s.setName("Null");
		System.out.println(s.displayInformation());
	}
}
