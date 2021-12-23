from collections import deque

n = int(input())
cards = deque(range(1, n+1))

while len(cards) > 1:
    first_card = cards.popleft()
    second_card = cards.popleft()
    cards.append(second_card)

print(cards[0])
