/*
Here's a very synthetic example for you to try.
You are given a Rectangle  interface and an extension method on it. Try to define a SquareToRectangleAdapter  that adapts the Square  to the IRectangle  interface.
*/


class Square
{
  public int side;

  public Square(int side)
  {
    this.side = side;
  }
}

interface Rectangle
{
  int getWidth();
  int getHeight();

  default int getArea()
  {
    return getWidth() * getHeight();
  }
}

class SquareToRectangleAdapter implements Rectangle
{
  public SquareToRectangleAdapter(Square square)
  {
    // todo
    this.width = square.side;
    this.height = square.side;
  }
    int width;
    int height;
    
    public int getWidth() { return width; }
    public int getHeight() { return height; }
  
}
