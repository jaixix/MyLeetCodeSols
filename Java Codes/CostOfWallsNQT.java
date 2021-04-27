import java.util.*;
public class CostOfWallsNQT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iw = sc.nextInt();
		int ew = sc.nextInt();
		float [] siw = new float[iw];
		float [] sew = new float[ew];
		float sum1=0,sum2=0;
		for(int i=0;i<iw;i++) {
			siw[i] = sc.nextFloat();
			sum1 += siw[i];
		}
		for(int i=0;i<ew;i++) {
			sew[i] = sc.nextFloat();
			sum2 += sew[i];
		}
		float cost = (sum1*18)+(sum2*12);
		System.out.println("Total estimated Cost : "+ cost +" INR");
	}
}
