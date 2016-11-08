import sys

k, r = raw_input().strip().split(' ')
k, r = [int(k), int(r)]

i = 1
condition = False

while(condition==False):
	i_shovel = i*k
	change = i_shovel % 10
	if change == r or change == 0:
		print i
		condition = True
	else:
		i += 1
