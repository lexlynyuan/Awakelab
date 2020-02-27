Fecha: 26-02-20

Grupo: 
Lexlyn Yuan
Carlos Contreras
Felipe Riquelme

Contextualización del problema:

En el ejercicio planteado, dado que las tres tipos de vehículos (Kromis, Caguanos y Trupallas)
tienen un largo u ancho determinado, y existen dentro de una clase ejecutable tablero de 
dimensiones conocidas (15x15), la dinámica de este ejercicio es crear una solución a una
dinámica del tipo "Combate Naval". 
Es importante Notar que el ejercicio distingue directamente las clases y métodos, sin embargo
existen diferentes formas de abordar la solución de este ejercicio, tomando nosotros la que 
pensamos es más atingente a la solución y que aplica lo que hemos aprendido mediante las
prácticas en clases.



Solución del Problema:

Abordamos la solución creando cada una de las clases mencionadas de vehúculos, todos con sus
dimensiones (largo y ancho) y su posición como base.

Superclase Carro: 'cantidad de ocupantes', 'fecha de ingreso a la institucion' y 'posición'

heredan de Superclase Carro:
Clase Kromi: con sus atributos adicionales 'año de fabricacion' y 'Marca'
Clase Caguano: con atributos adicionales 'alcance de tiro' y 'color confeti'
Clase Trupalla: con atributo adicional 'nivel de armadura', 'quien conduce'
Clase Show'

Clase Huevo: que realiza los tiros. Se apoya en método de BuscaLetra.

Clase Tablero (main): 
instancias de las hijas de clase carro (máximo 18 objetos) e instancias clase huevo (sin limite).
Esta Clase además tiene los métodos que pueden ser elegidos con un JOption desplegado que permite
la elección de una alternativa inputada por el usuario.

Los métodos
*Crear Carro: coloca los 18 objetos de manera random en el tablero.
* lanzar huevo: coordenada lanzamiento, con o sin puntos y guardado en el array
* mostrar matriz: dibujar la matriz con los carros y los huevos lanzados y sus puntos.
*calcular puntaje: solo visible en su clase, utilizado por otros métodos.

La idea que nos quitó mayor cantidad de tiempo es la creación de la matriz y dibujar de manera
aleatoria y correcta en la matriz, para poder emular el juego de "Combate Naval".