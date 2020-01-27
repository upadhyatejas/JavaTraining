package ArraySamples;
import java.util.ArrayList;
import java.util.Arrays;
public class CopyList {
	public static void main(String[] args) {
		
	
	ArrayList<String>obj = new ArrayList<String>(Arrays.asList("Hello","World","Threads","are","great"));
	ArrayList<String>obj1 = new ArrayList<String>();
	System.out.println("\nInitial List: " + obj);
	int sizeOfObj = obj.size();
	for(int i = 0; i < sizeOfObj; i++) {
		obj1.add(obj.get(i));
	}
	System.out.println("\nThe second list will be"+obj1);
	
	}
}
