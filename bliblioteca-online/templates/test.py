a = 0.1
b = 0.2
print('-'*20)
if a==a and b==b:
    a = int((str(a)).replace('0.',''))
    b = int((str(b)).replace('0.',''))
    print(f'0.{a+b}')
else:
    print("erro")