# Aufgabe: Iterator schreiben

## Lernziel

Für eine gegebenen Klasse einen Iterator schreiben.


## Umgebung

  * Eclipse


## Aufgabe

In dieser Aufgabe sollen Sie für eine bereits vorhandene Klasse einen Iterator schreiben. Bei dieser Klasse (`SimpleStack`) handelt es sich um einen sehr einfach (und nicht sehr sicher) programmierten Stack.

Implementieren Sie in `SimpleStack<T>` das Interface `Iterable<T>` und schreiben Sie, wie vom Interface verlangt einen Iterator für die Klasse. Sie sollten hier innere Klasse verwenden, um den Zugriff auf die privaten Attribute von `SimpleStack` zu vereinfachen.

Benutzen Sie die Tests in `TestStack`, um zu überprüfen, dass Ihre Implementierung des Iterators richtig funktioniert. Hierzu müssen Sie die entsprechenden Tests allerdings erst einkommentieren.


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.
