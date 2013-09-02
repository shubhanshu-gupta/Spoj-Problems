class Main:
	t=int(input())
	for l in range(0,t):
		s=raw_input()
		a=s.split(" ")
		n=int(a[0])
		k=int(a[1])
		s=raw_input()
		a=s.split(" ")
		j=0
		li=[int(x) for x in a]
		li.sort()
		su=0
		j=0
		for j in range(0,n):
			p=[]
			s=raw_input()
			a=s.split(" ")
			p=[int(x) for x in a]	
			x=int(p[0]);
			p.remove(p[0])
			p.sort()
			p.reverse()	
			i=0
			if(k!=0):
				if( li[0]==j):
					count=li.count(li[0])
					k-=count
					while(x!=0 and count!=0):
						su+=int(p[i])
						i+=1
						x-=1
						li.remove(li[0])
						count-=1
					while(count!=0):
						li.remove(li[0])
						count-=1
			else:
				break;
		print su

	


