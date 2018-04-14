void setup(){
  PImage face=loadImage("SpongeBob_(5).png");
  size(680,606);
  face.resize(width,height);
  background(face);
 
  }
  void draw(){
    fill(255,255,255);
    ellipse(327,152,101,101);
    ellipse(411,137,101,101);
    fill(10,10,10);
    
if(mousePressed){
  println(mouseX+" "+mouseY);
}

if(mouseX<294){
  mouseX=294;
}
if(mouseY<134){
  mouseY=134;
}
if(mouseX<359){
  mouseX=359;
}
if(mouseY<145){
  mouseY=145;
}
   ellipse(mouseX,mouseY,20,20); 
 ellipse(mouseX+84,mouseY-15,20,20); 

  }