package LinkedList;
import java.util.LinkedList;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedList<String> stringObject = new LinkedList<String>();
		stringObject.add("red");
		stringObject.add("blue");
		stringObject.add("green");
		stringObject.add("yellow");
		stringObject.remove("Orange");
		stringObject.remove("orange");
		System.out.println(stringObject);
	}

}
