def cortarLinha():
    print(" ")
    print("----------------")
    print(" ")

# Aula 16 – Tuplas

lanche = ("Hamburge", "Suco", "Pizza", "Pudin")
##            0         1         2       3   
print(lanche[0:2]) # Ele corta o valor antes do 2, como se fosse <2
print(lanche[1:]) # Ele vai do 1 até o final
print(lanche[-1]) # pega o ultimo valor

cortarLinha()

print(len(lanche)) # Quantos tem na variavel

cortarLinha()

for c in lanche: # Para cada comida em lanche ele vai um por um
    print(c) # Exibir

cortarLinha()

# Pratica no video:
# lanche = () [] {}
# () - Tuplas - São imutáveis
# [] - Lista
# {} - Dicionario

for comida in lanche:
    print(f'Eu vou comer {comida}')
cortarLinha()

for cont in range(0, len(lanche)):
    print(f'Eu vou comer {lanche[cont]} na posição {cont}')
cortarLinha()

for pos, comida in enumerate(lanche):
    print(f'Eu vou comer {comida} na posição {pos}')
cortarLinha()

print(lanche)
print(sorted(lanche)) # Organiza, coloca em ordem

cortarLinha()

a = (2, 5, 4)
b = (5, 8, 1, 2)
c = a+b
print(c)
print(len(c))
print(c.count(5)) # Quantas vezes tem X coisa
print(c.index(8)) # Em qual possição estar o X valor
print(c.index(5, 1)) # Em qual possição estar o X valor, que vai começar na possiçao Y

cortarLinha()

pessoa = ('Mateus', 17, 'M', 60.0)
del(pessoa) # É para apagar da memoria essa variavel
print(pessoa)
# ---------------------