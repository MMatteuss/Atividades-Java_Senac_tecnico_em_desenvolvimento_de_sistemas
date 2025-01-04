numero = (
            'zero', 'um', 'dois', 'tres','quatro', 'cinco', 'seis', 'sete','oito', 'nove', 'dez',
            'onze', 'doze', 'treze', 'quatoze','quinze', 'dezeseis', 'dezoito', 'dezoito','dezenove', 'vinte', 'vinte um'
          )

numeroUsuario = int(input('Digite um numero entre 0 a 20:'))

while(numeroUsuario < 0 or numeroUsuario>20):
    numeroUsuario = int(input('Tente novamente. Digite um numero entre 0 a 20:'))

print(f'Você digitou o número {numero[numeroUsuario]}')