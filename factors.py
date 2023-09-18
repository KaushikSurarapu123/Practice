N = int(input("Enter the value of N: "))#enter input
for x in range (1,N+1): #n=1 = 19, gives range
    if N%x==0: #find factors
        print(x , end=',')#print factors
#end program