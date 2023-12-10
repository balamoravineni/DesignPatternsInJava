/*
You are given an example of an inheritance hierarchy which results in Cartesian-product duplication.

Please refactor this hierarchy, giving the base class Shape a constructor that takes an interface called Renderer  defined as

interface Renderer
{
  public String whatToRenderAs();
}
as well as VectorRenderer  and RasterRenderer  classes. Each implementer of the Shape  interface should have a constructor that takes an Renderer  such that, subsequently, each constructed object's toString()  operates correctly and produces a message similar to the following:

new Triangle(new RasterRenderer()).toString() // returns "Drawing Triangle as pixels" 

The method whatToRenderAs() should return "pixels" if using a raster renderer, and "lines" if using a vector renderer.
*/

interface Renderer
{
  public String whatToRenderAs();
}

class VectorRenderer implements Renderer {
    public String whatToRenderAs() {
        return "lines";
    }
}

class RasterRenderer implements Renderer {
    public String whatToRenderAs() {
        return "pixels";
    }
}

abstract class Shape
{
  public abstract String getName();
}

class Triangle extends Shape
{
    Renderer renderer;
    Triangle (Renderer renderer) {
        this.renderer = renderer;
    }
    
  @Override
  public String getName()
  {
    return "Triangle";
  }
  
  @Override
  public String toString()
  {
    return String.format("Drawing %s as %s", getName(), this.renderer.whatToRenderAs());
  }
}

class Square extends Shape
{
    Renderer renderer;
    Square (Renderer renderer) {
        this.renderer = renderer;
    }
    
  @Override
  public String getName()
  {
    return "Square";
  }
  
  @Override
  public String toString()
  {
    return String.format("Drawing %s as %s", getName(), this.renderer.whatToRenderAs());
  }
}

// imagine VectorTriangle and RasterTriangle are here too
