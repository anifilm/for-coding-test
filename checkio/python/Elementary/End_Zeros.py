def end_zeros(num: int) -> int:
    str_num = str(num)
    ans = 0

    for i in str_num[::-1]:
        if int(i) == 0:
            ans += 1
        else:
            break

    return ans


if __name__ == '__main__':
    print("Example:")
    print(end_zeros(0))

    # These "asserts" are used for self-checking and not for an auto-testing
    assert end_zeros(0) == 1
    assert end_zeros(1) == 0
    assert end_zeros(10) == 1
    assert end_zeros(101) == 0
    assert end_zeros(245) == 0
    assert end_zeros(100100) == 2
    assert end_zeros(10010000) == 4
    print("Coding complete? Click 'Check' to earn cool rewards!")
