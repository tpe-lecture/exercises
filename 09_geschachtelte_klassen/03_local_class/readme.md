# Aufgabe: Lokale Klasse schreiben

## Lernziel

Eine lokale Klasse verwenden, um einen Event-Handler zu implementieren. Den Zugriff der lokalen Klasse auf Attribute der umgebenden Klasse und finale Parameter der Methode nutzen.


## Umgebung

  * Eclipse


## Aufgabe

In dieser Aufgabe sollen Sie den Event-Handler für das Zerstören des Aliens als lokale Klasse im Konstruktor von `GameBoard` realisieren. D.h. nicht mehr das Alien selbst reagiert auf das Klicken, sondern das `GameBoard` bekommt alle Klicks und überprüft, ob sich die Maus über dem Alien befindet.

Fügen Sie dem Konstruktor von `GameBoard` eine lokale Klasse `AlienExploder` hinzu, die von `MouseAdapter` erbt. Überschreiben Sie in dieser Klasse die Methode `mousePressed` aus `MouseAdapter`.

In der `mousePressed`-Methode holen Sie die X- und Y-Koordinate aus dem `MouseEvent` und überprüfen Sie mit der Methode `intersects` von `Alien`, ob sich die Maus auch wirklich über dem Alien befindet. Wenn ja, rufen Sie die `explode`-Methode des Aliens auf.

Erzeugen Sie nach der Deklaration der Klasse `AlienExploder` eine Instanz von dieser und übergeben Sie das Objekt der `addMouseListener`-Methode von `GameBoard`.

Lassen Sie das Programm laufen und überprüfen Sie, ob es das erwartete Verhalten zeigt.


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.
