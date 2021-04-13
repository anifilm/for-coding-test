a = []
max = 0
for i in range(9):
    n = (int)(input())
    a.append(n)
    if (n > max):
        max = n

print(max, a.index(max) + 1)
