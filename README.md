# 👾 Space Invaders — Software Design Patterns

A classic **Space Invaders** game built in **Java Swing**, created as a demonstration of common **software design patterns**. You control a ship at the bottom of the screen, shoot down waves of descending aliens, and try to clear them all before they reach you.

---

## 🎮 Gameplay

- Move your ship left and right and fire at the alien formation.
- Aliens march side to side and drop down each time they hit an edge.
- **Win** by destroying every alien on screen.
- **Lose** if an alien reaches your ship.

### Controls
| Key | Action |
|-----|--------|
| `A` | Move ship left |
| `D` | Move ship right |
| `Space` | Shoot |

---

## 🧩 Design Patterns Used

This project's main purpose is to show several design patterns working together inside a real game:

| Pattern | Where | What it does |
|---------|-------|--------------|
| **Singleton** | `Ship` | `Ship.getInstance(...)` guarantees only one ship object ever exists during play. |
| **Prototype** | `Enemy`, `Alien`, `CloneFactory` | New aliens are produced by cloning an existing one through `makeCopy()` instead of building each from scratch. |
| **Adapter** | `BulletAdapter`, `DeadlyBullet`, `ShotsTypes` | Lets the incompatible `DeadlyBullet` class work through the common `ShotsTypes` interface. |
| **Factory** | `BulletFactory` | Centralizes bullet creation and reuses bullet instances by caching them per position. |

---

## 🗂️ Project Structure

| File | Responsibility |
|------|----------------|
| `Main.java` | Entry point. Launches the game window. |
| `MainFrame.java` | Sets up the `JFrame` and hosts the game panel. |
| `InvadersPanel.java` | Core game loop — drawing, movement, collisions, win/lose, and input handling. |
| `Ship.java` | The player's ship (Singleton). Handles position and shooting. |
| `Alien.java` | An alien enemy. Implements cloning for the Prototype pattern. |
| `Enemy.java` | Interface defining a cloneable enemy. |
| `CloneFactory.java` | Returns clones of enemies (Prototype helper). |
| `Bullet.java` | A bullet fired by the ship. |
| `BulletFactory.java` | Creates and caches bullets (Factory pattern). |
| `BulletAdapter.java` | Adapts `DeadlyBullet` to the `ShotsTypes` interface. |
| `DeadlyBullet.java` | An alternative bullet type with its own interface. |
| `ShotsTypes.java` | Common interface for shot types. |

### Assets
- `ship.png` — the player's ship
- `alien.png` — the enemy sprite
- `background.jpg` — the game background

---

## 🚀 Getting Started

### Prerequisites
- **Java Development Kit (JDK) 8 or higher** installed.

### Compile
From the `src` directory:
```bash
javac *.java
```

### Run
```bash
java Main
```

> **Note:** The game loads images using relative paths like `src/ship.png`. Run the game from the project root (the folder that contains `src`) so the images load correctly. If sprites don't appear, double-check your working directory.

---

## 🛠️ Built With
- **Java** — core language
- **Java Swing** (`JFrame`, `JPanel`) — windowing and rendering
- **AWT** — graphics, timers, and keyboard input

---

## 💡 Possible Improvements
- Add multiple levels (a `createLevelTwo()` method is sketched but not yet wired in).
- Add a scoreboard, lives, and sound effects.
- Let aliens shoot back at the player.
- Add a restart option after a win or game over.
- Bundle assets into the JAR and load them as resources instead of file paths.

---

*A small game with a big focus on clean, pattern-driven design. 🚀*
