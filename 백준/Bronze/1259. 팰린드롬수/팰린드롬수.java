import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) throws IOException{
		List<String> list=new ArrayList<>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String str=br.readLine();
			StringBuilder sb=new StringBuilder(str);
			if(str.equals("0"))
				break;
			else if(str.equals(sb.reverse().toString()))
				list.add("yes");
			else 
				list.add("no");
		}
		for(String s:list) {
			System.out.println(s);
		}
	}

}
