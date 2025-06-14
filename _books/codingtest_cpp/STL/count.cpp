#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

int main()
{
    vector<int> v = {1, 2, 3, 4, 5, 1, 2, 1};

    int count_of_ones = count(v.begin(), v.end(), 1);
    cout << "Count of 1s: " << count_of_ones << endl;

    return 0;
}
