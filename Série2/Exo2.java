import java.util.ArrayList;

public class Exo2{

	public static void main(String[] args){
		
		ArrayList<Person> liste = new ArrayList<>();
		
		liste.add(new Person("Haroune",17));
		liste.add(new Person("Jean", 23));
		
		for(Person p : liste){
			
			System.out.println(p);
			
			byte grade = (byte) Math.floor(Math.random() * 51 + 50);
			
			Examen exam = new Examen(p.name, grade);
			
			exam.afficheResultat();
			
		}
		
		
	}

}

class Person{

	int age;
	String name;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
	
		return String.format("Nom : %s, Age : %d",this.name, this.age);
	
	}

}

class Examen{
	
	private String name;
	private byte grade;
	
	
	public Examen(String name, byte grade){
		this.name = name;
		this.grade = grade;
	}
	
	public char convertirNote(){
		
		char rslt = 'E';
		
		if(grade > 90) rslt = 'A';
		else if(grade > 80) rslt = 'B';
		else if(grade > 70) rslt = 'C';
		else if(grade > 60) rslt = 'D';
		else rslt = 'E';
		
		return rslt;
	}
	
	public void afficheResultat(){
		
		System.out.println(String.format("%s : %c", name, convertirNote()));
		
	}
	
}