void setup() {
	size(400, 400);
}

void draw() {
	background(255);
	stroke(0);

  //start creating the lines

  //Vertical Line
  line(width / 2, 0, width / 2, height);
  //Horizontal Line
  line(0, height / 2, width, height / 2);


  //Fill a black color
  fill(0);

  //Build your conditional statement 
	
  //Way I would do it
  // if(mouseX < width / 2){
  //   if(mouseY < height / 2){
  //     //Top Left
  //     rect(0, 0, width / 2, height / 2);
  //   }else{
  //     //Bottom Left
  //     rect(0, height / 2, width / 2, height);
  //   }
  // }else{
  //   if(mouseY < height / 2){
  //     //Top Right
  //     rect(width / 2, 0, width, height / 2);
  //   }else{
  //     //Bottom Right
  //     rect(width / 2, height / 2, width, height);
  //   }
  // }

  //&& way
  if(mouseX < width / 2 && mouseY < height / 2){
    rect(0, 0, width / 2, height / 2);
  }else if(mouseX < width / 2 && mouseY >= height / 2){
    rect(0, height / 2, width / 2, height);
  }else if(mouseX >= width / 2 && mouseY < height / 2){
    rect(width / 2, 0, width, height / 2);
  }else if(mouseX >= width / 2 && mouseY >= height / 2){
    rect(width / 2, height / 2, width, height);
  }
}