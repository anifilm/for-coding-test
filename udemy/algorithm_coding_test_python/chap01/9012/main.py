t = int(input())

for i in range(t):
    data = list(input())

    answer = 'YES'
    stack = []

    if len(data) % 2 == 1: # 입력값이 홀수 개이면 pass
        answer = 'NO'
    else:
        for j in range(len(data)):
            end = data.pop()
            if end == ')':
                stack.append(end)
            else: # '(' 이면
                if len(stack) > 0:
                    stack.pop()
                else:
                    answer = 'NO'
                    break

    if len(stack) > 0: answer = 'NO'
    print(answer)
