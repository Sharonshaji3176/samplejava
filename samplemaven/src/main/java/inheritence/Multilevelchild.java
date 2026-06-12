package inheritence;

public class Multilevelchild extends MultilevelparentB {

	public static void main(String[] args) {
		Multilevelchild obj =new Multilevelchild();
		obj.display();
		obj.display1();
		obj.display2();
		// TODO Auto-generated method stub

	}
	public void display2()
	{ 
		System.out.println("this is the child C");
		}
}
