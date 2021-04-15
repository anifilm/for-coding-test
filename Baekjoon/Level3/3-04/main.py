import sys
input = sys.stdin.readline
n = int(input())
for i in range(0, n):
    a = input().split()
    print(int(a[0]) + int(a[1]))
