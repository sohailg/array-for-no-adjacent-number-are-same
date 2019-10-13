#include <iostream>
#include <algorithm>
#include <functional>
#include <vector>
#include <iomanip>
#include <iterator>
using namespace std;
 
void print(char a[], int N)
{   
    for (int i = 0; i < N; i++)
    {
        cout <<  a[i] << "  ";
    }
    cout << endl;
}
 
int main()
{
    char a[] = {'a', 'a', 'a', 'e', 'c', 'd', 'd', 'e', 'e', 'e'};
    int alen = sizeof(a) / sizeof(char);
    char b[alen];
    char * p;
 
    cout << "Characters : ";
    print(a, alen);
    cout << "Removing duplicate adjacent characters ... " << endl;
    cout << "Characters : ";
    // unique returns pointer to one element ahead of last element
    p = unique(a, a + alen);
    print(a, p - a);
}