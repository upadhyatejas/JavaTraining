package generics;

public class Generics {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Test <Integer> iObj  = new Test(6);
		System.out.println("the object returns " + iObj.getObject());
		
		Test <String> sObj  = new Test("hello");
		System.out.println("the object returns " + sObj.getObject());
	}
	
}



class Test<T>{
	T obj;
	Test(T obj){
		this.obj = obj;
		
	}
	public T getObject() {
		return this.obj;
	}
	
}