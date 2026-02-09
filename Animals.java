class Dog{
public void bark(){
System.out.println("Dog make a sound - barking...");
}
public static void printInfo() {
System.out.println("Dog is barking...");
}
}
class Puppy extends Dog{
@Override
public void bark(){
System.out.println("Puppy barks..." );
}
public static void printInfo() {
System.out.println("puppy is barking");
}
}
public class Animals {
public static void main(String[] args) {
Dog myDog = new Puppy();
System.out.println("The puppy is barking \n");

myDog.bark();       // Dynamic binding — calls Puppy’s bark()
myDog.printInfo();  // Static binding — calls Dog’s printInfo() 

}
}


