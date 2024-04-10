package org.example.multithreading;

class Work implements Runnable {

    @Override
    public void run() {
        System.out.println("Worker thread is starting...");
        for (int i = 1; i <= 10; i++) {
            if(i%2==0){
                System.out.println(i+" :this is even thread");
            }else{
                System.out.println(i+" :this is odd thread");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Worker thread is done.");
    }

}
 class Task extends Thread{
    @Override
  public  void run(){
        for(int i=10;i>0;i--){
            if(i%2==0){
                System.out.println(i+" :this is even thread from thraed class");
            }else{
                System.out.println(i+" :this is odd thread from thread class");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
 }
public class joinMethodMain {
    public static void main(String[] args) {
        Work w = new Work();
        Thread th = new Thread(w);
        Task t=new Task();
        Thread th1=new Thread(t);

        th.start();
        th1.start();
        try {
            th.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main thread is done");
    }
}
