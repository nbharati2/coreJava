package Interface;
 interface Animals{
	public void disp();
	
	
}
 interface Wild extends Animals{
	 public void disp3();
 }
public class Inter implements Wild {
	public void disp(){
		System.out.println("Animals");
	}
	public void disp3(){
		System.out.println("Wild");
	};
	public static void main(String[] args) {
		
Inter in=new Inter();
in.disp();
in.disp3();
	}

}
