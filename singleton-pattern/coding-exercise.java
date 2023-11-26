/*
  Since implementing a singleton is easy, you have a different challenge: write a method called isSingleton(). 
  This method takes a factory method that returns an object and it's up to you to determine whether or not that object is a singleton instance.
*/

import java.util.function.Supplier;
import java.io.*;

class SingletonTester
{
  public static boolean isSingleton(Supplier<Object> func)
  {
    // todo
    // return serializeAndDeserializeApproach(func);
    
    Object obj1 = func.get();
    Object obj2 = func.get();
    return obj1.equals(obj2);
  }
  
  static boolean serializeAndDeserializeApproach(Supplier<Object> func) {
      try {
        Object obj1 = func.get();
        FileOutputStream fos = new FileOutputStream("obj1");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj1);
        
        FileInputStream fis = new FileInputStream("obj1");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj2 = ois.readObject();
        
        if(obj1==obj2) return true;
    } catch(Exception e) {
        e.printStackTrace();
    }
    return false;
  }
}
