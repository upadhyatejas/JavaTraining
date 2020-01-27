package generics;
public class GenericWithMulitpleTypes {
	public static void main(String[] args) {
		Genericss<Integer, Double> g1 = new Genericss<Integer,Double>(45, 15.23456);
		g1.print();
		
	}

}


class Genericss<T,U>{
	T obj1;
	U obj2;
	
	Genericss(){
		System.out.println("Please use parameterized constructor");
	}
	
	Genericss(T obj1, U obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
		
	}
	
	public void print() {
		System.out.println("First object will be "+ this.obj1);
		System.out.println("Second obj willl be "+ this.obj2);
	}
	
	
		
	
	
}