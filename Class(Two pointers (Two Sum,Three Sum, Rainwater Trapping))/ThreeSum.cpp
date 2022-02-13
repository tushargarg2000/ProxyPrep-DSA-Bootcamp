vector<vector<int>> threeSum(vector<int> &A) {
   int n = A.size();
   sort(A.begin(), A.end());
   vector<vector<int>> answer;
   for (int i = 0; i < n; i++) {
       int j = i + 1;
       int k = n - 1;
       if(i > 0 && A[i] == A[i - 1]) {
           continue;
       }
       while(j < k) {
           if(k < (n - 1) && A[k] == A[k + 1]) {
               k--;
               continue;
           }
           if(A[i] + A[j] + A[k] > 0) {
               k--;
           } else if(A[i] + A[j] + A[k] < 0) {
               j++;
           } else {
               vector<int> triples = {A[i], A[j], A[k]};
               sort(triples.begin(), triples.end());
               j++;
               k--;
               answer.push_back(triples);
           }
       }
   }
   return answer;
}
