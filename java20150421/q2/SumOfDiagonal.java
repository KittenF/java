import java.util.*;

class SumOfDiagonal{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int line = Integer.parseInt(sc.nextLine());
		String tag[][]= new String[line][];
		for(int i = 0; i < line; i ++) {
			 tag[i] = sc.nextLine().split(" ");
		}
		int sum = 0;
		for(int i =0; i < line; i++){
			for(int j = 0; j < line; j++){
				if(i==j) {
					sum += Integer.parseInt(tag[i][j]);
					break;
				}
			}
		}
		System.out.println(sum);
	}
}