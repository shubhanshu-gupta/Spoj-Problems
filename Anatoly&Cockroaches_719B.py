n = int(raw_input())
pattern = raw_input()

countr1 = 0
countr2 = 0
countb1 = 0
countb2 = 0

i = 0
while(i<n):
	if pattern[i] == 'r':
		countr1 += 1
	if pattern[i] == 'b':
		countb1 += 1
	i+=2

i = 1
while(i<n):
	if pattern[i] == 'r':
		countr2 += 1
	if pattern[i] == 'b':
		countb2 += 1
	i+=2
	

print min(max(countr1, countb2), max(countb1, countr2))
