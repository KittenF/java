import java.util.*;

public class Pyramid{
	public static void main(String args[]) {
		System.out.print("Input height:");
		Scanner sc = new Scanner(System.in);
		int h  = sc.nextInt(); // ����
		int wid = 2 * h  -1; // �e��
		for(int i = 1; i <= h;i++){
			int star = 2 * i -1; //�P�P��
			int nostar = (wid - star)/2; // �ťռ�
			for(int j = 0; j < nostar; j++) { //�L�ť�
				System.out.print(" ");
			}
			for(int j = 0; j < star; j++) { //�L�P�P
				System.out.print("*");
			}
			System.out.println();
		}
	}

}