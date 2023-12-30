import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int[] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int max=arr[N-1];
		double avg=0.0;
		for(int num:arr) {
			avg+=(num*1.00/(max*1.00)*100.00);
		}
		System.out.println(avg/N*1.0000);
	}

}