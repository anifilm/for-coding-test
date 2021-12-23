lst = []
for i in range(9):
    k = int(input())
    lst.append(k)

ksum = sum(lst)
breaker = False
for i in range(len(lst)):
    for j in range(i+1, len(lst)):
        a, b = lst[i], lst[j]
        if ksum-a-b == 100:
            lst.remove(a)
            lst.remove(b)
            breaker = True
            break
    if breaker == True:
        break

lst.sort()
for i in lst:
    print(i)
