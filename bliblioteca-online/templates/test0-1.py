qnt = 0 
soma = 0 
media = 0
valor = float(input('Digite um valor: ')) 

while (valor > 0.0):
    soma= soma+valor
    qnt = qnt+1
    valor = float(input('Digite um valor: ')) 
    
media = soma/qnt
print(soma)
print(qnt)
print(media)