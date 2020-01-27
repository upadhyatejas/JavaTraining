import java.util.LinkedHashMap ;
import java.util.Map;
public class MapJava {
	public static void main(String [] args) {
		Map < String,Integer> object1 = new LinkedHashMap< String,Integer>(); 
		
		object1.put("a",1);
		object1.put("b",2);
		object1.put("c",3);
		object1.put("d",4);
		object1.put("e",4);
		
		System.out.println(object1);
		
		
	}

}
