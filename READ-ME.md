Integrantes: Sebastian Aliante, Diego Navarro, Pablo Perez

Palindromo 

Paso 1:
El método retorna un valor booleano con entrada "cadena" que 
en este caso es una palabra.
Primero se inicializa una variable vacía llamada "resultado" de
cualquier tipo.
Luego se iguala esta variable con la variable "cadena" pero a ésta
se le separan las letras,se voltea cada dato (letra) dejando la 
palabra al revés.
Se comparan los caracteres y si son iguales retorna true, si son 
diferentes retornará un false.

Paso 2: 
El método "esPalindromo", se ingresa como parametro una cadena de tipo String y retorna
un valor de tipo Boolean.
Este metodo comienza dejando "cadena" en minusculas,luego el método replace quita los
espacios en blanco en caso de tenerlos(cadena).
Luego utilizamos la clase(String builder) para poder ocupar el método "reverse" invirtiendo
el orden de la cadena.
Por ultimo este método retorna un valor boolean al comparar "resultado" con "cadena".
El método "printRespuesta" cumple con la función de imprimir si el resultado es o no palindromo.



Paso 3:
Casos de Pruebas Unitarias a implementar:

-Ingresar un numero como String

-Ingresar simbolos como String

-Ingresar una cadena vacia

-Ingresar un numero entero


