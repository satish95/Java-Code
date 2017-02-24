class VolatileEx extends Thread
{
private static int i=0;
public static void main(String args[])
{
VolatileEx ob1=new VolatileEx();
ob1.start();
for(int i=0;i<5;i++)
{
VolatileEx ob=new VolatileEx();
ob.start();
}
}
public void run()
{
i++;
System.out.println(i);
try
{
Thread.sleep(10000);
}
catch(InterruptedException ie)
{
ie.printStackTrace();
}
}
}