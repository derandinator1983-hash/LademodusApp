LADEMODUS – Android-Studio-Projekt mit GitHub-Actions-Build

FUNKTION
Beim Start versucht die App, diese ASUS-Systemseite zu öffnen:
com.asus.mobilemanager/com.asus.mobilemanager.powersaver.ChargingModeActivity

WICHTIG
Die App öffnet nur die ASUS-Lademodus-Seite. Sie aktiviert Bypass Charging
NICHT selbstständig und schaltet es auch nicht automatisch beim Einstecken des
USB-Kabels ein.

GITHUB-BUILD
1. Das gesamte Verzeichnis LademodusApp in ein neues GitHub-Repository laden.
2. Darauf achten, dass .github/workflows/build.yml mit hochgeladen wird.
3. Nach dem Push auf GitHub den Reiter Actions öffnen.
4. Den Workflow "Build APK" auswählen und den erfolgreichen Lauf öffnen.
5. Unter Artifacts die Datei "Lademodus-APK" herunterladen.
6. ZIP entpacken. Darin liegt app-debug.apk.

Der Workflow installiert Gradle 8.9 direkt über gradle/actions/setup-gradle.
Daher wird kein gradlew-Skript und keine gradle-wrapper.jar benötigt.

MANUELLER BUILD IN ANDROID STUDIO
- Android Studio und JDK 17 verwenden.
- Android SDK Platform 35 installieren.
- Projektordner LademodusApp öffnen und Gradle-Sync ausführen.
- Build > Build Bundle(s) / APK(s) > Build APK(s).

KOMPATIBILITÄT / EINSCHRÄNKUNG
Die Ziel-Activity ist eine interne ASUS-Komponente. ASUS kann sie je nach
Modell, Firmware oder App-Version umbenennen, entfernen oder für externe Apps
sperren. In diesem Fall zeigt die App eine kurze Fehlermeldung.
Die App wurde hier nicht auf einem ASUS-Gerät getestet.
