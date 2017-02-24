class ThreadEx1 implements Runnable
{
public void run()
{
try
{
for(int j=5;j>0;j--)
{
System.out.println("Child Thread="+j);
Thread.sleep(1000);
}
}
catch(Exception ex)
{
System.out.println("Exception raised..."+ex);
}
}
}
class ThreadEx
{
public static void main(String args[])throws InterruptedException
{
ThreadEx1 ob=new ThreadEx1();
Thread t=new Thread(ob);
t.start();
System.out.println(t.isAlive());
t.join();
for(int i=0;i<5;i++)
{
System.out.println("Main Thread="+i);
Thread.sleep(2000);
}
//System.out.println(ob.t.isAlive());
}
}
