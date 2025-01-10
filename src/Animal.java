public class Animal
{
    private String name;
    private int age;

    public Animal(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }
    @Override
    public String toString()
    {
        return "Animal [name=" + name + ", age=" + age + "]";

    }
}
class Dog extends Animal
{
    public Dog(String name, int age)
    {
        super(name,age);
    }
}


