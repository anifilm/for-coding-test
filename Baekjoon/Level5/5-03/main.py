a = int(input())
b = int(input())
c = int(input())
t = list(map(int, (str)(a * b * c)))

for i in range(10):
    print(t.count(i))
