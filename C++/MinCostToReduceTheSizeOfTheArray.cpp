#include <iostream>
#include <vector>
#include <algorithm>
#include <bits/stdc++.h>
int minCost(vector<int>& arr) {
    sort(arr.begin(), arr.end());
    // temp array will contain the sum of all the pairs of minimum elements
    vector<int> temp;
    // index for arr
    int i = 0;
    // index for temp
    int j = 0;
    int cost = 0;

    // while we have more than 1 element combined in both the input and temp array
    while(arr.size() - i + temp.size() - j > 1) {
        int num1, num2;
        // selecting num1 (minimum element)
        if(i < arr.size() && j < temp.size()) {
            if(arr[i] <= temp[j])
                num1 = arr[i++];
            else
                num1 = temp[j++];
        }
        else if(i < arr.size())
            num1 = arr[i++];
        else if(j < temp.size())
            num1 = temp[j++];

        // selecting num2 (second minimum element)
        if(i < arr.size() && j < temp.size()) {
            if(arr[i] <= temp[j])
                num2 = arr[i++];
            else
                num2 = temp[j++];
        }
        else if(i < arr.size())
            num2 = arr[i++];
        else if(j < temp.size())
            num2 = temp[j++];

        // appending the sum of the minimum elements in the temp array
        int sum = num1 + num2;
        temp.push_back(sum);
        cost += sum;
    }
    return cost;
}


int main() {
    // Test case
    vector<int> arr = {4, 3, 2, 6, 5};
    
    // Calling the function
    int result = minCost(arr);
    
    // Output the result
    cout << "Minimum cost: " << result << endl;
    
    return 0;
}
