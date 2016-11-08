import sys

n = int(raw_input())
left = []
right = []

for _ in xrange(0, n):
	l,r = raw_input().strip().split(' ')
	l,r = [int(l),int(r)]
	left.append(l)
	right.append(r)

sum_left = sum(left)
sum_right = sum(right)

beauty = abs(sum_left-sum_right)

index = 0
for i in xrange(0, n):
	temp_sum_left = sum_left - left[i] + right[i]
	temp_sum_right = sum_right - right[i] + left[i]
	new_beauty = abs(temp_sum_left-temp_sum_right)

	if beauty<new_beauty:
		beauty = new_beauty
		index = i+1

print index
