import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int[] narr=new int[n];
		for(int i=0;i<n;i++) {
			narr[i]=Integer.parseInt(st.nextToken());
		}
		int m=Integer.parseInt(br.readLine());
		st=new StringTokenizer(br.readLine()," ");
		int[] marr=new int[m];
		for(int i=0;i<m;i++) {
			marr[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(narr);
		for(int num:marr) {
			if(binarySearch(num,0,n-1,narr)!=-1) {
				System.out.println("1");
			}else{
				System.out.println("0");
			}
			
		}
		
	}
	public static int binarySearch(int key,int low,int high,int[] arr) {
		int mid;
		
		while(low<=high) {
			mid=(low+high)/2;
			if(key==arr[mid]) {
				return mid;
			}else if(key<arr[mid]) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		
		return -1;
	}

}
