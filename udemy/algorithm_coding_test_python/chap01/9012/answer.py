t = int(input())

for _ in range(t):
    data = input()

    isVPS = True
    stack = []
    for ch in data:
        if ch == '(':
            stack.append(ch)
        else:
            if stack:
                stack.pop()
            else:
                isVPS = False
                break

    if stack:
        isVPS = False

    print('YES' if isVPS else 'NO')
