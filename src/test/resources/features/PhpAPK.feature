Feature: El usuario realiza una reserva

  @PHP
  Scenario: Realizar Reserva en PHP Travels
    Given el usuario se encuentra en la home de la app
    When el usuario tapea el icono VISA
    And el usuario completa los datos desde Argentina hasta Spain
    And el usuario completa el campo nombre: Agustín, apellido Molina, email agustin.molina@gmail.com, celular 261123456, notas Nada que agregar
    And el usuario tapea el boton submit
    Then el usuario verifica que se realizo correctamente la reserva