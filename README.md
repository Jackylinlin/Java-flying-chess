# Java-flying-chess
Game Name: Maze Adventure Game

Introduction
Welcome to the maze adventure game! This is a simple text and graphics game based on Java and JavaFX. In the game, you will explore a map composed of mazes and various obstacles, competing with other players to reach the end first.

Game features
Multi-player battle: The game supports two or more players to battle, and players compete to become the first player to reach the finish line.
Map generation: The map in the game is randomly generated. You can choose difficulty levels 1, 2, and 3. The higher the difficulty, the more obstacles there are.
Obstacles: There are various obstacles distributed on the map, and they are randomly generated, such as fire pits, bottomless pits, spikes, etc.
Dice Roll: Determine the number of steps to move by rolling a dice.
Performance ranking: After the game is over, the player's performance ranking will be displayed.

Obstacle introduction:
Bottomless pit (black background): If the player falls on it, the player will immediately return to the starting point.
Fire Pit (blue background): If the player lands on it, the player misses the next turn and cannot throw the sieve on the next turn.
A spike pit: must be jumped, that is, if there are 3 spike pits ahead, the dice points must be at least 4 to pass the obstacle.
Teleporter (white background): If a player lands on it, the game mechanics will choose a player to move to any location.

How to get started
Runtime environment: Make sure the Java Runtime Environment (JRE) is installed on your computer.
Start the game: Run the main method in the MainApp class to start the game.
Set game parameters: After the game is launched, you will be prompted to set game parameters, including map size, difficulty, number of players, and player names.
Start the Adventure: Once setup is complete, the game will begin and your character will move around the map based on the number of dice rolled. Try to reach the finish line first.

Game operation
Click the "Roll" button to roll the dice to determine your number of moves.
Click the "Score board" button to view the scoreboard.
There will be prompts in the game showing the current player's turn information and movement status.

Developer information
The game is developed using Java and JavaFX.
Image resources are stored in the images directory, ensure the correct path of the image file.

Version history
Version 1.0: The basic functions are completed, support multi-player games, select difficulty, and randomly generate maps.
