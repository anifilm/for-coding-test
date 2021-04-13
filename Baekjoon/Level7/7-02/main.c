#include <stdio.h>

int main() {
    int i, len, sum = 0;
    scanf("%d", &len); getchar();
    char nums[len];
    for (i = 0; i < len; i++) {
        scanf("%c", &nums[i]);
        sum += nums[i]-48;
    }
    printf("%d", sum);
    return 0;
}
