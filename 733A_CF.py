import sys

input_str = raw_input()

vowels = ['A', 'E', 'I', 'O', 'U', 'Y']

max_jump = 0
baby_jump = 0
for i, char in enumerate(input_str):
	if char not in vowels:
		baby_jump += 1
	else:
		baby_jump = 0
	if max_jump <= baby_jump:
		max_jump = baby_jump+1


