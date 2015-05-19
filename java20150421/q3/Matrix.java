import java.util.*;

class Matrix {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine().trim();
		String b []= a.split(" ");
		double tag = Double.parseDouble(b[0])*Double.parseDouble(b[3]) - Double.parseDouble(b[1])*Double.parseDouble(b[2]);
		double[] c= new double[4];
		c[0] = 	Double.parseDouble(b[3])/tag;
		c[1] = -Double.parseDouble(b[1])/tag;
		c[2] = -Double.parseDouble(b[2])/tag;
		c[3] = Double.parseDouble(b[0])/tag;
		for(int i  = 0; i < 4;i++){
			if(i==2) {
				System.out.println();
			}
			if(Math.abs(c[i]) == 0){
				System.out.print("0 ");
			} else {
				System.out.print(c[i]+" ");
			}
			if(i==3){
				System.out.println(); 
			}
		}
	}
}