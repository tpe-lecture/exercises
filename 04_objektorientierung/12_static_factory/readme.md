# Aufgabe: Statische Factory

## Lernziel

Eine Factory-Klasse schreiben und zur Erzeugung von Objekten verwenden. Implementierungsklassen hinter der Factory verbergen.

## Umgebung

  * Eclipse


## Aufgabe

Lassen Sie das Programm laufen und schauen Sie sich den vorhandenen Quelltext an. Im Paket `figuren` finden sich die Klassen für die verschiedenen Charaktere, die durch da Bild laufen können. Diese werden von der Klasse `GameBoard` im Konstruktor erzeugt.

Das unschöne an dieser Lösung ist, dass man beim Hinzufügen einer neuen Figur auch die Klasse `GameBoard` ändern muss. Dieses Problem sollen Sie durch das Schreiben einer statischen Factory-Klasse lösen.

  * Schreiben Sie eine Klasse `FigurFactory` im Paket `figuren`. Diese hat eine Methode `createFigur`, die Figuren erzeugt (Rückgabetyp `Figur`). Die Auswahl, welche Figur geliefert wird, erfolgt per Zufall.
  * Geben Sie den Klassen `Lady`, `Ninja` und `Wizard` Paketsichtbarkeit, sodass man von außerhalb des Paketes nicht mehr auf sie zugreifen kann.
  * Schreiben Sie die Klasse `GameBoard` so um, dass sie nur noch die Factory benutzt und nicht mehr direkt `Lady`, `Ninja` und `Wizard`.
  * Testen Sie, ob Ihr Programm genauso funktioniert wie vorher.


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.
