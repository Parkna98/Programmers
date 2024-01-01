import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
			int k=Integer.parseInt(br.readLine());
			int n=Integer.parseInt(br.readLine());
			
			int[][] arr=new int[k+1][n];
			for(int j=1;j<=n;j++) {
				arr[0][j-1]=j;
			}
			for(int f=1;f<=k;f++) {
				for(int r=0;r<n;r++) {
					if(r==0) {
						arr[f][r]=1;
					}else {
						arr[f][r]=arr[f][r-1]+arr[f-1][r];
					}
				}
			}
			System.out.println(arr[k][n-1]);
		}
	}

}
/*
 *	0층 1 2 3  4  5
 *	1층 1 3 6  10 15
 *  2층 1 4 10 20 35
 *	
 */
