#include <stdio.h>

int main() {
    int i, c, n, count = 0;
    int score[1000], total, average, up_avg_co;

    scanf("%d", &c);
    while (count < c) {
        total = 0, average = 0, up_avg_co = 0;
        scanf("%d", &n);
        for (i = 0; i < n; i++) {
            scanf("%d", &score[i]);
            total += score[i];
        }
        average = total / n;
        for (i = 0; i < n; i++) {
            if (score[i] > average) up_avg_co++;
        }
        printf("%.3lf%%", (double)up_avg_co / n * 100);
        count++;
    }

    return 0;
}
