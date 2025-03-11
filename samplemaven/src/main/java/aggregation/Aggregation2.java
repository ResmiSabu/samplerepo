package aggregation;

public class Aggregation2 {
	String city,state;
	Aggregation1 ref; // reference variable
	
	public Aggregation2(String city, String state, Aggregation1 ref)
	{
	this.city = city;
	this.state = state;
	this.ref = ref;
	}
	
	public void display()
	{
		System.out.println(ref.name+" "+ ref.rollno);
		System.out.println(city +" " +state);
	}

	public static void main(String[] args) {
		Aggregation1 obj = new Aggregation1("Resmi", 11,30);
		Aggregation2 obj1 = new Aggregation2("Kollam","Kerala", obj);
		obj1.display();
 		

	}

}
