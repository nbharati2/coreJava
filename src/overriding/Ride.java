package overriding;

class Ride1{
	public void disp(){
		System.out.println("parent method1");
	}
	public void disp1(){
		System.out.println("parent method2");
	}
}
public class Ride extends Ride1 {
	public void disp(){
		super.disp();
		System.out.println("base method1");
	}
	public void disp3(){
		System.out.println("base method2");
	}


	public static void main(String[] args) {
		Ride1 r=new Ride();
		Ride r1=new Ride();
		r.disp();
		r.disp1();
		r1.disp3();

	}

}
