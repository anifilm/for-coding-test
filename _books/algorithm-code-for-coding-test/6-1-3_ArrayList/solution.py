N, K = map(int, input().split())
data = list(input())

for i in range(1, N):
    while data[i-1] < data[i] and K:
        K -= 1
        del data[i-1]
        data.insert(0, 'a')

answer = ''
for j in data:
    if j != 'a':
        answer += j

print(answer)
