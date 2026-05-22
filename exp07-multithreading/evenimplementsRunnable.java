importjava.util.*;
classevenimplementsRunnable
{
public intx;publiceven(intx)
{
this.x= x;
}
publicvoidrun()
{
System.out.println("NewThread "+x+"isEVENand Squareof"+x+"is: "+x* x);
}
}
classoddimplementsRunnable
{
publicintx;publicodd(intx)


{
this.x= x;
}
publicvoidrun()
{
System.out.println("NewThread "+x+"isODDand Cube of"+x+"is: "+x* x*x);
}
}
 
class AextendsThread

{
publicvoidrun()
{
intnum=0;
Randomr=newRandom();try
{
for(inti= 0; i<5;i++)
{
num=r.nextInt(100);
System.out.println("MainThreadandGeneratedNumberis"+num);if(num%2==0)
{
Threadt1=newThread(neweven(num));t1.start();
}
else
{
Threadt2=newThread(newodd(num));t2.start();
}
Thread.sleep(1000); System.out.println("	");
}
}
catch(Exception ex)
{

System.out.println(ex.getMessage());
}
}
}
classmultithreadprog
{

publicstaticvoidmain(String[]args)
{
Aa=newA();a.start();
}
}