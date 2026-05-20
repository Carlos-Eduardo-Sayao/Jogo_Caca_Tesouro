🇧🇷 **Portuguese version:** [Clique aqui](https://github.com/Carlos-Eduardo-Sayao/Jogo_Caca_Tesouro/blob/main/README.md)

# Treasure Hunt Game

## Description:
The Treasure Hunt Game is a binary tree exploration game developed in Java, where the player navigates through different paths in search of a hidden treasure. Each location visited has a vitality value, which can increase or decrease the player's energy. The objective is to find the treasure before the vitality reaches zero. In other words, the player wins by finding the treasure and loses if their vitality reaches zero.

## Game Structure:
The map is built as a binary tree, where each node represents a location in the adventure. Each location contains: a name, a vitality value (+ or −), left and right paths, and a return path.

**Node types:**
- Common locations
- No Treasure
- Treasure

## Objective:
Find one of the nodes containing “Treasure” and avoid letting your vitality reach zero.

## How to Play:
During the adventure, the player receives options depending on the type of location visited.

**Common node:**  
1 - Follow the left path  
2 - Follow the right path  
3 - Return to the previous location  
4 - Exit the game  

**Leaf nodes (Treasure or No Treasure):**  
1 - Unavailable  
2 - Unavailable  
3 - Return to the previous location  
4 - Exit the game  

## Project Structure:
```text
app/  
├── Main.java → Runs the game  
├── Arvore.java → Builds the entire map and controls the game logic  
└── No.java → Represents each location (tree node)
