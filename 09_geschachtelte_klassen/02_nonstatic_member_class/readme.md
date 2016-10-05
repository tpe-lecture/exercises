# Aufgabe: Nonstatic Member Class

## Lernziel

Eine nichtstatische Elementklasse verwenden.


## Umgebung

  * Eclipse


## Aufgabe

Wieder geht es um das einfache Spiel aus der ersten Aufgabe. Diesmal sollen Sie allerdings die Klasse `Alien` zu einer nichtstatischen Elementklasse von `GameBoard` machen. Achten Sie insbesondere darauf, dass sie nur noch die implizite Referenz `GameBoard.this` verwenden, um das Board innerhalb von `Alien` zu verwenden. Außerdem soll sich `Alien` im Konstruktor selbst als `MouseListener` registrieren, d.h. die entsprechende Zeile `addMouseListener(alien);` soll aus `GameBoard` verschwinden und in `Alien` verwendet werden.

Lassen Sie das Spiel wieder laufen und überprüfen Sie, ob es korrekt funktioniert.


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.
