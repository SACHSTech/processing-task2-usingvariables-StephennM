import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1000, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(120, 147, 203);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // Drawing clouds as background (circles)
    fill(229, 232, 239);
    ellipse(width/4, height/8,
            width/2, height/4);
    ellipse(width/2, height/8,
            width/2, height/4);

    // Drawing the house (square)
    fill(65, 69, 96);
    rect(170, 135, 220, 200);

    // Drawing the garage (rectangle)
    fill(65, 69, 96);
    rect(390, 145, 220, 200);
    fill(171, 175, 183);
    rect(400, 155, 200, 200);

    // Drawing the door (rectangle)
    fill(149, 56, 0);
    rect(252, 230, 50, 70);

    // Drawing windows (house and garage) (squares)
    fill(207, 200, 178);
    rect(320, 157, 40, 40);
    rect(190, 157, 40, 40);
    rect(195, 230, 30, 30);
    rect(325, 230, 30, 30);
    fill(40, 40, 40);
    rect(420, 177, 30, 30);
    rect(480, 177, 30, 30);
    rect(540, 177, 30, 30);

    // Drawing grass (foreground)
    fill(28, 201, 90); 
    rect(0, 280, 1000, 500);

    // Drawing the roof (triangle)
    fill(174, 176, 177);
    triangle(272, 45, 407, 145, 157, 145);

    // Drawing the trees (Circles & rectangles)
    fill(62, 56 ,37);
    rect(25, 100, 50, 180);
    fill(84, 94, 43);
    ellipse(width/18, height/5,
            width/9, height/5);
  }
  
  // define other methods down here.
}