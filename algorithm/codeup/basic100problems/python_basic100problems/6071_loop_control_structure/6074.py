last_char = ord(input())
curr_char = ord('a')
while last_char>=curr_char:
    print(chr(curr_char), end=' ')
    curr_char += 1