public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
      this.name = name;
      this.age = age;
    }

    public int age()
    {
      return this.age;
    }

    public String getName(){
      return name;
    }

    public  int getAge(){
      return age;
    }

    public boolean equals(Person obj)
    {
      if(obj == this)
      {
        return true;
      }
      if(obj == null || obj.getClass() != obj.getClass())
      {
        return false;
      }
      Person x = (Person) obj;
      return (x.name == this.name && x.age == this.age);
    }
  }
