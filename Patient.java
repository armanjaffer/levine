import java.util.*;


public class Patient{

	public String name;
	public String illness;
	private ArrayList<String> symptomsList;

	public Patient(String nm, String sickness){
		this.name = nm;
		this.illness = sickness;
		symptomsList = Game.symptoms.get(sickness);
		
	}

	public void question(String questionType){
		if (questionType.equals("A")){
			System.out.println("I am ");
			for (String a : symptomsList){
				System.out.print(a + ", ");
			}
			System.out.print("and I feel horrible!");
			System.out.println("What does " + name + " have?");
		}else{
			System.out.println("Arman is lazy so he only implemented option A");
		}
	}
}
