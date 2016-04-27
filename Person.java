
public class Person {
	String name;
	int age;
	String gender;
	
	Person(String n, int a, String g){
		name = n;
		age = a;
		gender = g;
	}
	
	Person(){
		this("Jane Doe", 25, "female");
	}
	
	public String printInfo(){
		return "Name: " + name + "\n" + 
	           "Age: " + age + "\n" + 
	           "Gender: " + gender;
	}

}
