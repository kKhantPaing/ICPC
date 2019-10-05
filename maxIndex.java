import java.io.*;
public class GFG{


{
		public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int loop = Integer.parseInt(br.readLine());
		while (loop > 0) {
			int si = Integer.parseInt(br.readLine());
			int arr[] = new int[si];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			int max = 0;
			for (int i = 0; i < si / 2; i++) {
				int j = si - 1 - i;
				if (arr[i] <= arr[j])
					if (max < j - i)
						max = j - i;

			}

			System.out.println(max);
			loop--;
		}
	}
}
