#include <iostream>
using namespace std;

int main() {
    int hour = 0, min = 0;
    cin >> hour >> min;
    if (min < 45) {
        if (hour == 0) {
            hour += 24 - 1;
            min += 60 - 45;
        }
        else {
            hour -= 1;
            min += 60 - 45;
        }
    }
    else {
        min -= 45;
    }
    cout << hour << " " << min << '\n';
    return 0;
}
