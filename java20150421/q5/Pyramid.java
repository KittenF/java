import java.util.*;

public class Pyramid{
	public static void main(String args[]) {
		System.out.print("Input height:");
		Scanner sc = new Scanner(System.in);
		int h  = sc.nextInt(); // 高度
		int wid = 2 * h  -1; // 寬度
		for(int i = 1; i <= h;i++){
			int star = 2 * i -1; //星星數
			int nostar = (wid - star)/2; // 空白數
			for(int j = 0; j < nostar; j++) { //印空白
				System.out.print(" ");
			}
			for(int j = 0; j < star; j++) { //印星星
				System.out.print("*");
			}
			System.out.println();
		}
	}

}