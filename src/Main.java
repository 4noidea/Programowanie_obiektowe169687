public class Main
{
    public static <T extends Animal>T findMax(T element1, T element2)
    {
        return element1.getAge() > element2.getAge() ? element1 : element2;
    }
    public static void main(String[] args)
    {
        Dog dog1=new Dog("Kawa",6);
        Dog dog2=new Dog("Max",14);

        Dog olderDog=findMax(dog1,dog2);
        System.out.println("Older dog:"+olderDog);
    }
}
