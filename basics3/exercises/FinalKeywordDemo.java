// final class Animal
// {
//     void sleep()
//     {
//         System.out.println("Animal is sleeping");
//     }
// }
class Animal
{
    final int age=19;
    final void sleep()
    {
        //age=20;
        System.out.println("Animal is sleeping");
    }
}

        
class Tiger extends Animal
{
    // void sleep()final method we cannot ovverride in child class
    // {

    // }
}

public class FinalKeywordDemo 
{
    public static void main(String[] args) 
    {

        Tiger t=new Tiger();
        t.sleep();
    }
    
}
