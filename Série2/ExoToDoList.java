import java.util.Scanner;

public class ExoToDoList{

	public static void main(String[] args){
		
		ToDoList list = new ToDoList(10);
		Scanner sc = new Scanner(System.in);
		
		list.add("Faire la vaisselle");
		list.add("Réviser");
		
		int choix = -1;
		
		while(choix != 4){
			
			list.printMenu();
			
			System.out.print("Entrez votre choix: ");
			choix = sc.nextInt();
			sc.nextLine();
			
			switch(choix){
				
				
				case 1:
				
					System.out.print("Entrez la description de la tache: ");
					String desc = sc.nextLine();
					
					list.add(desc);
				
				break;
				
				case 2:
					
					System.out.print("Entrez l'index de la tache à compléter: ");
					int index = sc.nextInt();
					sc.nextLine();
					
					list.get(index-1).markAsDone();
					
				break;
				
				case 3:
					list.printAll();
				break;
				
				case 4:
				System.out.println("Au revoir");
				break;
				
			}
			
		}
		
	}
	

}

class ToDoList{
	
	
	
	Task[] TaskList;
	int currentIndex = 0;
	
	public ToDoList(int length){
		
		this.TaskList = new Task[length];
		
	}
	
	void printAll(){
		
		for(Task t : TaskList) if(t != null) System.out.println(t);
		
	}
	
	void add(String desc){
		
		Task newTask = new Task(desc, this.currentIndex + 1);
		
		this.TaskList[currentIndex] = newTask;
		
		this.currentIndex++;
		
	}
	
	public Task get(int index){
		return this.TaskList[index];
	}
	
	void printMenu(){
		
		System.out.println("\nMenu \n1. Ajouter une tache \n2 .Marquer une tache comme terminée \n3. Afficher les tâches \n4. Terminer les taches");
		
		System.out.printf("%s %n  Nombres de taches: %d %n%s%n", "-".repeat(25), this.currentIndex, "-".repeat(25));
		
	}
	
}

class Task{
	
	String desc;
	boolean isDone = false;
	int index;
	
	public Task(String desc, int index){
		
		this.desc = desc;
		this.index = index;
		
	}
	
	void markAsDone() { this.isDone = true; }
	
	public String toString(){
		
		String status = this.isDone ? "terminée" : "pas terminée";
		
		return String.format("%d. %s (%s)",this.index, this.desc, status);
		
	}
	
}