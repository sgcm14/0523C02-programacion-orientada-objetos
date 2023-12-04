Patrón Composite:
---

**Simulacro de Examen Final:**

**Objetivo**

Realizar el diagrama **UML y programar en Java** (implementando los patrones que se requieran) el siguiente enunciado:

**Desafío I**

Un instituto necesita desarrollar un sistema para el área comercial y académica que le permita armar ofertas académicas, es decir, armar paquetes con los cursos que se dictan en la institución para constituir programas intensivos. Estos cursos están diseñados a su vez para poder dictarse y ofrecerse en forma independiente sin necesidad de cursar un programa intensivo. Es decir, que tanto un curso como un programa son ofertas académicas que el área comercial podrá ofrecer.

Toda oferta académica es decir cursos y programas tienen un nombre, una descripción y deberán tener una **funcionalidad** que le permita al área comercial poder contar con un **precio** para cada una de estas ofertas con la siguiente lógica:

El **precio de un curso** se calcula de acuerdo a la cantidad de carga horaria mensual de ese curso por la 	 cantidad de meses de duración y un valor hora que se establece por cada Curso.

El **precio de un programa intensivo** es la sumatoria de los precios de todos los cursos que forman el programa y se bonifica un determinado porcentaje dependiendo del programa.

El instituto deberá poder **generar un informe** que permita mostrar todos los cursos y programas que ofrece indicando el nombre y precio de cada uno (no es necesario mostrar los cursos que tiene un programa intensivo).

Reproducir la siguiente situación en una clase Test que contenga el método main e invocar al método que genera el informe.

Curso: **Front End** tiene una carga horaria de 16 horas mensuales de dos meses de duración con un precio de 1000 pesos la hora, es decir que tiene un precio de **32.000 pesos**.

Curso: **Back End** tiene una carga horaria de 20 horas mensuales de dos meses de duración con un precio de 900 pesos la hora, es decir que tiene un precio de **36.000 pesos**.

El programa intensivo **FullStack** que posee ambas materias y cuyo porcentaje de bonificación es de 20% tiene un precio final de **54.400 pesos**.


**Desafío II (Para mesas)**

El Instituto ha decidido sumar a su oferta académica **talleres** intensivos. Cada taller cuenta con un determinado número de **trabajos prácticos** y un **costo por TP**.

El **costo total** del taller dependerá de la cantidad de TP que posea.

Además, se incorporan **carreras**. Las carreras tienen un **costo básico** y se componen de **cursos y talleres**. Para poder formar parte de una carrera, los cursos deben contar con una carga horaria mensual mayor a 10 horas. El **costo total** de una carrera se compone de su básico más el valor de cada curso y/o taller que la componen.

Crear talleres que se sumen a la oferta académica del instituto y una carrera que consista en dos cursos y un taller.

¡Muchos éxitos!


**Realizado por :** Sammy Gigi Cantoral Montejo (sgcm14)

<img src ="https://raw.githubusercontent.com/sgcm14/sgcm14/main/sammy.jpg" width="200">