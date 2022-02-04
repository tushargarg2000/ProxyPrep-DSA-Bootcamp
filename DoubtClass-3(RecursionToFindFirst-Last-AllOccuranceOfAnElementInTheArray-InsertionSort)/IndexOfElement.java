class IndexOfElement {
	public static void main(String[] args) {
		int n = 10;
		int ar[] = {10, 20, 30, 20, 20, 40, 30, 50, 20, 10};
		int element = 20;
		//printFirstIndex(ar,0,n,element);
		 //printAllIndex(ar,0,n,element);
		 printEndIndex(ar,n-1,element);
	}
	private static void printFirstIndex(int ar[],int index,int n,int element) {
		if(index == n) { // breaking condition
			return;
		}
		if(ar[index] == element) {
			System.out.println(index);
			return;
		}
		printFirstIndex(ar,index+1,n,element);
	}
	private static void printAllIndex(int ar[],int index,int n,int element) {
		if(index == n) {
			return;
		}
		if(ar[index] == element) {
			System.out.println(index);// we will not return from here
		}
		printAllIndex(ar,index+1,n,element);
	}
	private static void printEndIndex(int ar[],int index,int element) {
		if(index == -1) {
			return;
		}
		if(ar[index] == element) {
			System.out.println(index);
			return;
		}
		printEndIndex(ar,index-1,element);
	}
}

// // main function
// vector<int> v;

// solve(ar,0,n,v);

// // print vector

// vector<int> solve(int ar[],int index,int n) {
// 	if(index == n) {
// 		return;
// 	}
// 	vector<int> v = solve(ar,index+1,n,v);
// 	if(ar[index] == element) {
// 		v.push_back(element);
// 	}
// 	return v;
// }