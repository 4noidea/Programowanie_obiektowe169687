public class Pair <T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;

    }
    public void setFirst(T first)
    {
        this.first = first;
    }
    public T getSecond()
    {
        return second;
    }
    public void setSecond(T second) {
        this.second = second;
    }
}
class Animal{}
class Dog extends Animal
{
    private int age;
    public Dog(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

}