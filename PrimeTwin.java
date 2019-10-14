import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
		public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		int loop = Integer.parseInt(br.readLine());
		while (loop > 0) {
			String ip[] = br.readLine().split(" ");
			int s = Integer.parseInt(ip[0]);
			int f = Integer.parseInt(ip[1]);
			boolean flag = true;
			int i = 2;
			while (flag && (s + i) < f) {
				if (prime(s + i) && prime(s + i - 2))
					flag = false;
				else
					++i;
			}
			if (flag)
				System.out.println("-1");
			else

				System.out.println((s + i - 2) + " " + (i + s));

			loop--;
		}
	}

static boolean prime(int num) {
		if (num > 2) {
			for (int j = num - 1; j > 2; j--) {
				if (num % j == 0)
					return false;
			}
			return true;
		} else
			return false;
	}

}
