# Langton's Ant

Simple application that shows the behaviour of the Ant (the cell that follows specific rules). It is created with Java (Swing).

From <a href="https://en.wikipedia.org/wiki/Langton%27s_ant">wikipedia:</a>
> Langton's ant is a two-dimensional universal Turing machine with a very simple set of rules but complex emergent behavior. It was invented by Chris Langton in 1986 and runs on a square lattice of black and white cells. The universality of Langton's ant was proven in 2000. The idea has been generalized in several different ways, such as turmites which add more colors and more states.

## Rules

Ant has to follow such rules as:
1. At a white square, turn 90° clockwise, flip the color of the square, move forward one unit,
2. At a black square, turn 90° counter-clockwise, flip the color of the square, move forward one unit,
3. Move forward one square, in the direction the ant is facing.

<p align="center">
<img src="https://user-images.githubusercontent.com/69539845/114167230-f9988600-992e-11eb-8cc0-2bb228cd3f20.png" alt="Langton's Ant">
</p>

### Application status
App is still in progress. TODO: 
- correctly display the ant's icon,
- rotate the ant's icon while it's moving.
