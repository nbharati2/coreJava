package constructors;

public class Cons {
int a=10,b=20,res;
	Cons(){
		
		System.out.println("Non_parameterized cons");
	}
	Cons(int a,int b){
		a=this.a;
		b=this.b;
		 System.out.println("para");
	}
	public int display(){
		System.out.println("menthod");
		return a+b;
	}
	public static void main(String[] args){
		Cons c=new Cons();
		System.out.println(+c.display());
		
		
	}
}
