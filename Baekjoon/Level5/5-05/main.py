n = int(input())
score = list(map(int, input().split()))

total = 0
for i in range(n):
    total += score[i] / max(score) * 100

print(total / n)
