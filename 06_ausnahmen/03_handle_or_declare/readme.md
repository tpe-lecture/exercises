# Aufgabe: Handle-or-Declare-Regel anwenden

## Lernziel

In einem vorhandenen Programm die Ausnahmen korrekt weiterdeklarieren und an den richtigen Stellen fangen.


## Umgebung

  * Eclipse


## Aufgabe

Entfernen Sie auskommentierten Zeilen in der Klasse `Buchstabenzaehler`. Das Programm wird nicht korrekt kompilieren, weil die Ausnahmen nicht richtig deklariert und behandelt wurden.

Korrigieren Sie diesen Fehler und sorgen Sie dafür, dass die Ausnahmen an den Stellen behandelt werden, an denen Sie behandelt werden sollten, d.h. dort wo die Verursachung liegt. Bei der `StatistikException` handelt es sich um eine Inkonsistenz im Programm. Überlegen Sie, wo diese behandelt werden sollte und wann sie auftreten kann.

Sie müssen die Ausnahmen sinnvoll behandeln. Sie einfach an der `main`-Methode 
zu deklarieren ist keine valide Lösung dieser Aufgabe.


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.
