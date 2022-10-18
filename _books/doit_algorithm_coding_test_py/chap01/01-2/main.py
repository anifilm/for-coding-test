n = int(input())

number = []

for _ in range(n):
    num = int(input())
    number.append(num)

number.sort()

for i in set(number):
    print(i)
