# Aufgabe: Filesystem-Abstraktion mit `File`

## Lernziel

Die Klasse `File` einsetzen, um plattformunabhängig Operationen auf dem Dateisystem durchzuführen.


## Umgebung

  * Eclipse


## Aufgabe

Benutzen Sie die Klasse `File`, um die Festplatte Ihres Computers, ausgehend von dem als `root` bezeichneten Verzeichnis `../..` zu durchsuchen und die Größe der Verzeichnisse zu berechnen.

Sie können die Größe eines Verzeichnisses nur indirekt bestimme, indem Sie die Größe aller Dateien in dem Verzeichnis addieren. Das Verzeichnis direkt kann man _nicht_ mit `length()`  nach seiner Größe fragen, wohl aber normale Dateien. Deswegen müssen Sie in Ihrem Programm immer sauber unterscheiden, ob ein Verzeichnis vorliegt (das sie rekursiv durchlaufen müssen) oder eine normale Datei (deren Größe Sie abfragen).

Geben Sie die Verzeichnisse mit Ihrer Größe aus. Am Ende des Programms geben Sie noch die Gesamtgröße aller Unterverzeichnisse aus. Eine beispielhafte sähe wie folgt aus:

    Untersuche: c:/daten/eclipse-workspace

    465 Byte - c:/daten/eclipse-workspace/.recommenders/snipmatch/repositories
    1,4 kByte - c:/daten/eclipse-workspace/.recommenders/snipmatch
    4,6 MByte - c:/daten/eclipse-workspace/.recommenders
    57,5 MByte - c:/daten/eclipse-workspace
    103 Byte - c:/daten/lib/.settings
    5,8 MByte - c:/daten/lib

    Gesamtgröße: 80,4 MByte

Lassen Sie Ihr Programm laufen und überprüfen Sie, ob die Ausgaben plausibel sind. Vergleichen Sie das Ergebnis mit den Angaben des Windows-Explorers oder Mac-Finders.


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.
