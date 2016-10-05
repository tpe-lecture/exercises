# Aufgabe: Methoden überschreiben

## Lernziel

Methoden einer Klasse überschreiben, um damit das Verhalten zu ändern.


## Umgebung

  * Kommandozeile
  * Eclipse


## Aufgabe

In dieser Aufgabe werden Sie ein sehr einfaches Spiel programmieren. Bei dem Spiel geht es darum, ein Alien mit der Maus zu treffen und zu klicken. Wenn Sie das Alien treffen, explodiert es und das Spiel ist zu Ende.

Diese Aufgabe verwendet ein einfaches Spiele-Framework, um Ihnen die schwierigen Programmieraufgaben abzunehmen.

Sie finden im Projekt die folgenden Klassen:

  * `Alien` - Ein Sprite für das Alien.
  * `GameBoard` - Das Spielfeld.
  * `GameMain` - Die Main-Klasse, die das Programm startet.

Starten Sie das Spiel, indem Sie die Klasse `GameMain` ausführen. Sie werden sehen, dass das Alien bereits über den Bildschirm läuft, es aber nicht auf das Klicken mit der Maus reagiert.

Bei `Alien` handelt es sich um ein _Sprite_, d.h. ein Bild, dass sich über den Bildschirm bewegen kann. Hierzu hat es eine Geschwindigkeit.

Schauen Sie sich die drei Klassen genau an und versuchen Sie zu verstehen, wie sie funktionieren. Einige Konstrukte werden Sie noch nicht verstehen, z.B. ` EventQueue.invokeLater(GameMain::new);` in der Klasse `GameMain`, sie sind aber für das Verständnis des Ablaufes nicht relevant. Beachten Sie insbesondere die Methoden `drawGame` und `updateGame` in der Klasse `GameBoard`. Überlegen Sie, welche Funktion die Methoden haben und wer sie aufruft. Zum besseren Verständnis können Sie auch den Debugger benutzen und Breakpoints in die Methoden setzen.

Schauen Sie sich die Methoden an, die `Alien` von seinen Elternklassen erbt. Sie haben zwar keinen Quelltext dieser Klassen aber Sie können sich mit Eclipse trotzdem die gesamte Vererbungshierarchie mit allen Methoden ansehen (_F4 - Open Type Hierarchy_).

In den Elternklassen gibt es eine Methode `mousePressed()`: Überschreiben Sie diese Methode und lassen Sie das Alien explodieren (`explode()` aufrufen).

Was jetzt noch fehlt, ist eine Ausgabe, dass das Spiel zu Ende ist. Auch das ist bereits vorgesehen. Hierzu müssen Sie in `GameBoard` die Methode `drawGameOver()` überschreiben. Text können Sie zentriert mit der geerbten Methode `centerText` ausgeben.

Testen Sie Ihr Spiel, indem Sie Aliens wegklicken.


## Optionale Erweiterung

Wenn Sie mit der Aufgabe zu schnell fertig geworden sind, versuchen Sie das Spiel so zu erweitern, dass mehrere Aliens über den Bildschirm fliegen und geklickt werden können.


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.
