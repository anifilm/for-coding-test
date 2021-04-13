#include <iostream>
using namespace std;

int main() {
    int i, count, a = 0, b = 0;
    cin >> count;
    for (i = 0; i < count; i++) {
        cin >> a >> b;
        cout << a + b << '\n';
    }
    return 0;
}
