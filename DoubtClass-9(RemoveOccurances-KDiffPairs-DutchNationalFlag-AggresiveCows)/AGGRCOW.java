import java.util.*;

class AGGRCOW {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // test cases -> number of indepdent set of inputs.
		while(t-- > 0) {
			int n = sc.nextInt(); // number of stalls
			int c = sc.nextInt(); // number of cows
			int ar[] = new int[n];
			for(int i=0;i<n;i++) {
				ar[i] = sc.nextInt();
			}
			Arrays.sort(ar);
			int low = 0;
			int high = 1000000000;
			int ans = 0;
			while(low <= high) {
				int mid = (low + high)/2;
				// Check if mid can be a answer or not
				// By counting number of cows you can keep with mid as minimum distance between stalls
				int k = 1; // count
				int prev = ar[0]; // position of first cow
				for(int i=1;i<n;i++) {
					if(ar[i]-prev >= mid) {
						k++;
						prev = ar[i];
					}
				}
				if(k >= c) {
					ans = mid;
					low = mid+1;
				}
				else {
					high = mid-1;
				}
			}
			System.out.println(ans);
		}
	}
}