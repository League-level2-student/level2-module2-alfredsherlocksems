//*
// ***** SEGMENT CLASS *****
// This class will be used to represent each part of the moving snake.
//*
class Segment {
int x;
int y;
//Add x and y member variables. They will hold the corner location of each segment of the snake.


// Add a constructor with parameters to initialize each variable.
  Segment (int x, int y) {
  this.x=x;
  this.y=y;
}


}


//*
// ***** GAME VARIABLES *****
// All the game variables that will be shared by the game methods are here
//*
Segment head;
int randomFoodLocationX;
int randomFoodLocationY;
int snakeDirection = UP;
int foodEaten = 0;



//*
// ***** SETUP METHODS *****
// These methods are called at the start of the game.
//*

void setup() {
size(500, 400);
head = new Segment(0, 240);
frameRate(8);
dropFood();
}

void dropFood() {
  //Set the food in a new random location
    randomFoodLocationX = (int) random (25) * 20;
    randomFoodLocationY = (int) random (20) * 20;
    drawFood(randomFoodLocationX, randomFoodLocationY);
}



//*
// ***** DRAW METHODS *****
// These methods are used to draw the snake and its food 
//*

void draw() {
  background(#FFC217);
  drawFood(randomFoodLocationX, randomFoodLocationY);
  move();
  drawSnake();
  eat();
}

void drawFood(int randomFoodLocationX, int randomFoodLocationY) {
  //Draw the food
  fill(#FF0540);
  rect(randomFoodLocationX, randomFoodLocationY, 20, 20);
}

void drawSnake() {
  //Draw the head of the snake followed by its tail
  fill(#0FF789);
  rect(head.x, head.y, 20, 20);
}


//*
// ***** TAIL MANAGEMENT METHODS *****
// These methods make sure the tail is the correct length.
//*

void drawTail() {
  //Draw each segment of the tail 
  
}

void manageTail() {
  //After drawing the tail, add a new segment at the "start" of the tail and remove the one at the "end" 
  //This produces the illusion of the snake tail moving.
  
}

void checkTailCollision() {
  //If the snake crosses its own tail, shrink the tail back to one segment
  
}



//*
// ***** CONTROL METHODS *****
// These methods are used to change what is happening to the snake
//*

void keyPressed() {
  //Set the direction of the snake according to the arrow keys pressed
  if (key == 'w' && snakeDirection != DOWN) {
    snakeDirection = UP;
  }
  else if (key == 's' && snakeDirection != UP) {
    snakeDirection = DOWN;
  }
  else if (key == 'a' && snakeDirection != RIGHT) {
    snakeDirection = LEFT;
  }
  else if (key == 'd' && snakeDirection != LEFT)  {
    snakeDirection = RIGHT;
  }
}

void move() {
  //Change the location of the Snake head based on the direction it is moving.
  
    
  switch(snakeDirection) {
  case UP:
    head.y -= 20;
    break;
  case DOWN:
    head.y += 20; 
    break;
  case LEFT:
    head.x -= 20;
    break;
  case RIGHT:
    head.x += 20;
    break;
  }
  checkBoundaries();
}

void checkBoundaries() {
 //If the snake leaves the frame, make it reappear on the other side
 if (head.x > 510) {
   head.x = 0;
 }
 else if (head.x < -10) {
   head.x = 500;
 }
 else if (head.y > 410) {
   head.y = 0;
 }
 else if (head.y < -10) {
   head.y = 500;
 }
}



void eat() {
  //When the snake eats the food, its tail should grow and more food appear
  if (head.x == randomFoodLocationX && head.y == randomFoodLocationY) {
    foodEaten++;
    dropFood();
  }
}
