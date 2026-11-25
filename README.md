# BAISM-CW-2

Minimalna aplikacja Android (Kotlin) używana jako źródło kodu dla pipeline'u
CI/CD na [Bitrise](https://bitrise.io) w ramach ćwiczenia 2 z przedmiotu
*Bezpieczeństwo aplikacji i systemów mobilnych*.

## Zawartość

- `app/` – aplikacja Android (Kotlin, AGP 8.5, minSdk 24, targetSdk 34).
- `app/src/main/java/pl/dsw/baism/Calculator.kt` – czysta logika biznesowa.
- `app/src/test/java/pl/dsw/baism/CalculatorTest.kt` – testy jednostkowe (JUnit).
- `bitrise.yml` – definicja workflow `safe_build`.

## Workflow `safe_build`

1. `git-clone` – klonuje repozytorium.
2. `android-unit-test` – uruchamia testy jednostkowe; **czerwony test = stop**.
3. `script` (mobsfscan) – skan SAST; **znalezione problemy = stop**.
4. `android-build` – buduje APK.
5. `deploy-to-bitrise-io` – publikuje artefakt (APK) na bitrise.io.

Trigger: Pull Request do gałęzi `main` uruchamia `safe_build`.

## Lokalne uruchomienie testów

```bash
./gradlew testDebugUnitTest
```

