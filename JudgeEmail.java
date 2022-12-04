import java.util.Scanner;
import java.util.regex.*;
public class JudgeEmail {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(judging(s));
	}
	
	public static boolean judging(String s) {
		return s.matches("[0-9a-zA-Z]{1,}@[a-z]{1,}\56[a-z]{1,}");
	}

}
