Excepciones
---

**Objetivo**

Aplicar los conocimientos de manejo de Excepciones, en un caso práctico.

**Ejercicio:**

En un comercio donde los clientes poseen cuenta corriente, en el sistema se tiene diseñada
una clase Cliente, los clientes tienen nombre, apellido y DNI, además un saldo (es la deuda
que tienen con el comercio, es un saldo deudor) y un límite. Inicialmente se hace un estudio
de la capacidad financiera del cliente y se establece este límite.

Debemos crear Excepciones para utilizar con esta clase, el nombre de la clase que se nos
solicita es ClienteException.

La clase debe generar Excepciones, cuando el cliente intenta comprar y el saldo supere su
límite establecido o cuando intente pagar y no tenga deuda.

| Cliente                               |
|---------------------------------------|
| - nombre: String                      | 
| - apellido: String                    | 
| - DNI: String                         |
| - saldoEnCuenta: double               | 
| - limite: double                      |
| - deuda : Double                      | 
|---------------------------------------|
| + Cliente( String nombre,             |
| String apellido, String               |
| DNI,limite:double)                    |
| + comprar(double importe): void       |
| + saldarDeuda(double importe): void   |
|                                       |
|---------------------------------------|

**Realizado por :** Sammy Gigi Cantoral Montejo (sgcm14)

<img src ="https://raw.githubusercontent.com/sgcm14/sgcm14/main/sammy.jpg" width="200">