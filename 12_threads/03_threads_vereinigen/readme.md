# Aufgabe: Threads mit `join()` vereinigen

## Lernziel

Mehrere Threads starten und dann unter Verwendung der `join`-Methode darauf warten, dass alle Threads fertig sind, bevor eine weitere Aktion erfolgt.


## Umgebung

  * Eclipse


## Aufgabe

Diese Aufgabe ist den vorhergehenden Aufgaben ähnlich. Allerdings brauchen Sie keine der vorige Lösungen zu übernehmen, da sie nicht auf ihren Vorgängern aufbaut.

Schauen Sie sich die Klassen `Ufo` und `GameBoard` genau an und lassen Sie das Programm laufen. Die Ufos fliegen bis zum Rand des Bildschirms, bleiben dort stehen und die Threads beenden sich. Sie erkennen dies an der Ausgabe _Ich habe fertig..._.

Ihre Aufgabe besteht nun darin, auf das Ende __aller__ Ufo-Threads zu warten und dann - und erst dann - die Ufos zu sprengen. D.h. die Ufos sollen warten, bis alle am Rand angekommen sind und dann sollen alle auf ein Mal explodieren.

Aus Gründen, die in der Natur des verwendeten Frameworks liegen, muss das Warten und Sprengen in einem extra Thread erfolgen. Dieser wird über die Klasse `UfoJoiner` realisiert und auch von `GameBoard` gestartet, sodass Sie sich bei Ihrer Implementierung voll auf die `run`-Methode von `UfoJoiner` konzentrieren können. (Beachten Sie die dazugehörigen TODO-Kommentare.)


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.
