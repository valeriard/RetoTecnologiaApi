#Author: Valeria Rivera
  #language: es

  Característica: Obtener por el metodo get todos los empleados
    Esquema del escenario: Validar el mensaje de successfully All records has been fetched cuando lista los datos de todos los empleados
      Dado que se desea validar el mensaje successfully
      Cuando se consume el endpoint de listar los empleados
      Entonces se debe recibir el mensaje de successfully
      |mensaje  |
      |<mensaje>|
      Ejemplos:
        | mensaje |
        |Successfully! All records has been fetched.|
