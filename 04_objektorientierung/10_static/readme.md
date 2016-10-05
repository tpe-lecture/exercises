# Aufgabe: Statische Methoden und Attribute

## Lernziel

Eine Klasse mit statischen Attributen und Methoden entwickeln und die Unterschiede zu normalen Methoden und Attributen verstehen.


## Umgebung

  * Eclipse


## Aufgabe

Sie finden in der Aufgabe eine Klasse `Wuerfel`, die einen normalen sechsseitigen Würfel repräsentiert und eine Klasse `Spiel`, die Würfel benutzt. Um zu Überprüfen, ob die Würfel gezinkt sind, enthält jeder Würfel eine Methode `statistik()`, die eine Statistik über die geworfenen Augenzahlen ausgibt.

Der Nachteil der jetzigen Lösung ist, dass die Statistik nur pro Würfel erhältlich ist, nicht aber über alle Würfel hinweg.

Ändern Sie die Klasse `Wuerfel` so, dass

  * die Statistik über alle innerhalb des Programms verwendeten Würfel berechnet wird und
  * die Verteilung auf die einzelnen Augen in Prozent und nicht mehr als absolute Zahl ausgegeben wird.

Möglicherweise müssen Sie noch eine kleine Anpassung in der Klasse `Spiel` vornehmen.

Testen Sie Ihr Programm, indem Sie es mehrmals laufen lassen und prüfen Sie, ob der Würfel fair ist. Bei dieser Aufgabe dürfen Sie auf JUnit-Tests verzichten.


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.
