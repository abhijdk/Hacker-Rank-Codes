package hacker_rank_codes;

interface Animal{
	public void eat();
}
class Dog implements Animal{
	@Override
	public void eat() {
		System.out.println("Dog is eating everything like human");
	}
}
class Cow implements Animal{
	@Override
	public void eat() {
		System.out.println("Cow is eating Grass");
	}
}
public class Main{
	public static void main(String[] args) {
		new Dog().eat();
		new Cow().eat();
	}
}
