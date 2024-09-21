# 🎮 Java RPG Game
This project is a simple text-based RPG game implemented in Java. Players can create characters with different classes, equip weapons, and engage in combat. The game allows for interactive gameplay through command line input.

## 📋 Features
- Character Creation: Players can create characters by selecting their type (Mage, Paladin, Cleric) and specifying attributes such as health, strength, and dexterity.
- Weapon Selection: Each character can equip a weapon based on their class.
- Combat System: Characters can attack each other, with health points being reduced upon taking damage.
- Interactive Gameplay: Players can control the game through console input.

## 📦 Requirements
1. Java Development Kit (JDK) 8 or higher.
2. An IDE or text editor for Java (e.g., IntelliJ IDEA, Eclipse, or Visual Studio Code).

## ⚙️ How to Run
1. Clone the Repository
Clone this repository to your local machine:
```
git clone <url>
```
2. Compile the Java Files
Compile the Java files using the following command:
```
javac main/main/java/rpg/*.java
```
3. Run the Main Class
Run the program with the following command:
```
java main.main.java.rpg.Main
```

## 🎮 How to Play
1. Character Creation:
- Input the character type (1 for Mage, 2 for Paladin, 3 for Cleric).
- Enter the character’s health, strength, dexterity, and weapon code.
2. Combat:
- To attack, input the index of the attacker followed by the index of the defender.
- Input 0 as the attacker index to exit the combat loop.
3. View Status:
- After each attack, the game displays the current status of all characters.

## 📂 Project Structure
- `main/main/java/rpg/:` Contains all the Java classes for the RPG game, including:
  - `Main.java:` The main class to run the game.
  - `Personagens/:` Contains character classes (Mage, Paladin, Cleric).
  - `Armas/:` Contains weapon classes for each character type.

## 🛠️ Future Enhancements
- Implement a graphical user interface (GUI).
- Add more character classes and weapon types.
- Introduce leveling up and skill systems.
- Create a save/load game feature.

Thank you for checking out the Java RPG Game! Enjoy playing!
