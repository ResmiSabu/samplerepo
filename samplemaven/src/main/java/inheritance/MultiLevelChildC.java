package inheritance;

public class MultiLevelChildC extends MultiLevelParentB {

	public static void main(String[] args) {
		MultiLevelChildC obj = new MultiLevelChildC();
		obj.display();
		obj.display1();
		obj.display2();
 
	}
	
	public void display2()
	{
		System.out.println("child class C");
	}

}
