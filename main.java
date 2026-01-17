class TaskTwo implements Runnable{

public void run(){

System.out.println("Today the sun is out"); 

}
}
public class main{
public static void main(String[] args){
Thread thr2 = new Thread(new TaskTwo());
thr2.start();
}
}