package day_6;

public class Substring_removal_09 {
	public static void main(String[] args) {
		String s = "RCC Institute of Information Technology";
		s=s.replace("Information", "").replaceAll("\\s+", " ");
		System.out.println(s);
	}
}

