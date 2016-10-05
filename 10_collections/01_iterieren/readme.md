# Aufgabe: Mit Hilfe eines Iterators über Daten iterieren

## Lernziel

Den Iterator einer vorhandenen Klasse verwenden, um Daten auszulesen.


## Umgebung

  * Eclipse


## Aufgabe

Bei dieser Aufgabe werden Sie mit einem `Iterator` über eine Menge von Objekten iterieren. Die Besonderheit besteht darin, dass der Iterator keine feste Menge von Objekten liefert, sondern diese zufällig generiert. Dies ist zwar ungewöhnlich, soll aber zeigen, dass beim Iterieren nicht zwangsläufig bei jedem Durchlauf dieselben Daten kommen.

Betrachten Sie die Klasse `CoinGenerator` und versuchen Sie deren Funktionsweise zu verstehen. Schauen Sie sich insbesondere an, wie der Iterator in dieser Klasse implementiert ist.

Modifizieren Sie nun die Klasse `GameBoard` so, dass sie den `CoinGenerator` verwendet, um Münzen zu erzeugen und diese dann auf dem Bildschirm anzuzeigen. Überlegen Sie sich, ob Sie die erzeugten Münzen zwischenspeichern müssen oder ob Sie den Iterator direkt in der `drawGame`-Methode verwenden können.

Implementieren Sie Ihre Lösung und lassen Sie diese laufen, um sie zu testen.


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.
