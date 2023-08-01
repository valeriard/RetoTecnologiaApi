#Author: Valeria Rivera
  #language: es

  Característica: Usando el metodo Delete se quiere borrar un registro
    Esquema del escenario:  eliminar un registro
      Dado que se quiere eliminar un registro en regres
      Cuando se consuma el endpoint delete un usario
      |id|
      |<id>|
      Entonces se valida que la respuesta sea un doscientos cuatro
      Ejemplos:
        | id |
        |8   |


