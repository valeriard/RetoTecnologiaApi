#Author: Valeria Rivera
  #language: es

  Característica: A través del método PUT se actualiza la información
    Esquema del escenario: Actualizar informacion de usuario
      Dado que se quiere actualizar la informacion
      Cuando cuando se consuma el servicio de actualizar la informacion de usuario con id
      |name  |job  |
      |<name>|<job>|
      Entonces se verifica que la informacion de nombre sea igual a "morpheus"

      Ejemplos:
        | name | job |
        |morpheus|zion resident|





