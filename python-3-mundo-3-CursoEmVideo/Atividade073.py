def separar():
    print("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")

tabelaBrasileirao = ("Cortinthians", "Palmeiras", "Santos", "Grêmio", "Cruzeiro", "Flamengo", "Vasco da Gama", "Chapecoense", "Atletico-MG", "Botafogo", "Athletico-PR", "Bahia", "São Paulo", "Fluiminense", "Sport Recife", "EC Vitoria", "Coritiba", "Avaí", "Ponte Preta", "Atletico-GO")

primeiroCincoColocados = tabelaBrasileirao[0:5]
osULtimosQuatrosColocados = tabelaBrasileirao[16:]
ordemAlfabetica = sorted(tabelaBrasileirao)

print("Lista dos times: ", tabelaBrasileirao)
separar()
print("A) Primeiros Cinco Colocados: ", primeiroCincoColocados)
separar()
print("B) Os Ultimos Quatros Colocados: ", osULtimosQuatrosColocados)
separar()
print("C) Ordem Alfabetica: ", ordemAlfabetica)
separar()

for pos, time in enumerate(tabelaBrasileirao):
    if time == "Chapecoense":
        print(f"O {time} está na {pos+1}ª posição")