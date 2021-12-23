n = int(input())

cards = list(range(1, n+1))

while len(cards) > 1:
    first_card = cards.pop(0)
    second_card = cards.pop(0)
    cards.append(second_card)

print(cards[0])
