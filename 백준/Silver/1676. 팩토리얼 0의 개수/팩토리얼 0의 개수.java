import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int count=0;
		while(N>=5) {
			count+=N/5;
			N/=5;
		}
		
		System.out.println(count);
	}

}