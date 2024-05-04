Patrón State:
---

**Auto:**

Tenemos un auto que puede sencillamente tener varios estados.

Puede estar:

- Apagado: sin la llave de contacto y el motor detenido.
- Parado: el motor en marcha, pero sin moverse.
- EnMarcha: avanzando en el camino.
- SinNafta: se le terminó el combustible.
El auto deberá tener atributos para conocer su velocidad y la cantidad de combustible que tiene cargado.

Las responsabilidades podrán ser:

- Acelerar: incrementa la velocidad y consume nafta.
- Contacto: sirve para encender el auto.
- Frenar: le permite detenerse.
Las transiciones de estado se encuentran cuando por ejemplo:

![](https://raw.githubusercontent.com/sgcm14/0523C02-proyectos-java/main/introduccion/src/disenio_state/auto/state.png)

¿Y ahora?

Vamos a realizar el diagrama de clases y el código Java necesario para representar el
modelo enunciado.
![](https://raw.githubusercontent.com/sgcm14/0523C02-proyectos-java/main/introduccion/src/disenio_state/auto/state_uml.png)

**Realizado por :** Sammy Gigi Cantoral Montejo (sgcm14)

<img src ="https://raw.githubusercontent.com/sgcm14/sgcm14/main/sammy.jpg" width="200">