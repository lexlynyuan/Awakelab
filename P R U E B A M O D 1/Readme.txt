Fecha: 26-02-20

Grupo: 
Lexlyn Yuan
Carlos Contreras
Felipe Riquelme

Contextualizaci�n del problema:

En el ejercicio planteado, dado que las tres tipos de veh�culos (Kromis, Caguanos y Trupallas)
tienen un largo u ancho determinado, y existen dentro de una clase ejecutable tablero de 
dimensiones conocidas (15x15), la din�mica de este ejercicio es crear una soluci�n a una
din�mica del tipo "Combate Naval". 
Es importante Notar que el ejercicio distingue directamente las clases y m�todos, sin embargo
existen diferentes formas de abordar la soluci�n de este ejercicio, tomando nosotros la que 
pensamos es m�s atingente a la soluci�n y que aplica lo que hemos aprendido mediante las
pr�cticas en clases.



Soluci�n del Problema:

Abordamos la soluci�n creando cada una de las clases mencionadas de veh�culos, todos con sus
dimensiones (largo y ancho) y su posici�n como base.

Superclase Carro: 'cantidad de ocupantes', 'fecha de ingreso a la institucion' y 'posici�n'

heredan de Superclase Carro:
Clase Kromi: con sus atributos adicionales 'a�o de fabricacion' y 'Marca'
Clase Caguano: con atributos adicionales 'alcance de tiro' y 'color confeti'
Clase Trupalla: con atributo adicional 'nivel de armadura', 'quien conduce'
Clase Show'

Clase Huevo: que realiza los tiros. Se apoya en m�todo de BuscaLetra.

Clase Tablero (main): 
instancias de las hijas de clase carro (m�ximo 18 objetos) e instancias clase huevo (sin limite).
Esta Clase adem�s tiene los m�todos que pueden ser elegidos con un JOption desplegado que permite
la elecci�n de una alternativa inputada por el usuario.

Los m�todos
*Crear Carro: coloca los 18 objetos de manera random en el tablero.
* lanzar huevo: coordenada lanzamiento, con o sin puntos y guardado en el array
* mostrar matriz: dibujar la matriz con los carros y los huevos lanzados y sus puntos.
*calcular puntaje: solo visible en su clase, utilizado por otros m�todos.

La idea que nos quit� mayor cantidad de tiempo es la creaci�n de la matriz y dibujar de manera
aleatoria y correcta en la matriz, para poder emular el juego de "Combate Naval".