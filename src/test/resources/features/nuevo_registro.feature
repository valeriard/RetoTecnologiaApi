#Author: Valeria Rivera
  #language: es

  Característica: Con el metodo POST  agregar nuevos registros a la base de datos
    Esquema del escenario: Creacion de un nuevo registro
      Dado que se desea crear un nuevo registro
      Cuando se consuma el endpoint de crear registro nuevo
         | name |job|
         |<name> |<job>|
      Entonces se puede ver el nuevo usuario
      Ejemplos:
        | name   |job |
        |Valeria |leader|