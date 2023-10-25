
/*
You are asked to implement the Builder design pattern for rendering simple chunks of code.

Sample use of the builder you are asked to create:

CodeBuilder cb = new CodeBuilder("Person").addField("name", "String").addField("age", "int");
System.out.println(cb);
The expected output of the above code is:

public class Person
{
  public String name;
  public int age;
}

Please observe the same placement of curly braces and use two-space indentation.
*/

import java.util.List;
import java.util.ArrayList;

class Pair {
    public String type;
    public String name;
    public Pair(String type, String name) {
        this.type = type;
        this.name = name;
    }
}

class CodeBuilder
{
    private String className;
    private List<Pair> fields;
    
    public CodeBuilder(String className)
    {
        // todo
        this.className = className;
        this.fields = new ArrayList<>();
    }
    
    public CodeBuilder addField(String name, String type)
    {
        // todo
        this.fields.add(new Pair(type, name));
        return this;
    }
    
    @Override
    public String toString()
    {
        // todo
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("public class %s\n{\n", className));
        fields.forEach(pair -> sb.append(String.format("  public %s %s;\n", pair.type, pair.name)));
        sb.append("}");
    
        return sb.toString();
    }
}
