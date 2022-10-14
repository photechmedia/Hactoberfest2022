#include <iostream>
using namespace std;

int binarySearch(int arr[], int left, int right, int key)
{
    while (left <= right)
    {
        int mid = left + (right - left) / 2;
        if (arr[mid] == key)
        {
            return mid;
        }
        else if (arr[mid] < key)
        {
            left = mid + 1;
        }
        else
        {
            right = mid - 1;
        }
    }
    return -1;
}

int main()
{
    int n, key;
    cout << "Enter number of elements in the array:";
    cin >> n;
    int a[n];
    cout << "Enter elements in the array in sorted order:";
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    cout << "Enter key to be searched:";
    cin >> key;
    int ans = binarySearch(a, 0, n - 1, key);
    if (ans == -1)
    {
        cout << "Key not found in the array" << endl;
    }
    else
    {
        cout << "Key found in the array at position " << ans << endl;
    }
    return 0;
}