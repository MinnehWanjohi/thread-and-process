class Dog{
public void bark(){
System.out.println("Dog make a sound - barking");

}
}
class Puppy extends Dog{
@Override
public void bark(){
System.out.println("Puppy barks" );
}
}
public class Animals {
public static void main(String[] args) {
Dog myDog = new Puppy();

myDog.bark(); 

}
}



