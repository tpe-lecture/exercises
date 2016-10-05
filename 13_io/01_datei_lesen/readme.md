# Aufgabe: Daten mit einem `InputStream` lesen

## Lernziel

Einen `InputStream` benutzen, um Daten aus einer Datei zu lesen.


## Umgebung

  * Eclipse


## Aufgabe

Lesen Sie die Daten aus der Datei `assets/daten.dat` byteweise und geben Sie den Inhalt auf der Konsole aus. Für die Ausgabe verwenden Sie bitte die Hexadezimale Darstellung, also z.B. `0x0a` für den Wert 11.

Lassen Sie das Programm laufen und betrachten Sie die Ausgabe. Wenn Sie alles korrekt implementiert haben, sollten Sie den Text

    0xca 0xff 0xfe 0xba 0xbe 0x0 0xde 0xad 0xbe 0xef

sehen.

Denken Sie auch an eine Fehlerbehandlung für eventuelle Ausnahmen im Zusammenhang mit der Datei.


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.
