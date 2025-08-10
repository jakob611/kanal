# Looksmaxing Android App

Android aplikacija v Kotlin-u za sledenje rutini "looksmaxing" - procesa izboljšanja fizičnega videza.

## Funkcionalnosti

### 🏃‍♂️ Dnevna rutina
- Sledenje dnevnim aktivnostim za izboljšanje videza
- Check-lista z nalogami kot so:
  - Jutarnja nega kože
  - Hidratacija
  - Sončna zaščita
  - Telovadba
  - Spanje
  - Večerna nega

### 💡 Nasveti in vodila
- Strokovna priporočila za:
  - Nego kože
  - Prehrano
  - Hidratacijo
  - Spanje
  - Telovadbo
  - Zaščito pred soncem
  - Upravljanje stresa
  - Nego las

### 📈 Sledenje napredku
- Spremljanje dni v programu
- Motivacijska sporočila glede na dosežen napredek
- Shranjenie podatkov na napravi

## Tehnična implementacija

- **Jezik**: Kotlin
- **Platforma**: Android (min SDK 24)
- **UI**: Material Design 3
- **Arhitektura**: MVVM z ViewBinding
- **Komponente**:
  - RecyclerView za sezname
  - SharedPreferences za lokalno shranjevanje
  - Material Cards za UI komponente

## Struktura projekta

```
app/
├── src/main/java/com/jakob/looksmaxing/
│   ├── MainActivity.kt          # Glavna aktivnost
│   ├── RoutineActivity.kt       # Dnevna rutina
│   ├── TipsActivity.kt         # Nasveti
│   ├── ProgressActivity.kt     # Napredek
│   ├── RoutineAdapter.kt       # Adapter za rutino
│   ├── TipsAdapter.kt          # Adapter za nasvete
│   ├── RoutineItem.kt          # Model za rutino
│   └── Tip.kt                  # Model za nasvete
└── src/main/res/
    ├── layout/                 # XML layouts
    ├── values/                 # Strings, colors, themes
    └── xml/                    # Backup rules
```

## Kako zagnati

1. Odprite projekt v Android Studio
2. Sinhronizirati Gradle files
3. Zaženite na emulatoru ali Android napravi

Aplikacija je zasnovana za pomoč uporabnikom pri vzpostavljanju zdravih navad in rutinin za izboljšanje videza ter samozavesti.