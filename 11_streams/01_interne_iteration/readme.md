# Aufgabe: Streams mit interner Iteration

## Lernziel

Einen Stream mit einer internen Iteration verwenden. Die Iteration sowohl mit einem Lambda, als auch mit einer Methodenreferenz durchführen.


## Umgebung

  * Eclipse


## Aufgabe

In dieser (und den folgenden Aufgaben) werden Sie Daten aus der Spieledatenbank von [Metacritic](http://www.metacritic.com) analysieren. Hierbei wurden die 994 Spiele mit der besten Bewertung ausgewählt. Für jedes Spiel sind angegeben:

  * Name des Spiels
  * Metacritic-Score (0-100)
  * Benutzerbewertung (0-100). Normalerweise werden die Benutzerbewertungen bei Metacritic on 0-10 mit einer Nachkommastelle angegeben. Für die einfachere Bearbeitung ist dies für Sie aber bereits in den Bereich 0-100 umgerechnet worden.
  * Erscheinungsjahr des Spiels

Die Verwaltung der Daten wurde Ihnen bereits abgenommen und wird von der Klasse `GameDatabase` durchgeführt. Ein einzelnes Spiel wird durch Objekte des Typs `ComputerGame` repräsentiert.

Schauen Sie sich die Klassen `ComputerGame` und `GameDatabase` an und versuchen Sie deren Funktionsweise zu verstehen.

Erweitern Sie nun die `main`-Methode von `ListGames` so, dass der Inhalt der Spieledatenbank ausgegeben wird und zwar wie folgt:

  1. Alle Spiele mit Hilfe einer internen Iteration und eines Lambda-Ausdrucks.
  2. Alle Spiele mit Hilfe einer internen Iteration und einer Methodenreferenz.
  3. Spiele aus dem Jahr 2012 mit Hilfe einer internen Iteration und eines Lambda-Ausdrucks.

Lassen Sie Ihr Programm laufen und überprüfen Sie, ob die richtigen Informationen ausgegeben werden.


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.
