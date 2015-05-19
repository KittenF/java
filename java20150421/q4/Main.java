import java.util.*;
class Finder {
		public static String prefix(String s1, String s2){
			int tag = 0;
			String s3 = "";
			if(s1.length()<s2.length()){
				tag = s1.length();
			} else {
				tag = s2.length();
			}
			for(int i =0; i < tag;i++) {
				if(s1.charAt(i) == s2.charAt(i)){
					s3  += String.valueOf(s1.charAt(i));
				} else  {
					break;
				}
			}
			return s3;
		}
}
public class Main {
		public static void main(String[] args) {
			String s1, s2;
			Scanner sc = new Scanner(System.in);
			s1 = sc.next();
			s2 = sc.next();
			System.out.println(Finder.prefix(s1, s2));
		}
}
