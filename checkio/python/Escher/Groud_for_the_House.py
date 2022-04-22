def house(plan):
    list_string = [l for l in plan.split('\n') if len(l) > 0]
    print(list_string)

    lines_index = []
    hash_index = []
    height, width = 0, 0

    for i in range(len(list_string)):
        if '#' in list_string[i]:
            lines_index.append(i)
            hash_index.append(list_string[i].find('#'))
            hash_index.append(list_string[i].rfind('#'))

            height = max(lines_index) - min(lines_index) + 1
            width = max(hash_index) - min(hash_index) + 1

    print(width, height)
    return width * height


if __name__ == '__main__':
    print("Example:")
    print(house('''
0000000
##00##0
######0
##00##0
#0000#0
'''))

    #These "asserts" using only for self-checking and not necessary for auto-testing
    assert house('''
0000000
##00##0
######0
##00##0
#0000#0
''') == 24

    assert house('''
0000000000
#000##000#
##########
##000000##
0000000000
''') == 30

    assert house('''
0000
0000
#000
''') == 1

    assert house('''
0000
0000
''') == 0

    assert house('''
0##0
0000
#00#
''') == 12

    print("Coding complete? Click 'Check' to earn cool rewards!")
