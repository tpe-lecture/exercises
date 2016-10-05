# Aufgabe: Konstruktoren schreiben

## Lernziel

Für eine vorhandene Klasse Konstruktoren schreiben und Konstruktoren sich gegenseitig und auch Konstruktoren der Superklasse aufrufen lassen.


## Umgebung

  * Eclipse


## Aufgabe

Sie sollen Klassen entwickeln, welche Charaktere in einem Spiel repräsentieren. Es gibt in dem Spiel zwei Rassen:

  * die _Nachtelfen_ mit der Spezialfähigkeit _Naturwiderstand_ und
  * die _Untoten_ mit der Spezialfähigkeit _Unterwasseratmung_.

Ausgehend von der Klasse `Figur` sollen die beiden Rassen durch zwei Klassen `Untoter` und `Nachtelf` repräsentiert werden. Diese Klassen sind auch bereits vorhanden, allerdings fehlen die Konstruktoren und die Vererbung ist noch nicht deklariert.

Leiten Sie die beiden Klassen also von `Figur` ab und schreiben Sie entsprechende Konstruktoren. Beide Klassen sollen zwei Konstruktoren haben:

  * bei einem kann man den Namen und die Stärke der Spezialfähigkeit mitgeben,
  * beim anderen nur den Namen; die Spezialfähigkeit soll dann dem Standardwert entsprechen.


### Test

Testen Sie die Funktionsweise Ihrer Konstruktoren mit dem vorgegebenen JUnit-Test. Entfernen Sie die Kommentare, um die entsprechenden Tests zu aktivieren und importieren Sie die noch fehlenden Klassen und Methoden.


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.

