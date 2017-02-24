import java.util.concurrent.*;
class CyclicEx
{
public static void main(String args[])
{
CyclicBarrier ob=new CyclicBarrier(3,new Sound());
new Vehicle(ob,"Car");
new Vehicle(ob,"Bike");
new Vehicle(ob,"Truck");
}
}
class Vehicle extends Thread
{
CyclicBarrier ob;
String name;
Thread t;
Vehicle(CyclicBarrier ob,String name)
{
this.ob=ob;
this.name=name;
t=new Thread(this);
t.start();
}
public void run()
{
System.out.println(name);
try
{
ob.await();
}
catch(BrokenBarrierException|InterruptedException ex)
{
ex.printStackTrace();
}
}
}
class Sound implements Runnable
{
public void run()
{
System.out.println("Beep........Beep");
}
}
