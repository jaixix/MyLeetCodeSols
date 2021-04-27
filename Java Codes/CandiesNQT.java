import java.util.*;
public class CandiesNQT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int candies=10,k=5;
		if(n!=0 && n<=(candies-k)){
			System.out.println("NUMBER OF CANDIES SOLD :"+n);
			System.out.println("NUMBER OF CANDIES LEFT :"+(candies-n));
		}
		else {
			System.out.println("INVALID INPUT");
			System.out.println("NUMBER OF CANDIES LEFT :"+candies);
		}
	}
}
