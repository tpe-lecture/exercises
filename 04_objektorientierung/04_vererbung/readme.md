# Aufgabe: Vererbung von Figuren

## Lernziel

Einfache Klassen schreiben und eine Vererbungshierarchie bilden.


## Umgebung

  * Eclipse


## Aufgabe

Denken Sie bei den folgenden Aufgaben daran, Pakete zu verwenden.


### Figur und Rechteck

Schreiben Sie ein Klasse `Figur`, die als einziges Attribut die Fläche der Figur hat. Bieten Sie weiterhin eine Methode `getFlaeche()` an, mit der die Fläche wieder ausgelesen werden kann. Sorgen Sie dafür, dass nur Subklassen den Konstruktor dieser Klasse aufrufen können. Machen Sie das Attribut `flaeche` private.

Leiten Sie von der Klasse `Figur` eine Klasse `Rechteck` ab. Das Rechteck soll durch Höhe und Breite beschrieben werden und diese Werte sollen benutzt werden, um die Fläche der Figur zu setzen.


### Erweiterung der Figur

Erweitern Sie die Klasse `Figur` so, dass man Objekte ohne Angabe einer Fläche erzeugen kann. Diese Objekte sollen dann die Fläche `0` haben. Die Klasse `Rechteck` soll weiter funktionieren.


### Dreieck

Schreiben Sie eine Klasse `Dreieck`, die von der Klasse `Figur` abgeleitet ist und über Grundseite und Höhe definiert wird.


### Gerade

Schreiben Sie eine Klasse `Gerade`, die von `Figur` abgeleitet ist und als Attribut die Länge der Geraden hat, deren Fläche aber logischerweise `0` ist.


### Quadrat

Schreiben Sie eine Klasse `Quadrat` und leiten Sie diese sinnvoll von den bereits vorhandenen Klassen ab. Überlegen Sie sich, welche Informationen Sie für die Berechnung der Fläche benötigen.


### Tests

Schreiben Sie Unit-Tests, die die von Ihnen entwickelten Klassen testen.


### UML-Diagramm

Zeichnen Sie ein UML-Diagramm von Ihrer Lösung.


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.
