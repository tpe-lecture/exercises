# Aufgabe: Eigene Ausnahmen schreiben und an entsprechender Stelle werfen

## Lernziel

Ausnahmen programmieren und sinnvoll einsetzen. Bedeutung der Schlüsselwörter `throws` und `throw` verstehen.


## Umgebung

  * Eclipse


## Aufgabe

In der vorliegenden Aufgabe sollen Sie eine Sicherung (`Fuse`) programmieren. Sicherungen gibt es (in unserer Modellwelt) nur für 16, 25 und 32 Ampére.

Beim Anlegen erfährt die Sicherung über den Konstruktor bei welchem Strom sie auslösen soll. Hierbei soll es nur möglich sein, Sicherungen in den vorhandenen Stärken anzulegen. Bei jedem anderen Wert soll der Konstruktor eine `IllegalCurrentException` werfen. In der Ausnahme soll gespeichert werden, mit welchem (falschen) Wert die Sicherung angelegt werden sollte. Diese Information wird beim Aufruf von `toString()` auf der Ausnahme wieder zurückgegeben.

Die Sicherung wird benutzt, indem die `use`-Methode mit dem aktuellen Strom aufgerufen wird. Ist dieser größer als der Nennstrom der Sicherung löst diese aus und wirft eine `FuseTrippedException`. In der Ausnahme sind sowohl der Nennstrom als auch der Auslösestrom gespeichert und werden in der `toString`-Methode ausgegeben.

Beachten Sie die TODO-Kommentare und passen Sie das Programm entsprechend an, damit es die oben beschriebenen Anforderungen erfüllt.

Kommentieren Sie die Tests ein und lassen Sie diese laufen. Erst wenn alle Tests grün sind, gilt die Aufgabe als bestanden.


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.
