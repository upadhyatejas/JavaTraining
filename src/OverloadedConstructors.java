

public class OverloadedConstructors {
	public static void main(String[] args) {
		mushrooms mush1 = new mushrooms(55,(float)56.1);
	}
}


class mushrooms{
	public mushrooms() {
		System.out.println("This is the default constructor");
	}
	
	public mushrooms(int numberofMushrooms) {
		System.out.println("The number of mushrooms are given by \t"+numberofMushrooms);
	}
	public mushrooms(int numberofMushrooms, float sizeofMushrooms) {
		System.out.println("number of mushrooms and size"+ numberofMushrooms+sizeofMushrooms);
		System.getenv();
	}
}
