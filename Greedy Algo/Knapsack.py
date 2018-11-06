

def fractional_knapsack(profit, weight, capacity):
    
    index = list(range(len(profit)))
    ratio = [p/w for p, w in zip(profit, weight)]
    index.sort(key=lambda i: ratio[i], reverse=True)
    
    max_profit = 0
    fractions = [0]*len(profit)
    for i in index:
        if weight[i] <= capacity:
            fractions[i] = 1
            max_profit += profit[i]
            capacity -= weight[i]
        else:
            fractions[i] = capacity/weight[i]
            max_profit += profit[i]*fractions[i]
            break
 
    return max_profit, fractions
 
 
n = int(input('Enter number of items: '))
profit = input('Enter the profits of the {} item(s) in order: '
              .format(n)).split()
profit = [int(v) for v in profit]

weight = input('Enter the positive weights of the {} item(s) in order: '
               .format(n)).split()
weight = [int(w) for w in weight]
capacity = int(input('Enter maximum weight: '))

# profit = [10, 5, 15, 7, 6, 18, 3]
# weight = [2, 3, 5, 7, 1, 4, 1]
# capacity = 15 
max_profit, fractions = fractional_knapsack(profit, weight, capacity)
print('The maximum profit of items that can be carried:', max_profit)
print('The fractions in which the items should be taken:', fractions)
