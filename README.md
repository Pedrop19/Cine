## Cine

1. El método pagar() devuelve 5 en el caso de una Persona, 4 en el caso de un Jubilado y 
2 en el caso de un Joven.

2. En la clase Sala: 

    - El atributo ocupadas representa la cantidad de personas que hay en la sala y 
que al inicializarla tiene como valor 0 (por eso no aparece en el constructor 
como parámetro). 

    - El atributo recaudación también parte de 0 (y tampoco se necesita en el 
constructor). 

    - El método asignarAsiento(Persona p) busca el primer asiento que no tiene 
persona asignada (es decir, que está a null) y asigna a la persona recibida por 
parámetro p a ese asiento. Para que quede constancia, se saca un mensaje por 
pantalla indicando dicha acción. Además, incrementa el atributo ocupadas en 
1 unidad e incrementa la recaudación reclamando el pago a la persona 

    - El método vaciarSala() pone todos los asientos a null y establece de nuevo a 0 
el valor del atributo ocupadas 

3. Crear distintas personas (diferentes tipos en el ppal) y al menos dos salas para probar 
el correcto funcionamiento del programa 
