
public class Student extends Person {
	int id;
	String school;
	String eduLevel;
	
	Student(String n, int a, String g, int i, String s, String e){
		super(n, a, g);
		id = i;
		school = s;
		eduLevel = e;
	}

	public String printInfo(){
		return super.printInfo() + "ID: " + id + "\n" + "School: " + school + "\n" + 
	           "Educational Level: " + eduLevel + "\n"; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person unknown = new Person();
		Person owner = new Student("Ebun Segun", 18, "female", 100985893, "Carleton", "sophomore");
		System.out.println(unknown.printInfo());
		System.out.println(owner.printInfo());
	}

}
