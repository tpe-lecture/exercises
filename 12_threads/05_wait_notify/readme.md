# Aufgabe: Thread Koordination mit `wait()` und `notify()`/`notifyAll()`

## Lernziel

Mehrere Threads ohne aktives Warten durch `wait()` und `notify()`/`notifyAll()` koordinieren.


## Umgebung

  * Eclipse


## Aufgabe

Bei dieser Aufgabe geht es darum, ein Art "Ufo-Billard" zu bauen. Immer wenn ein Ufo an ein anderes Ufo anstößt, soll es stehen bleiben und das berührte Ufo soll mit seiner ursprünglichen Geschwindigkeit weiterfliegen.

Lassen Sie das Programm laufen. Sie werden sehen, dass die Ufos einander nicht beachten und einfach weiterfliegen. Dabei hat jedes Ufo ein Attribut `stopPosition`, das die x-Position bestimmt, an der es eigentlich anhalten soll.

Erweitern Sie das Programm so, dass das Ufo an seiner vorgegebenen `stopPosition` anhält. Verwenden Sie dafür die Methode `wait()`, damit es später von außen wieder dazu gebracht werden kann, weiterzufliegen und damit Sie kein aktives Warten einsetzen müssen. Lassen Sie das Programm laufen. Nach dieser Änderung sollten alle Ufos anhalten und das Programm keinen Fortschritt mehr machen. Die Ufos sollten wie auf einer Perlenschnur aufgereiht sein.

Wichtig ist, dass Sie sich gut überlegen, auf welchem Objekt Sie das `wait()` durchführen, damit die folgenden Schritte auch funktionieren.

Sorgen Sie nun mit `notifyAll()` dafür, dass Ufos, die angehalten haben, wieder weiterfliegen, wenn ein anderes Ufo seine Stopp-Position erreicht hat.

Lassen Sie das Programm laufen und überprüfen Sie, ob es das erwartete Verhalten zeigt.


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.
