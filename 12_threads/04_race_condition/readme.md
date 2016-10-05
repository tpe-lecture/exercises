# Aufgabe: Race-Condition finden und beheben

## Lernziel

In einem gegebenen Programm Race-Conditions finden und durch den Einsatz von kritischen Abschnitten beheben.


## Umgebung

  * Eclipse


## Aufgabe

In dieser Aufgabe haben Sie ein defektes Programm vor sich, das aufgrund von Race-Conditions nicht richtig funktionieren kann.

Schauen Sie sich den Quelltext des Programms genau an und versuchen Sie die Funktionsweise zu verstehen. Lassen Sie das Programm laufen und betrachten Sie die Fehlermeldungen und Ausgaben. Mit großer Wahrscheinlichkeit wird das Programm abstürzen. Wenn nicht, starten Sie es mehrmals, bis ein Fehler auftritt.

Versuchen Sie die Ursache des Fehlers zu verstehen und überlegen Sie sich, wo genau die Race-Condition vorliegt. Wahrscheinlich wird der erste Fehler aus der Klasse `ArrayList` stammen. Dies ist aber nicht die einzige Race-Condition im Programm, es gibt noch eine zweite.

Beheben Sie die Race-Condition durch die Verwendung von kritischen Abschnitten und lassen Sie das Programm danach erneut mehrfach laufen. Wenn bei keinem der Durchläufen ein Fehler auftritt gilt die Aufgabe als gelöst.


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.
