##Reverse a LL

class Node:

	def __init__(self, data):
		self.data = data
		self.next = None

class LinkedList:

	def __init__(self):
		self.head = None

	def reverseUtil(self, curr, prev):
		if curr.next is None:
			self.head = curr

			#updating next to previous node
			curr.next = prev
			return

		next = curr.next
		curr.next = prev

		self.reverseUtil(next, curr)

	def reverse(self):
		if self.head is None:
			return
		self.reverseUtil(self.head, None)

	def Push(self, new_data):
		new_node = Node(new_data)
		new_node.next = self.head
		self.head = new_node

	def printList(self):
		temp = self.head
		while (temp):
			print temp.data
			temp = temp.next