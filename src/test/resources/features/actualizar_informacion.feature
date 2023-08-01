#Author: Valeria Rivera
  #language: es

  Característica: A través del método PUT se actualiza la información
    Esquema del escenario:
      Dado que se quiere actualizar la informacion
      Cuando cuando se consuma el servicio de actualizar la edad al empleado con id
      |id|edad|
      |<id>|<edad>|
      Entonces se valida que la edad se  satisfactoriamente
      |edad_resultado|
      |<edad_resultado>|
      Ejemplos:
       |id | edad | edad_resultado |
       |25 | 29   |         29     |



