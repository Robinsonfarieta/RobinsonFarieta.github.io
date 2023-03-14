### Declaramos la libreria en este caso random
from random import choice

print('Bienvenido al generador de pasword')

##### declaramos la lista en la que la funcion variable va a escoger aleatoriamente 
valores = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ<=>@#%&+"

#####  declaramos la funcion length el cual por medio del input nos va a solicitar cuantos
#####  caracteres necesita utilizar el usuario el pasword
length = input ('tu pasword tiene ')
length = int(length)

p = ""
p = p.join([choice(valores) for i in range(length)])

####### imprime el total de caracteres solicitado por el usuario 
print('Tu pasword Generado Es')
print(p)


        
        
