import java.util.*;
import java.math.*;


public class Game{


	public static final Map<String, ArrayList<String>> symptoms; 
		static{
			HashMap<String, ArrayList<String>> symptoms1 = new HashMap<String, ArrayList<String>>();
			ArrayList<String> cold = new ArrayList<String>();
			cold.add("coughing");
			cold.add("sneezing");
			symptoms1.put("cold", cold);
			ArrayList<String> fever = new ArrayList<String>();
			fever.add("feeling hot, especially on my forehead");
			symptoms1.put("fever", fever);
			symptoms = Collections.unmodifiableMap(symptoms1);


		}
	public static final List<String> names;
	static{
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("John");
		names1.add("Julie");
		names1.add("Jackson");
		names = Collections.unmodifiableList(names1);

	}
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		String answer = null;
		List<String> keys = new ArrayList<String>(symptoms.keySet());
		Random rand = new Random();;
		while (answer != "end"){
			String name = names.get(rand.nextInt(names.size()));
			String illness = keys.get(rand.nextInt(keys.size()));
			Patient person = new Patient(name, illness);
			while (answer != person.illness){
				System.out.println("To ask " + person.name + " about their symptoms, type A");
				System.out.println("To ask " + person.name + " about their medical history, type B");
				person.question(input.nextLine());
				answer = input.nextLine();
			}
			System.out.println("Nice! On to the next patient!");
			
		}




	}



	private static class Patient{

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
				System.out.print("I am ");
				for (String a : symptomsList){
					System.out.print(a + ", ");
				}
				System.out.print("and I feel horrible! ");
				System.out.println("What does " + name + " have?");
			}else{
				System.out.println("Arman is lazy so he only implemented option A");
			}
		}

	}

	


}
