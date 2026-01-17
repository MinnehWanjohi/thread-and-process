public class MyThread extends Thread {

public void run(){

System.out.println("Today the sun is out");  }

public static void main(String[] args) {
MyThread obj = new MyThread();
obj.start();
}
}