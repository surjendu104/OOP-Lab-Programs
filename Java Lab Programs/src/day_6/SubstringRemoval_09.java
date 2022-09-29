package day_6;

public class SubstringRemoval_09 {
	public static void main(String[] args) {
		String s = "RCC Institute of Information Technology";
		s=s.replace("Information", "").replaceAll("\\s+", " ");
		System.out.println(s);
	}
}

/*

output 
RCC Institute of Technology
*/
