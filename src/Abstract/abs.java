package Abstract;
abstract class abs1{
	void disp(){
		System.out.println("Abstract class concrete method");
	}
	abstract void disp1();
}
public class abs extends abs1{

	void disp1(){
		System.out.println("overriding abstract method");
	}
	public static void main(String[] args) {
		
abs a=new abs();
a.disp();
a.disp1();
	}

}
