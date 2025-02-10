import java.util.ArrayList;

public class Exo1{

	public static void main(String[] args){
		
		ArrayList<Person> liste = new ArrayList<>();
		
		liste.add(new Person("Haroune",17));
		liste.add(new Person("Jean", 23));
		
		for(Person p : liste){
			
			System.out.println(p);
			
		}
		
	}

}

class Person{

	private int age;
	private String name;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
	
		return String.format("Nom : %s, Age : %d",this.name, this.age);
	
	}

}