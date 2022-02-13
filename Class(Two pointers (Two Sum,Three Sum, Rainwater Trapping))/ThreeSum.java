class Solution {
    List<List<Integer>> threeSum(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        ArrayList<List<Integer>> answer = new ArrayList<List<Integer>>();
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n - 1;
            if(i > 0 && A[i] == A[i - 1]) {
                continue;
            }
            while (j < k) {
                if(k < (n - 1) && A[k] == A[k + 1]) {
                    k--;
                    continue;
                }
                if(A[i] + A[j] + A[k] > 0) {
                    k--;
                } else if(A[i] + A[j] + A[k] < 0) {
                    j++;
                } else {
                    ArrayList<Integer> triples = new ArrayList<Integer>();
                    triples.add(A[i]);
                    triples.add(A[j]);
                    triples.add(A[k]);
                    Collections.sort(triples);
                    j++;
                    k--;
                    answer.add(triples);
                }
            }
        }
        return answer;
    }
 }
 