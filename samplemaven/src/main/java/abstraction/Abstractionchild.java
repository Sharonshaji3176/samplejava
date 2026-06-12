package abstraction;

public class Abstractionchild extends Abstractionparent{

	public static void main(String[] args) {
		Abstractionchild obj = new Abstractionchild();// TODO Auto-generated method stub
        obj.display();
        obj.print();
	}
   public void display() {
	   System.out.println("World");
   }
}
