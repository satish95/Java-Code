class SynThrdEx 
{
public void synexec()
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
class MyThread extends Thread
{
SynThrdEx st;
public MyThread(SynThrdEx st)
{
this.st=st;
}
public void run()
{
synchronized(st)
{
st.synexec();
}
}
}
class SynThrdDemo
{
public static void main(String args[])throws InterruptedException
{
SynThrdEx ob=new SynThrdEx();
MyThread m=new MyThread(ob);
m.start();
}
}
