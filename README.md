# Corso di Programmazione 2

## Laboratorio 8 : Temperature con MVP

Creare un programma Java che permetta di gestire la temperatura di attivazione di un termostato. La possibilità di
leggere o impostare la temperatura può avvenire tramite diverse *viste*, in particolare la temperatura viene visualizzata
sia in gradi Celsius che Fahrenheit; l'utente può impostare la temperatura in entrambe le scale, tutte le viste devono
essere coordinate sulla temperatura di attivazione mostrata all'utente.


### Requisiti informali

Il progetto deve tener conto dei seguenti requisiti:

* Le viste ci permettono di leggere e di impostare la temperatura usando diverse scale (unità di misura). Sono richieste 2 viste:
   (1) un [TextField](https://openjfx.io/javadoc/13/javafx.controls/javafx/scene/control/TextField.html) in gradi Celsius, (2) un [TextField](https://openjfx.io/javadoc/13/javafx.controls/javafx/scene/control/TextField.html) in gradi Fahrenheit.

* Una componente aderente alla interfaccia `Model` si occupa di mantenere il dato *temperatura*
  tramite un `double` che rappresenta la misura in gradi Celsius. È unica e
  comune a tutte le viste. Il `Model` a fronte di un cambiamento della
  temperatura, deve occuparsi di *notificare* tutti i `Presenter` a lui registrati.
  Internamente mantiene le temperature secondo la scala Celsius. Il `Model` deve essere capace di gestire sia una comunicazione con approccio *pull* che *push*.

* Una componente aderente alla interfaccia `Presenter` sta nel mezzo tra `View` e `Model` ed
   interpreta l’input dell’utente (l’inserimento di un valore nel `TextField`).
   Un'istanza di `Presenter` (una per ogni vista) a fronte dell'interazione
   dell'utente deve aggiornare il `Model` con la nuova temperatura appena
   immessa.
   Inoltre deve essere in grado di *osservare* un cambiamento di temperatura nel 
   termostato in modo da aggiornare valore mostrato all'utente dalla vista a lui collegata.

* Per quanto riguarda i `Presenter` è possibile ipotizzare due possibili approcci:
  1. Fare una classe unica (`TemperatureModel`) parametrica rispetto a una strategia di conversione temperature. In questo caso vi chiediamo di realizzare le due startegie CelsiusScale e FahreneitScale come `Singleton`.
  2. Fare due classi distinte (`CelsiusPresenter` e `FahrenheitPresenter`). In questo caso vi chiediamo di usare due approcci diversi per la comunicazione (*pull* e *push* rispettivamente) con il `Model`.

Sono già fornite come codice:
 * le interfacce `Model`, `Presenter`, `View`, `Observable` e `Observer`.
 * la classe `MyTextView` (completa).
 * la classe `Main` parzialmente da completare.
 * le classi di test per `TemperatureModel`, per `TemperaturePresenter` (nel modulo `test`) e per il sistema una volta completato (nel modulo `integrationTest`).
