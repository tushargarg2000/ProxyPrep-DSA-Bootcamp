vector<int> getCumulativeSum(vector<int> &arr)
{
    // add your logic here
    int n = arr.size();
    vector<int> v;       // size of vector is 0
    v.push_back(arr[0]); // size of vector 1 v[0] = arr[0]

    for (int i = 1; i < n; i++)
    {
        int curr = arr[i] + v[i - 1];
        v.push_back(curr);
    }

    return v;
}