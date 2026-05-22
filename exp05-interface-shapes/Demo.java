import java.util.Scanner;

interfaceShape
{
voidinput(); void area();
}
class CircleimplementsShape
{
intr=0;
doublepi=3.14,ar=0;
 @Override
public void input()
{
r=5;
}
@Override
public void area()
{
ar = pi * r * r; System.out.println("Areaofcircle:"+ar);
}
}
class Rectangle extends Circle
{
intl=0,b=0; double ar;
public void input()
{
super.input(); l =6;
b=4;
 
}
public void area()
{
super.area();
ar=l*b;
System.out.println("Areaofrectangle:"+ar);
}
}
public class Demo
{
public static void main(String[]args)
{
Rectangleobj=newRectangle(); obj.input();
obj.area();
}
}
