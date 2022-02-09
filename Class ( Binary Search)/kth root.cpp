#include<iostream>
using namespace std;

//check whether the condition mid^k<=n is being satisfied
bool isValid(long long int mid,long long int K,long long int N){
	long long int val=1;
	// calculate mid^K
	for(int i=1; i<=K; i++){
		val *= mid;
	
		if(val>N){
			return false;
		}
	}
	
	return val<=N;
}

//calculate greatest value of x such that X^k<=n
long long int kthRoot(long long int N,long long int K){
	if(K==1){
		return N;
	}

	long long int ans, start=1, end=1e8;

	bool valid;

	while(start <= end){

		long long int mid = start + (end-start)/2;
		

		valid = isValid(mid, K, N);
		
		
		if(valid){
			ans=mid;
			start=mid+1;
		}
		else{
			end=mid-1;
		}
	}
	return ans;
}
int main() {

	int t;
	cin >> t;
	while(t--){
		long long int N;
		long int K;
		cin >> N >> K;

		long long int ans = kthRoot(N,K);
		cout<<ans<<endl;
	}
	return 0;
}
