public class Main
{
    public static void findMInMaxAge(Dog[] dogs, Pair<? super  Dog>result)
    {
        if (dogs==null || dogs.length==0)
        {
            throw new IllegalArgumentException("No dog found");
        }
        Dog min=dogs[0];
        Dog max = dogs[0];
        for(Dog dog :dogs)
        {
         if(dog.getAge()<min.getAge())
         {
             min=dog;
         }
         if(dog.getAge()>max.getAge())

         {
             max=dog;
         }

        }
        result.setFirst(min);
        result.setSecond(max);
    }
    public static void main(String[] args)
    {
        Dog[] dogs = {
                new Dog(1),
                new Dog(3),
                new Dog(5),
                new Dog(7),
        };
        Pair<Animal>result=new Pair<>(null,null);
        findMInMaxAge(dogs,result);
            Dog youngest=(Dog) result.getFirst();
            Dog older=(Dog) result.getSecond();
            System.out.println("najmlodszyy"+youngest.getAge()+" najstarszy"+older.getAge());
    }



}
