import java.lang.*;
import java.io.*;

class GFG {
public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int loop = Integer.parseInt(br.readLine());
		while (loop > 0) {
		    String s=br.readLine();
			int pairs = 0;
			String ar[] = br.readLine().split(" ");
			Arrays.sort(ar);
			int i = 1;
			while (i < ar.length) {
				if (ar[i].equals(ar[i - 1])) {
					++pairs;
					i += 2;
				} else
					i++;
			}
			System.out.println(pairs*2);
			loop--;
		}
	}
}
