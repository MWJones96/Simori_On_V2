# Simori-ON V2

A Kotlin and TornadoFX remake, in progress, of the Simori-ON: a simplified simulation of the Yamaha Tenori-ON matrix instrument.

## Overview

The Simori-ON was the second-year Software Engineering project (module ECM2415) at the University of Exeter. Its specification and a later addendum are included as `Specification.pdf` and `Addendum.pdf`. The original brief was a team project, built in Java over four Scrum sprints. It describes:

- a 16 × 16 matrix of illuminated buttons
- an ON button, eight mode buttons (L1-L4, R1-R4), an LCD display and an OK button
- 16 layers, each with its own MIDI channel, voice and velocity
- modes for performance, changing voice, velocity, loop speed and loop point, and more

This repository is a solo remake started in 2020, written in Kotlin with a JavaFX user interface built on TornadoFX.

## What's implemented

- **User interface**: an ON button, the L1-L4 and R1-R4 mode buttons, a 16 × 16 grid of round buttons, a "Display" label standing in for the LCD, and an OK button.
- **Modes**: button presses go to the current mode object through the `SimoriMode` interface (a state pattern). Two modes exist:
  - **On/Off mode** is the initial state. Pressing ON switches to Performance mode.
  - **Performance mode**: pressing a grid button toggles it on or off. A button that is on is highlighted white. Pressing ON clears the grid and returns to On/Off mode.
- **State**: `SimoriState` holds the current mode and the grid as 16 × 16 JavaFX `SimpleBooleanProperty` values, which the grid buttons' styling is bound to.
- Every button press is logged to the console with the current mode.

## Tech stack

- Kotlin 1.3.72, targeting JVM 1.8
- TornadoFX 1.7.19
- JavaFX 14 (`javafx.controls`), through the `org.openjfx.javafxplugin` Gradle plugin
- Gradle 6.1.1, through the included wrapper

## Getting started

### Prerequisites

You need a JDK that can run both Gradle 6.1.1 and JavaFX 14. JavaFX 14 needs JDK 11 or later, and Gradle 6.1.1 runs on JDKs up to 13, so use JDK 11 to 13. Gradle downloads JavaFX and the other dependencies.

### Build

```
./gradlew build
```

On Windows, use `gradlew.bat build`.

### Run

The entry point is `main` in `src/main/kotlin/App.kt` (class `AppKt`), which launches `SimoriOnApp`. You can run it from IntelliJ IDEA, which the project was set up in.

`build.gradle` applies the `application` plugin but does not set a main class, so `./gradlew run` will not work as is. To run it from Gradle, add this line to `build.gradle`:

```groovy
mainClassName = 'AppKt'
```

## Project structure

```
src/main/kotlin/
  App.kt              TornadoFX application and view (button layout); main entry point
  SimoriState.kt      Current mode and 16x16 grid state; forwards button presses to the mode
  SimoriMode.kt       Interface with one handler per button
  OnOffMode.kt        On/Off mode
  PerformanceMode.kt  Performance mode: toggles grid buttons
  Styles.kt           TornadoFX stylesheet for lit buttons
  Layer.kt            Empty placeholder for layers
build.gradle          Gradle build: Kotlin, TornadoFX, JavaFX
Specification.pdf     Original ECM2415 specification
Addendum.pdf          Specification addendum (audio feedback, Shop Boy mode)
```

## Status

This is an early work in progress. Only the user interface layout and the On/Off and Performance modes exist so far. The following are not implemented:

- layers (the `Layer` class is empty)
- sound and MIDI playback
- the clock hand
- the LCD display
- the L and R modes
- the features in the addendum

The ON button's highlight style is applied once when the view is created and does not follow mode changes. There are no tests.

## Acknowledgements

The specification and addendum are by Dr David Wakeling, for ECM2415 Software Engineering at the University of Exeter (2016).
