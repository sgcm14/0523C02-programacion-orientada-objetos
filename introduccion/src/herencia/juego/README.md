Ejercitación de herencia
---
**Objetivo**

Aplicar los conocimientos de herencia en un caso práctico.



**Ejercicio:**

En un juego de naves Arcade, se necesita implementar la lógica de los elementos del juego:
nave, nave enemiga, asteroide. Todos son objetos gráficos que ocupan una posición en el
espacio (x, y) y al moverse ocupan una nueva ubicación. Las naves tienen una velocidad y una
dirección, si esta última no coincide con el movimiento pedido, primero deberá hacer un giro
y luego ir a la posición. La dirección puede ser ‘N’, ‘S’,’O’,’E’, (sur, norte, este u oeste). Los
asteroides pueden ir a cualquier posición sin importar su dirección actual.

El problema planteado es solo resolver el movimiento, no es necesario resolver otra
operación. Aunque sí para utilizar en un futuro es necesario sobreescribir el toString, hashCode y equals, tanto en nave como en asteroide. Se diseñaron las siguientes clases.
Cómo sería su implementación en Java:

![](https://raw.githubusercontent.com/sgcm14/0523C02-proyectos-java/main/introduccion/src/herencia/juego/Captura.PNG)


**Realizado por :** Sammy Gigi Cantoral Montejo (sgcm14)

<img src ="https://raw.githubusercontent.com/sgcm14/sgcm14/main/sammy.jpg" width="200">