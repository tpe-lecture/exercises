# Aufgabe: Generische Typen zusammen mit Wildcards einsetzen

## Lernziel

Gebundene und ungebundene Wildcards einsetzen.


## Umgebung

  * Eclipse


## Aufgabe

In dieser Aufgabe finden Sie bereits eine Implementierung einer generischen, auf Arrays basierenden Liste namens `SimpleList` vor. An dieser müssen Sie nichts verändern, sondern verwenden die Klasse wie sie ist.

Schreiben Sie nun eine _nicht generische_ Klasse `ListHelper`, die zwei statische Methoden enthält:

  * `printList`: Diese Methode bekommt eine beliebige `SimpleList` übergeben und druckt deren Inhalt einfach auf der Konsole aus. Deswegen hat die Methode auch den Rückgabetyp `void`.
  * `sumList`: Diese Methode nimmt als Parameter `SimpleList`-Objekte, die irgendeine Form von Zahlen enthalten (`Number` oder Subklassen davon) und berechnet deren Summe. Das Ergebnis wird als `double`-Wert zurückgegeben.

Verwenden Sie für die Methoden gebundene bzw. ungebundene Wildcards.

Kommentieren Sie die entsprechenden Zeilen in der Klasse `Main` aus und sehen überprüfen Sie, ob Ihre Implementierungen auch wie gewünscht funktionieren. Die Ausgabe sollte sein:

    Dies
    ist
    ein
    Test
    .
    1
    2
    3
    4
    5
    15.0


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.
