# Aufgabe: `RandomAccessFile`

## Lernziel

`RandomAccessFile` sowohl zum Lesen, als auch zum Schreiben von Daten einsetzen. Verstehen, dass man sich wahlfrei durch die Datei bewegen kann.


## Umgebung

  * Eclipse


## Aufgabe

Bei dieser Aufgabe werden Sie ein Verfahren anwenden, das bei sehr großen Datenmengen zum Einsatz kommt: das Sortieren der Daten direkt auf der Festplatte, ohne sie vollständig in den Hauptspeicher zu laden.

Implementieren Sie einen [Bubblesort](https://de.wikipedia.org/wiki/Bubblesort) mit Hilfe von `RandomAccessFile` direkt auf einer Datei. Bubblesort ist ein ausgesprochen ineffizienter Algorithmus (O(n*n)), er ist aber sehr einfach zu implementieren. Da die zu sortierende Datei klein ist, können wir hier mit den Nachteilen von Bubblesort leben.

Implementieren Sie die bereits vorhandene Methode `sortFile` der Klasse `FileSort`. Öffnen Sie zuerst die Datei mit Hilfe von `RandomAccessFile` im Modus `"rw"`. Wandern Sie nun - entsprechend dem Bubblesort-Algorithmus - über die Daten und sortieren Sie die Bytes der Datei. Halten Sie nie mehr als zwei `byte` und die Position als `long` im Speicher. Weitere Variablen können auch noch nötig sein, um den Algorithmus zu implementieren.

Testen Sie Ihre Implementierung mit den JUnit-Tests.


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.
