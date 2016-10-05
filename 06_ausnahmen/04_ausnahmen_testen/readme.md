# Aufgabe: Ausnahmen testen

## Lernziel

Bei einer gegebenen Klasse Testefälle mit JUnit schreiben, die auf das Werfen von Ausnahmen testen.


## Umgebung

  * Eclipse


## Aufgabe

Sie finden in der Aufgabe eine einfache Implementierung einer [Caesar-Verschlüsselung](https://de.wikipedia.org/wiki/Caesar-Verschlüsselung) in der Klasse `CrypterCaesar`. Außerdem finden Sie noch einen JUnit-Test in dem entsprechenden Paket `test`.

Im JUnit-Test `CaesarTest` fehlen aber noch die Tests für die Ausnahmen. Diese werden geworfen, wenn die Übergebenen Schlüssel bzw. die Klar- und Cypher-Texte nicht den Vorgaben entsprechen. Lesen Sie daher sorgfältig die JavaDoc der Klasse `CrypterCaesar` und fügen Sie dann entsprechende Testfälle in  `CaesarTest` hinzu, die auf das korrekte Werfen der Ausnahmen testen.

Lassen Sie Ihre Unit-Test laufen und testen Sie, ob die Ausnahmen entsprechend der Vorgaben aus der JavaDoc geworfen werden.


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.
