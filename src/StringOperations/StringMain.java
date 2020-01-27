package StringOperations;

public class StringMain {
	String str;
	public String stringConcat(String input) {
		StringBuilder str = new StringBuilder();
		str.append(input);
		str.append("input is appended");
		this.str = str.toString();
		return this.str;
	}

}

