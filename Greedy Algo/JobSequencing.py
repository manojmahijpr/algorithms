def printJobScheduling(arr, t): 
    
	arr.sort(key = lambda x: x[2], reverse=True) 
	# To keep track of free time slots 
	print(arr)
	result = [False] * t
    
	# To store result (Sequence of jobs) 
	job = ['-1'] * t
    
    

	# Iterate through all given jobs 
	for i in range(len(arr)): 

		# Find a free slot for this job 
		# (Note that we start from the last possible slot) 
		for j in range(min(t - 1, arr[i][1] - 1), -1, -1): 
			print(i,j)
			# Free slot found 
			if result[j] is False: 
				result[j] = True
				job[j] = arr[i][0] 
				break

	# print the sequence 
	print(job) 

# Driver COde 
# arr = [['a', 2, 100], # Job Array 
# 	['b', 1, 19], 
# 	['c', 2, 27], 
# 	['d', 1, 25], 
# 	['e', 3, 15]] 
arr = [['J1', 3, 35], # Job Array 
	['J2', 4, 30], 
	['J3', 4, 25], 
	['J4', 2, 20], 
	['J5', 3, 15], 
	['J6', 1, 12], 
	['J7', 2, 5]] 


print("Following is maximum profit sequence of jobs") 
printJobScheduling(arr, 4) # Function Call 

# This code is contributed 
# by Anubhav Raj Singh 
