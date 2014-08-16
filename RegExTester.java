import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegExTester {
	
	public static void main(String[] args) {
    		
		String stringToSearch = args[0];
		String regex = args[1];
		
		System.out.println("\nSearching string - "+stringToSearch);
		System.out.println("\nRegEx - "+regex+"\n");		

		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(stringToSearch);

		if (match.find())
			System.out.println("Matches - "+match.group(0)+"\n");
		else
			System.out.println("No matches\n");	

	
	}
}
