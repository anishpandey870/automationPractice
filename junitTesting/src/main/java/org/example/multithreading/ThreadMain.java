package org.example.multithreading;

class MultiTest extends Thread{
   public void run(){
        try{
            System.out.println("Thread "+Thread.currentThread().getId()+" is running");
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
public class ThreadMain {
    public static void main(String[] args) {
      int n=8;
      for(int i=1;i<=n;i++){
          MultiTest multiTest=new MultiTest();
          multiTest.start();
      }
    }
}
