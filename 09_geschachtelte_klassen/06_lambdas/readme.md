# Aufgabe: Callback mit Lambda realisieren

## Lernziel

Eine gegebene Funktion durch einen Callback parametrieren. Der Callback wird als Lambda realisiert.


## Umgebung

  * Eclipse


## Aufgabe

In dieser Aufgabe wird ein sehr gängiges Muster benutzt, dass auch bei großen Suchmaschinen zum Einsatz kommt. Über eine Filter-Funktion werden aus einer Menge von Daten diejenigen ausgewählt, die gewünscht sind. Die Auswahlfunktion wird von außen vorgegeben, sodass beliebige Filteroperationen möglich sind, auch solche, die beim Schreiben des Rahmenwerkes noch nicht bekannt waren.

Sehen Sie sich das Interface `Predicate` und die Klasse `NumberSelector` an und versuchen Sie die Funktionsweise der beiden zu verstehen. Betrachten Sie nun die Klasse `Main`, die versucht zuerst die geraden und dann die ungeraden Zahlen auszuwählen und auszugeben. Der hierfür nötige Code ist zwar schon weitgehend vorhanden, aber in der `main`-Methode müssen Sie noch zwei passende Filterfunktionen als **Lambda** realisieren.

Nachdem Sie die beiden Filter geschrieben haben, lassen Sie das Programm laufen und überprüfen Sie, ob wirklich die richtigen Zahlen ausgewählt werden.

Vergleichen Sie die Lösung mit Lambdas mit der aus der vorhergehenden Aufgabe, die auf anonymen inneren Klassen basiert hat.


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.
