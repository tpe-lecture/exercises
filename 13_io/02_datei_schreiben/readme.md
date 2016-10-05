# Aufgabe: Daten mit einem `OutputStream` schreiben

## Lernziel

Einen `OutputStream` verwenden, um Daten zu schreiben.


## Umgebung

  * Eclipse


## Aufgabe

In dieser Aufgabe sollen Sie eine Reihe von Bytes in eine Datei schreiben. Ein JUnit-Test wird überprüfen, ob Sie dies richtig getan haben.

Öffnen Sie einen passenden `OutputStream`, um in die Datei `output/daten.dat` zu schreiben (verwenden Sie die Konstante `FILE` für den Dateinamen). Schreiben Sie nun die Byte-Folge

    0xca 0xff 0xfe 0xba 0xbe 0x0 0xde 0xad 0xbe 0xef 

hinein und schließen Sie die Datei wieder.

Führen Sie den JUnit-Test aus, der überprüft, ob alle Daten korrekt in die Datei geschrieben wurden.


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.
