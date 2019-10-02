print("Enter natural numbers")
a=list(map(int,input().split()))
for i in range(len(a)):
    b=i+1
    c=i+2
    if(a[i]==b):
        a[i]=c
print(a)
