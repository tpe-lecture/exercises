# Aufgabe: Einen Thread mit `Runnable` erzeugen

## Lernziel

Einen Thread programmieren und starten.


## Umgebung

  * Eclipse


## Aufgabe

Bei dieser Aufgabe werden Sie mehrere Ufos mit Hilfe von Threads über den Bildschirm bewegen. Anders als bisher üblich, überlassen wir das Bewegen der Objekte nicht dem Game-Framework, sondern programmieren diese selbst mit Hilfe von Threads.

Betrachten Sie das vorhandene Projekt. Dort finden Sie die Klasse `Ufo`, die ein unbekanntes Flugobjekt repräsentiert, dass über den Bildschirm fliegen soll. Starten Sie das Programm. Sie werden feststellen, dass sich die Ufos nicht bewegen. Dies liegt daran, dass noch die Logik für die Bewegung fehlt, die Sie mit Hilfe von Threads programmieren sollen.

Implementieren Sie daher mit der Klasse `Ufo` das Interface `Runnable` und führen Sie in der `run`-Methode folgende Operationen durch:

  1. x-Position des Ufos um eins erhöhen
  2. für `sleepTime` Millisekunden schlafen
  3. die Vorgänge 1-2 wiederholen, solange sich das Ufo innerhalb des Spielfeldes befinden, d.h. die x-Position kleiner als die Breite des Spielfelds ist

Nachdem Sie diese Änderungen vorgenommen haben, müssen Sie noch in `GameBoard` die auskommentierten Zeilen einkommentieren, welche für das Starten der Threads zuständig sind. (Siehe die entsprechenden TODO-Kommentare, im Quelltext).


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.
