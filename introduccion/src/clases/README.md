Definiendo mascotas
---

**Ejercicio:**

El granjero tiene un caballo Blanco que usa para tirar de un carro, hace dos años que lo
tiene y espera que lo ayude en su trabajo diario. El caballo Braulio (así es su nombre) come
más de lo que produce: 1250.40 pesos semanales. Pero a pesar de eso, lo conservará
porque la raza de caballos criollos es muy noble.
¿Te parece que podrás hacer las variables que sirvan para que guardes la información que
tenemos de Braulio?
Utiliza el IDE para ello y también mostrá un texto que muestre las características.

---

Para representar cada una de las características de las mascotas, crear una variable y darle
el valor correspondiente en el IDE IntelliJ. No olvidar darle el tipo adecuado a lo que
queremos que contenga. Por cada mascota de la veterinaria que figura en la siguiente
tabla, vamos a tener que mostrar la información del animal. La información va a mostrarse
como el siguiente ejemplo:

“Manchitas tiene 2 años”

“Manchitas come un kilo y medio y hace guau guau”

---

Para desarrollar un juego necesitamos implementar la clase UsuarioJuego. Los usuarios
tienen nombre y clave, estos datos se deben suministrar cuando se crea un nuevo usuario.
Inicialmente tienen puntaje y nivel en cero. Sin embargo, pueden aumentar tanto el puntaje
como el nivel en 1, debemos suministrar un método para poder hacerlo. El usuario también
puede recibir un bonus, esto quiere decir que recibe un valor extra que se suma a su puntaje.


    UsuarioJuego
    - nombre: String
    - clave: String
    - puntaje: Integer
    - nivel: Integer
    + UsuarioJuego(nombre: String, clave:
      String)
    + aumentarPuntaje() : void
    + subirNivel() : void
    + bonus(valor: Integer) : Void

Crear la clase del diagrama en Java. Al finalizar, crear un objeto y probar el
funcionamiento de los métodos.

---

En general, podemos encontrarnos con clases que representan a un ente de la realidad, del
contexto, si nos enfocamos en el mundo empresarial seguramente nos encontraremos con
clientes y para resolver ciertos problemas necesitamos codificar la clase Cliente.
Un cliente tiene un número de cliente, un nombre y una deuda. Para crear un cliente, tengo
que tener su número de cliente y su nombre. Un cliente puede incrementar su deuda o pagar
el total de su deuda.

Actividad: Programar la clase Cliente teniendo en cuenta el siguiente UML.

    Cliente
      - numeroCliente: Integer
      - nombre: String
      - deuda: Double
      + Cliente(numero: Integer, nombre: String)
      + incrementarDeuda(valor: Double): void
      + pagarDeuda(): void

**Realizado por :** Sammy Gigi Cantoral Montejo (sgcm14)

<img src ="https://raw.githubusercontent.com/sgcm14/sgcm14/main/sammy.jpg" width="200">
