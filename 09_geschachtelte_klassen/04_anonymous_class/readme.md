# Aufgabe: Anonyme Klasse schreiben

## Lernziel

Eine anonyme Klasse verwenden, um einen Event-Handler zu implementieren. Den Zugriff der anonymen Klasse auf Attribute der umgebenden Klasse und finale Parameter der Methode nutzen.


## Umgebung

  * Eclipse


## Aufgabe

In dieser Aufgabe sollen Sie den Event-Handler für das Zerstören des Aliens als anonyme Klasse im Konstruktor von `GameBoard` realisieren. D.h. nicht mehr das Alien selbst reagiert auf das Klicken, sondern das `GameBoard` bekommt alle Klicks und überprüft, ob sich die Maus über dem Alien befindet.

Fügen Sie dem Konstruktor von `GameBoard` eine anonyme Klasse hinzu, die von `MouseAdapter` erbt. Überschreiben Sie in dieser Klasse die Methode `mousePressed` aus `MouseAdapter`.

In der `mousePressed`-Methode holen Sie die X- und Y-Koordinate aus dem `MouseEvent` und überprüfen Sie mit der Methode `intersects` von `Alien`, ob sich die Maus auch wirklich über dem Alien befindet. Wenn ja, rufen Sie die `explode`-Methode des Aliens auf.

Wenn sich der Mauszeiger nicht innerhalb des Aliens befindet, verschieben Sie das Alien (mit der Methode `setPosition`) an die Position des Mauszeigers.

Übergeben Sie die Instanz der anonymen Klasse der `addMouseListener`-Methode von `GameBoard`.

Lassen Sie das Programm laufen und überprüfen Sie, ob es das erwartete Verhalten zeigt.


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.
