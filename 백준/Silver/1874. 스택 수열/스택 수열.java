import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int n=Integer.parseInt(br.readLine());
		Stack<Integer> stack=new Stack<>();
		int start=0;
		
		while(n-- >0) {
			int value=Integer.parseInt(br.readLine());
			if(value>start) {
				for(int i=start+1;i<=value;i++) {
					stack.push(i);
					sb.append("+").append("\n");
				}
				// value=4 
				// 1 2 3 4 push
				// start=4 
				// 4까지 추가후 4를 pop 
				// 그 다음 while문 진행
				// 그 다음 value 3
				// if문 만족안하고 peek값 일치하므로 3 pop, start 3 
				// while 문 진행 value 6
				// 6까지 추가후 6 pop
				// 만약 peek값이 value와 다르면 NO출력
				start=value;
			}
			else if(stack.peek()!=value) {
				System.out.println("NO");
				return;
			}
			
			stack.pop();
			sb.append("-").append("\n");
		}
		System.out.println(sb);
		
	}
}
