def printJobScheduling(arr, t): 
    
	arr.sort(key = lambda x: x[2], reverse=True) 
    
	# To keep track of free time slots 
	result = [False] * t
    
	# To store result (Sequence of jobs) 
	job = ['-1'] * t
    
    

	# Iterate through all given jobs 
	for i in range(len(arr)): 

		# Find a free slot for this job 
		# (Note that we start from the last possible slot) 
		for j in range(min(t - 1, arr[i][1] - 1), -1, -1): 
			
			# Free slot found 
			if result[j] is False: 
				result[j] = True
				job[j] = arr[i][0] 
				break

	# print the sequence 
	print(job) 

# Driver COde 
arr = [['a', 2, 100], # Job Array 
	['b', 1, 19], 
	['c', 2, 27], 
	['d', 1, 25], 
	['e', 3, 15]] 


print("Following is maximum profit sequence of jobs") 
printJobScheduling(arr, 3) # Function Call 

# This code is contributed 
# by Anubhav Raj Singh 