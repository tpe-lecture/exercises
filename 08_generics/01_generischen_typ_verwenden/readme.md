# Aufgabe: Generischen Typ verwenden

## Lernziel

Einen vorgegebenen generischen Typ einsetzen, um typsicher eine Menge von Objekten zu verwalten.


## Umgebung

  * Eclipse


## Aufgabe

In dieser Aufgabe werden Sie ein einfaches Spiel implementieren, mit bei dem man einen Stapel Münzen möglichst schnell abräumen muss. Man nimmt eine Münze, indem man auf sie klickt. Jede Münze gibt dieselbe Anzahl von Punkten. Es geht also eher um das schnelle Klicken.

Die Münzen liegen als Stapel (_Stack_) vor, d.h. man kann immer nur die oberste Münze herunternehmen. Um dies in dem Spiel zu realisieren, sollen Sie den vorgefertigten, generischen Datentyp `Stack` verwenden, den Sie im Paket `java.util` finden.

Bei dieser Aufgabe sollen Sie _nicht_ die Klasse `GameBoard` generisch machen, sondern innerhalb der Klasse den `Stack` als generischen Typ verwenden.

Öffnen Sie die Klasse `GameBoard` und orientieren Sie sich bei Ihren Änderungen an den  `TODO`-Kommentaren.


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.
