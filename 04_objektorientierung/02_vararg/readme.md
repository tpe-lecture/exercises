# Aufgabe: Vararg-Methode

## Lernziel

Eine Varag-Methode schreiben können und diese dann für unterschiedliche Datentypen überladen.


## Umgebung

  * Eclipse


## Aufgabe

Für diese Aufgabe müssen Sie den Median einer Reihe von Zahlen berechnen. Berechnen Sie den Median nach der folgenden Vorschrift (Quelle: [Wikipedia](https://de.wikipedia.org/wiki/Median#Definition)):

Der Median teilt eine Liste von Werten in zwei Hälften. Er kann auf folgende Weise bestimmt werden:

  * Alle Werte werden (aufsteigend) geordnet.
  * Wenn die Anzahl der Werte ungerade ist, ist die mittlere Zahl der Median.
  * Wenn die Anzahl der Werte gerade ist, wird der Median meist als arithmetisches Mittel der beiden mittleren Zahlen definiert, die dann Unter- und Obermedian heißen.

Denken Sie bei der Aufgabe Pakete zu verwenden.


### Median von int-Werten

Schreiben Sie eine Klasse `Statistik`, die eine statische Methode `median` enthält, die den Median einer beliebigen Anzahl von int-Werten berechnen kann. Verwenden Sie hierzu eine Vararg-Methode, d.h. eine Methode mit einer Ellipse (`...`) in der Parameterliste.

**Tipp:** Sie können ein Array von Werten sehr leicht mit der Methode `Arrays.sort()` sortieren. Schauen Sie sich die JavaDoc dieser Methode an.


### Median von double-Werten

Überladen Sie jetzt die Methode `median` aus der Klasse `Statistik` so, dass auch Werte vom Typ `double` verarbeitet werden können.


### Test

Testen Sie die Funktionsweise Ihrer Methode mit dem vorgegebenen JUnit-Test. Entfernen Sie die Kommentare, um die entsprechenden Tests zu aktivieren und importieren Sie die noch fehlenden Klassen und Methoden.


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.

