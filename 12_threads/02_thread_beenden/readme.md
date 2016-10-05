# Aufgabe: Threads mit `Thread.interrupt()` beenden

## Lernziel

Mehrere Threads starten und dann zu einem bestimmten Zeitpunkt mit `Thread.interrupt)` wieder sauber beenden.


## Umgebung

  * Eclipse


## Aufgabe

Diese Aufgabe baut auf die vorhergehende Aufgabe aus, d.h. Sie können Teile der Lösung der vorhergehenden Aufgabe wiederverwenden. Falls Sie diese noch nicht bearbeitet haben, können Sie diese Aufgabe auch eigenständig lösen.

Bei dieser Aufgabe werden Sie Ufos mit Hilfe von Threads über den Bildschirm bewegen. Anders als bisher üblich, überlassen wir das Bewegen der Objekte nicht dem Game-Framework, sondern programmieren diese selbst mit Hilfe von Threads.

Betrachten Sie das vorhandene Projekt. Dort finden Sie die Klasse `Ufo`, die ein unbekanntes Flugobjekt repräsentiert, dass über den Bildschirm fliegen soll. Starten Sie das Programm. Sie werden feststellen, dass sich die Ufos nicht bewegen. Dies liegt daran, dass noch die Logik für die Bewegung fehlt, die Sie mit Hilfe von Threads programmieren sollen.

Implementieren Sie daher mit der Klasse `Ufo` das Interface `Runnable` und führen Sie in der `run`-Methode folgende Operationen durch:

  1. x-Position des Ufos um eins erhöhen
  2. für `sleepTime` Millisekunden schlafen
  3. die Vorgänge 1-2 wiederholen, solange sich das Ufo innerhalb des Spielfeldes befinden, d.h. die x-Position kleiner als die breite des Spielfelds ist

Nachdem Sie diese Änderungen vorgenommen haben, müssen Sie noch in `GameBoard` die auskommentierten Zeilen einkommentieren, welche für das Starten der Threads zuständig sind. (Siehe die entsprechenden TODO-Kommentare, im Quelltext).

Jetzt müssen Sie noch auf das Drücken des roten Knopfs reagieren: Wird dieser gedrückt sollen die Threads, welche die Ufos bewegen, sauber beendet werden. Verwenden Sie hierzu den in der Vorlesung verwendeten Mechanismus über `interrupt()` und `isInterrupted()`. Damit dieses Ziel erreicht wird, müssen Sie auch noch eine Änderung in der Klasse `Ufo` vornehmen.

Bevor die `run`-Methode des Ufos endgültig zurückkehrt, soll sie noch den Selbstzerstörungsmechanismus auslösen. Dieser wird gestartet, wenn Sie die `explode()`-Methode von `Ufo` aufrufen.


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.
