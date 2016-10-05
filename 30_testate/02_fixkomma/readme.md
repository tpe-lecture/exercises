# Live-Testat vom 16.6.2016

## Umgebung

  * Eclipse


## Aufgabe

Im Bereich finanzmathematischer Berechnungen setzt man normalerweise keine Fließkommazahlen ein, da diese durch Rundungsfehler zu ungenauen Ergebnissen führen.

Aus diesem Grund sollen Sie eine Klasse `Festkommazahl` implementieren, mit deren Hilfe man finanzmathematische Berechnungen exakt und ohne Rundungsfehler durchführen kann.

Obwohl nach außen immer nur zwei Nachkommastellen ausgegeben werden, rechnet die Klasse intern mit vier Nachkommastellen. Hierdurch werden Rundungsfehler, auch bei umfangreichen Berechnungen, weitgehend vermieden.

Die Klasse hat folgende Eigenschaften:

  * Die Objekte der Klasse sind *unveränderlich (immutable)*, d.h. die Daten eines Objekts können nach der Erzeugung nicht mehr verändert werden.
  * Beim Erzeugen neuer Objekte gibt der Benutzer den Wert der Stellen vor und nach dem Komma getrennt als `long`-Wert an. D.h. der Konstruktoraufruf `new Festkommazahl(11, 33)` erzeugt die Zahl `11,33`, der Aufruf `new Festkommazahl(11, 3)` die Zahl `11,03`.
  * Die Klasse braucht nur positive Zahlen zu verwalten.
  * Die Klasse bietet elementare arithmetische Operationen an, die weiter unten beschrieben werden.

Der Zahlenwert soll innerhalb der Klasse in einem einzigen `long`-Wert gespeichert werden. Bei der Genauigkeit von 4 würde die Zahl `19,37` intern als `193700L` dargestellt.

Implementieren Sie bitte die folgenden Methoden in der Klasse `Festkommazahl`:

  * Anlegen einer neuen Zahl und befüllen mit entsprechenden Werten. Die Zahl kann nur in der oben beschriebenen Form, getrennt nach Vor- und Nachkommastellen angegeben werden.
  * Addieren zweier Festkommazahlen (`addiere`)
  * Subtrahieren zweier Festkommazahlen (`subtrahiere`)
  * Auslesen des Wertes vor dem Komma (`getVorkomma`)
  * Auslesen des Wertes nach dem Komma. Hier können nur Zahlen zwischen 0 und 99 zurück gegeben werden, die internen, weiteren Nachkommastellen werden nicht ausgegeben. (`getNachkomma`)
  * Auslesen des gesamten Wertes als String mit führender Null bei Werten kleiner als 1. Z.B. `0,99`, `12,90`, `11,00`, `0,09` oder `0,00`. (`toString`)
  * Vergleich zweier Zahlen auf Gleichheit, wobei zwei Zahlen nur gleich sind, wenn alle Stellen übereinstimmen (`equals`).

Überprüfen Sie die Funktionalität Ihrer Implementierung mit den entsprechenden JUnit-Tests und weisen Sie mit diesen Tests nach, dass die implementierten Operationen richtig funktionieren.


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.
