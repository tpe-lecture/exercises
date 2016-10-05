# Aufgabe: Einen generischen Typ schreiben

## Lernziel

Einen vorhandenen Typ so umgestalten, dass er als generischer Typ verwendet werden kann.


## Umgebung

  * Eclipse


## Aufgabe

Sie finden mit `Liste` eine sehr simple Implementierung einer einfach verketteten Liste vor. Zusätzlich gib es auch noch Tests, die die Liste testen.

Führen Sie die Tests aus und überzeugen Sie sich, dass die Liste korrekt funktioniert.

Schreiben Sie die Klasse `Liste` so um, dass sie zu einem generischen Typ wird. Dies bedeutet insbesondere, dass die Methoden `get` und `add` nicht mehr mit `Object` arbeiten, sondern typsicher werden. Sie dürfen in Ihrer Lösung __keine Casts__ verwenden, d.h. Sie müssen sich auch mit der Klasse `ListNode` beschäftigen und hier Änderungen vornehmen.

Führen Sie die Tests erneut aus, um sicher zu gehen, dass Sie bei Ihren Änderungen nichts kaputt gemacht haben.


## Abgabe

Aktivieren Sie Checkstyle für das Projekt (falls nicht bereits geschehen) und korrigieren Sie alle Fehlermeldungen bevor Sie das Ergebnis abgeben.

Committen Sie Ihre Lösung und pushen Sie sie danach in Ihr Repository.
