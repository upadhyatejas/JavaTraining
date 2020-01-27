package JavaArrayList;
import java.util.ArrayList;

public class ArrayListMain {
	public static void main(String [] args) {
		ArrayList <String> colors  = new ArrayList <String>(10);
		colors.add("red");
		colors.add("blue");
		colors.add("green");
		colors.remove("blue");
		System.out.println(colors);
		System.out.println(colors.contains("green"));
		System.out.println(colors.get(1));
		System.out.println(colors.size());
		colors.clear();
		
	}
}
