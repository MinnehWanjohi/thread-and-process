public class TheThread extends Thread {

public void run(){

System.out.println("Today the sun is out");  }

public static void main(String[] args) {
TheThread obj = new TheThread();
obj.start();
}
}