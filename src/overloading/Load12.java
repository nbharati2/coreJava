package overloading;

public class Load12 {
 static  void display(int a){
	System.out.println("1st menthod int");
	System.out.println(a);
	
}
 static void display(char a){
	System.out.println("2nd menthod char");
	System.out.println(a);
}


	public static void main(String[] args) {
	
		//Load1 l=new Load1();
display(23);
display('b');

	}

}
