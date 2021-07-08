package _04_animals_inheritance;

public class Animal {
	
	String name;
	String furColor;
	Boolean isGirl;
	Animal(String name, String furColor, Boolean isGirl) {
		this.name=name;
		this.furColor=furColor;
		this.isGirl=isGirl;
	}
	void printName() {
		System.out.println("My name is " + name + ".");
	}
	void play() {
		System.out.println("I like to play.");
	}
	void sleep () {
		System.out.println("I sleep.");
	}
	void eat() {
		System.out.println("I eat.");
	}
}
