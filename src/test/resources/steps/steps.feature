@test
Feature: Buscando en el navegador


@google
  Scenario: Buscar la palabra Luis en el navegador de Chorme
    Given Inicio el navegador Chrome
    When Escribo la palabra Luis en la barra del buscador
    When Presiono el boton buscar
    Then Busquedad Exitosa
    
 @youtube   
  Scenario: Buscar la palabra Jose en youtube
    Given Inicio el navegador en la pagina de youtube
    When Escribo la palabra Jose en el youtube
    When Presiono el boton para buscar
    Then Busquedad Correcta
    

