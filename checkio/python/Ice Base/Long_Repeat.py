def long_repeat(line):
    """
        length the longest substring that consists of the same char
    """
    words = list(line)
    current = []
    counter = ['']
    count = 0

    for word in words:

        if current == word:
            counter.append(word)

        else:
            counter.pop()
            current = word
            counter.append(word)
        
        if count < counter.count(word):
            count = counter.count(word)

    return count

if __name__ == '__main__':
    #These "asserts" using only for self-checking and not necessary for auto-testing
    assert long_repeat('sdsffffse') == 4, "First"
    assert long_repeat('ddvvrwwwrggg') == 3, "Second"
    assert long_repeat('abababaab') == 2, "Third"
    assert long_repeat('') == 0, "Empty"
    print('"Run" is good. How is "Check"?')