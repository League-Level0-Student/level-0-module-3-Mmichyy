void setup(){
  PImage face=loadImage("face.jpeg");
  background(face);
  size(680,606);
  }
  void draw(){
    fill(255,2,2);
    ellipse(500,400,50,50);
    
if(mousePressed){
  println(mouseX+""+mouseY);
}
  }
    

  