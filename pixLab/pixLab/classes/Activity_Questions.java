/**
 * Don't judge me, this just makes sense :|. 
 * Not only are there the responses to 
 * activity questions that are answerable here, 
 * but there is also the work I have done for the 
 * exercises as well.
 *
 * @author Rene-Angel Jaime
 * @version (12.11.19 - 2.6.20)
 */
public class Activity_Questions
{
    /**Activity 1 - Questions
       1) It takes 8 bits to represent values from 0 to 255.
       2) It takes 3 bytes to represent a color.
       3) There are about 307200 pixels total in a 640x480 image.
       -----------------------------------------------------------------
       Activity 2 - Questions
       1) Pink: java.awt.Color[r=255,g=155,b=200]
       2) Yellow: java.awt.Color[r=255,g=255,b=102]
       3) Purple: java.awt.Color[r=153,g=51,b=255]
       4) White: java.awt.Color[r=255,g=255,b=255]
       5) Dark Gray: java.awt.Color[r=51,g=51,b=51]
       -----------------------------------------------------------------
       Activity 3 - Questions
       1) The Row index for the top left corner of the picture: 0
       2) The Column index for the top left corner of the picture: 0
       3) Image width - 640, Right most column index: 639
       4) Image height - 480, Bottom most Row index: 479
       5) The row index increases from the left to right.
       6) The column index increases from the top to the bottom.
       7) By setting the zoom to 500% I can see the squares of color.
       -----------------------------------------------------------------
       Activity 4 - Exercises
       1) public int getCount(int value)
          {
              int count = 0;
              for (int row = 0; row < matrix.length; row++)
              {
                  for (int col = 0; col < matrix[0].length; col++)
                  {
                      if(matrix[row][col] == value)
                      {
                          count++;
                      }
                  }
              }
              return count;
          }
       2) public int getLargest()
          {
              int largeNum = 0;
              for (int row = 0; row < matrix.length; row++)
              {
                  for (int col = 0; col < matrix[0].length; col++)
                  {
                      if (col > col - 1)
                      {
                          largeNum = largeNum + col;
                      }
                  }
              }
              return largeNum;
          }
       3) public int getColTotal()
          {
              int cTotal = 0;
              for (int r = 0; r < matrix.length; r++)
              {
                  cTotal = cTotal + matrix[r][c];
              }
              return cTotal;
          }
       -----------------------------------------------------------------
       Activity 5 - Questions
       1) "getPixels2D" method not found in "Picture.java".
       2) "getPixels2D" method found in "SimplePicture.java".
       3) "DigitalPicture p = new DigialPicture();" does not compile.
       4) "DigitalPicture p = new SimplePicture();" compiles.
       5) "DigitalPicture p = new Picture();" compiles.
       6) "SimplePicture p = new Picture();" compiles.
       7) "Picture p = new SimplePicture();" does not compile.
       
       Activty 5 - Exercises
       3) public void keepOnlyBlue()
          {
              Pixel[][] pixels = this.getPixels2D();
              for(Pixel[] rowArray : pixels){
                 for(Pixel pixelObj : rowArray){
                     pixelObj.setRed(0);
                     pixelObj.setGreen(0);
                 }
              }
           }
       4) public void negate()
          {
               Pixel[][] pixels = this.getPixels2D();
               for(Pixel[] rowArray : pixels){
                   for(Pixel pixelObj : rowArray){
                       pixelObj.setRed(255-pixelObj.getRed());
                       pixelObj.setBlue(255-pixelObj.getBlue());
                       pixelObj.setGreen(255-pixelObj.getGreen());
                   }
               }
           }
       5) public void grayscale()
          {
               Pixel[][] pixels = this.getPixels2D();
               for(Pixel[] rowArray : pixels){
                   for(Pixel pixelObj : rowArray){
                       pixelObj.setRed((pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen())/3);
                       pixelObj.setBlue((pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen())/3);
                       pixelObj.setGreen((pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen())/3);
                   }
                }
          }
       6) public void fixUnderwater(){
              Pixel[][] pixels = this.getPixels2D();
              for(Pixel[] rowArray : pixels){
                  for(Pixel pixelObj : rowArray){
                      pixelObj.setBlue(50+pixelObj.getBlue());
                      pixelObj.setGreen(50-pixelObj.getGreen());
                      pixelObj.setRed(50+pixelObj.getRed());
                   }
              }
          }
       -----------------------------------------------------------------
       Activity 6 - Exercises
       1) public void mirrorVerticalRTL(){
              Pixel[][] pixels = this.getPixels2D();
              Pixel leftPixel = null;
              Pixel rightPixel = null;
              int w = pixels[0].length;
              for(int r = 0; r < pixels.length; r++){
                  for(int c = 0; c < w / 2; c++){
                      leftPixel = pixels[r][c];
                      rightPixel = pixels[r][w-1-c];
                      leftPixel.setColor(rightPixel.getColor());
                  }
              }
          }
       2) public void mirrorHorizontal(){
              Pixel[][] pixels = this.getPixels2D();
              Pixel upPixel = null;
              Pixel downPixel = null;
              int l = pixels.length;
              for(int r = 0; r < l / 2; r++){
                  for(int c = 0; c < pixels[0].length; c++){
                      upPixel =  pixels[r][c];
                      downPixel = pixels[l-1-r][c];
                      downPixel.setColor(upPixel.getColor());
                  }
              }
          }
       3) public void mirrorHorizontalBTP(){
              Pixel[][] pixels = this.getPixels2D();
              Pixel upPixel = null;
              Pixel downPixel = null;
              int l = pixels.length;
              for(int r = 0; r < l / 2; r++){
                  for(int c = 0; c < pixels[0].length; c++){
                      upPixel =  pixels[r][c];
                      downPixel = pixels[l-1-r][c];
                      upPixel.setColor(downPixel.getColor());
                  }
              }
          }
       4) public void mirrorDiagonal(){
              Pixel[][] pixels= this.getPixel2D();
              Pixel leftPixel = null;
              Pixel rightPixel = null;
              int w = pixels[0].length;
              for(int r = 0; r < pixels.length; r++){
                  for(int c = 0; c < w * .75; c++){
                      leftPixel = pixels[r][c];
                      rightPixel = pixels[c][r];
                      leftPixel.setColor(rightPixel.getColor());
                  }
              }
          }
       -----------------------------------------------------------------
       Activity 7 - Questions
       1) 90 times
       2) 90 times
       
       Activity 7 - Exercises
       1) 18410 times looped
       2) public void mirrorArms(){
              int mp = 189; //mp = mirrorPoint
              Pixel upPixel = null;
              Pixel downPixel = null;
              Pixel[][] pixels = this.getPixels2D();
              for(int r = 159; r < mp; r++){
                  for(int c = 102; c < 170; c++){
                      upPixel = pixels[r][c];
                      downPixel = pixels[mp-r+mp][c];
                      downPixel.setColor(upPixel.getColor());
                  }
              }
              for(int r = 159; r < mp; r++){
                  for(int c = 238; c < 293; c++){
                      upPixel = pixels[r][c];
                      downPixel = pixels[mp-r+mp][c];
                      downPixel.setColor(upPixel.getColor());
                  }
              }
          }
       3) public void mirrorGull(){
              int mp = 345;
              Pixel leftPixel = null;
              Pixel rightPixel = null;
              Pixel[][] pixels = this.getPixels2D();
              for(int r = 235; r < 330; r++){
                  for(int c = 237; c < mp; c++){
                      leftPixel = pixels[r][c];
                      rightPixel = pixels[r][mp-c+mp];
                      rightPixel.setColor(leftPixel.getColor());
                  }
              }
          }
        -----------------------------------------------------------------
        Activity 8 - Exercises
        1) public void copy2(Picture fromPic, 
                 int startR, int startC, int endR,
                 int endC, int startR2, int startC2)
           {
               Pixel fromPixel = null;
               Pixel toPixel = null;
               Pixel[][] toPixels = this.getPixels2D();
               Pixel[][] fromPixels = fromPic.getPixels2D();
               for (int fromRow = startR2, toRow = startR; 
                    fromRow < fromPixels.length &&
                    endR < toPixels.length; 
                    fromRow++, toRow++)
               {
                   for (int fromCol = startC2, toCol = startC; 
                        fromCol < fromPixels[0].length &&
                        endC < toPixels[0].length;  
                        fromCol++, toCol++)
                   {
                       fromPixel = fromPixels[fromRow][fromCol];
                       toPixel = toPixels[toRow][toCol];
                       toPixel.setColor(fromPixel.getColor());
                   }
               }   
           }
        2) public void myCollage()
           {
                Picture flower1 = new Picture("flower1.jpg");
                Picture flower2 = new Picture("flower2.jpg");
                Picture city = new Picture ("city.jpg");
                this.copy(city,0,0);
                this.copy(flower1,0,0);
                this.copy(flower2,100,0);
                this.copy(flower1,200,0);
                Picture flowerNoBlue = new Picture(flower2);
                flowerNoBlue.zeroBlue();
                this.copy(flowerNoBlue,300,0);
                this.copy(flower1,400,0);
                this.copy(flower2,500,0);
                this.mirrorVertical();
                this.write("collage.jpg");
           }
       -----------------------------------------------------------------
       Activity 9 - Exercises
       1) public void edgeDetection(int edgeDist)
          {
               Pixel leftPixel = null;
               Pixel rightPixel = null;
               Pixel downPixel = null;
               Pixel[][] pixels = this.getPixels2D();
               Color rightColor = null;
               Color downColor = null;
               for (int row = 0; row < pixels.length-1; row++)
               {
                    for (int col = 0; col < pixels[0].length-1; col++)
                    {
                         leftPixel = pixels[row][col];
                         rightPixel = pixels[row][col+1];
                         downPixel = pixels[row+1][col];
                         rightColor = rightPixel.getColor();
                         downColor = downPixel.getColor();
                         if (leftPixel.colorDistance(rightColor) > edgeDist &&
                             leftPixel.colorDistance(downColor) > edgeDist)
                             leftPixel.setColor(Color.BLACK);
                         else
                             leftPixel.setColor(Color.WHITE);
                    }
               }
          }
       2) public void edgeDetection2(int edgeDist)
          {
              Pixel upPixel = null;
              Pixel downPixel = null;
              Pixel[][] pixels = this.getPixels2D();
              Color downColor = null;
              for (int r = 0; r < pixels.length; r++)
              {
                  for (int c = 0; c < pixels[0].length-1; c++)
                  {
                      upPixel = pixels[r][c];
                      downPixel = pixels[r-1][c];
                      downColor = downPixel.getColor();
                      if (upPixel.colorDistance(downColor) > edgeDist)
                          upPixel.setColor(Color.BLACK);
                      else
                          upPixel.setColor(Color.WHITE);
                  }
              }
          }
     */
}