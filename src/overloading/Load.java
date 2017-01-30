package overloading;

class Load1 {
 void display(int a){
	System.out.println("1st menthod int");
	System.out.println(a);
	
}
 void display(char a){
	System.out.println("2nd menthod char");
	System.out.println(a);
}
}
public class Load{
	public static void main(String[] args) {
	
		Load12 l=new Load12();
l.display(23);
l.display('b');

	}

}
