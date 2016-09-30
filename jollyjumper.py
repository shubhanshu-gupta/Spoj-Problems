#Problem 2.8.1 Jolly Jumper

s = raw_input()
input = s.split()
input_array = []
for i in input:
	input_array.append(int(i))
	
n = len(input_array)
permissible_array = []
for i in xrange(1, n):
	permissible_array.append(i)
	
jolley = True
for i in xrange(0, n-1):
	if not int(abs(input_array[i]-input_array[i+1])) in permissible_array:
		jolley = False
	else:
		jolley = True

if jolley is True:
	print "Jolly"
else:
	print "Not Jolley"