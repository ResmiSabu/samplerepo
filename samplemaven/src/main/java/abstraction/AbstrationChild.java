package abstraction;

public class AbstrationChild extends AbstrationParent {

	public static void main(String[] args) {
		AbstrationChild obj = new AbstrationChild();
		obj.display();
		obj.show();

	}

	
	@Override
	public void display() {
		System.out.println("Display method");
		
	}

}
