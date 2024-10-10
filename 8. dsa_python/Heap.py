import heapq

# Construct an empty Min Heap
minHeap = []
heapq.heapify(minHeap)

# Time complexity: O(logN)
# Space complexity: O(1)
# Insert an element to the Min Heap
heapq.heappush(minHeap, 5)

# Get top element from the Min Heap
# i.e. the smallest element
minHeap[0]

# Delete top element from the Min Heap
heapq.heappop(minHeap)

# Length of the Min Heap
len(minHeap)

# Construct an empty Max Heap
# As there are no internal functions to construct a Max Heap in Python,
# So, we will not construct a Max Heap.

# Construct a Heap with Initial values
# this process is called "Heapify"
# The Heap is a Min Heap
heapWithValues = [3,1,2]
heapq.heapify(heapWithValues)

# Trick in constructing a Max Heap
# As there are no internal functions to construct a Max Heap
# We can multiply each element by -1, then heapify with these modified elements.
# The top element will be the smallest element in the modified set,
# It can also be converted to the maximum value in the original dataset.
# Example
maxHeap = [1,2,3]
maxHeap = [-x for x in maxHeap]
heapq.heapify(maxHeap)
# The top element of maxHeap is -3
# Convert -3 to 3, which is the maximum value in the original maxHeap

# Insert an element to the Max Heap
# Multiply the element by -1
# As we are converting the Min Heap to a Max Heap
heapq.heappush(maxHeap, -1 * 5)

# Get top element from the Max Heap
# i.e. the largest element
# When inserting an element, we multiplied it by -1
# Therefore, we need to multiply the element by -1 to revert it back
-1 * maxHeap[0]

# Delete top element from the Max Heap
heapq.heappop(maxHeap)

# Length of the Max Heap
len(maxHeap)

# eg for pushpop

# initializing list
li = [5, 7, 9, 1, 3]

# using heapify to convert list into heap
heapq.heapify(li)

# printing created heap
print("The created heap is : ", end="")
# op: The created heap is : [1, 3, 9, 7, 5]
print(list(li))

# using heappush() to push elements into heap
# pushes 4
heapq.heappush(li, 4)

# printing modified heap
print("The modified heap after push is : ", end="")
# op: The modified heap after push is : [1, 3, 4, 7, 5, 9]
print(list(li))

# using heappop() to pop smallest element
print("The popped and smallest element is : ", end="")
# op: The popped and smallest element is : 1
print(heapq.heappop(li))

# The heappushpop method inserts a given item to the heap and 
# then pops the smallest element from the heap. 
# This method is equivalent to heappush() followed by heappop().

# op:3
print(heapq.heappushpop(li, 8))
print("The modified heap after pushpop is : ", end="")
# op: The modified heap after pushpop is : [4, 5, 8, 7, 9]
print(list(li))
