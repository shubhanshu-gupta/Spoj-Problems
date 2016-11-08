import sys

n, k = raw_input().strip().split(' ')
n, k = [int(n), int(k)]
a = map(int, raw_input().strip().split(' '))


additional_walks = 0
for i in range(len(a)-1):
	walk = a[i] + a[i+1]
	short_by = k-walk
	if short_by == 0 or short_by < 0:
		continue
	else:
		a[i+1]+=short_by
		additional_walks += short_by

if additional_walks > 0:
	print additional_walks
else:
	print "0"

array = [str(i) for i in a]
print ' '.join(array)
