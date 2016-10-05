# Aufgabe: Polymorphie einsetzen

## Lernziel

Durch Polymorphie Subklassen wie Basisklassen behandeln können.


## Umgebung

  * Eclipse


## Aufgabe

In dieser Aufgabe geht es darum, einen Zoo zu simulieren. In dem Zoo gibt es _Affen_, _Gorillas_ und _Giraffen_. Die Tiere sind oft hungrig und müssen deshalb gefüttert werden. Hierzu dient die Klasse `Futterstelle`, die für die verschiedenen Tierarten entsprechende Fütterungsmethoden hat.


### UML-Diagramm

Sehen Sie sich die Klassen für die verschiedenen Tiere, die `Futterstelle` und `ZooSimulation` genau an und zeichnen Sie danach ein UML-Diagramm der Klassen und ihrer Beziehungen.


### Futterstelle

Schreiben Sie die Klasse `Futterstelle` so um, dass sie Polymorphie nutzt, um alle Tiere mit nur einer einzigen Methode zu füttern.

Schreiben Sie danach die Klasse `ZooSimulation` so um, dass Sie anstatt von drei Variablen `charlie`, `buck` und `debbie` ein einziges Array `tiere` verwendet.


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.
