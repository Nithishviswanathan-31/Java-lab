importjava.util.Scanner; abstract class Shape {int a = 10, b = 2;
Shape(inta,intb){ this.a=a;
this.b=b;
}

abstractvoidPrintarea();

}

classRectangleextendsShape{ Rectangle(int a, int b) {

super(a,b);
}

voidPrintarea() {
 
System.out.println("areaofrectangleis"+(a* b));
}

}
classTriangleextendsShape{ Triangle(int a, int b) {
super(a,b);
}

voidPrintarea(){
System.out.println("areaoftriangleis"+(0.5 *a*b));
}

}
classCircleextendsShape{ Circle(int a, int b) {
super(a,b);
}

voidPrintarea() {
System.out.println("areaofcircleis"+(3.14 *a* a));
}

}

classZ{

publicstaticvoidmain(String[]args){ Shape shape=null;
Stringinput;
intwidth,height; while (true) {
Scannerscanner=new Scanner(System.in);
System.out.println("whichshape?circle/rectangle/triangle(writeanyotherthing forquitting):"); input = scanner.nextLine();
if(!"circle".equalsIgnoreCase(input)&&!"rectangle".equalsIgnoreCase(input)&&
!"triangle".equalsIgnoreCase(input)){ System.exit(0);
}
System.out.println("height:");
 
height=scanner.nextInt();

System.out.println("width:"); width = scanner.nextInt();

if("circle".equalsIgnoreCase(input)){ shape=new Circle(width, height);
}
elseif("rectangle".equalsIgnoreCase(input)){ shape=new Rectangle(width, height);
}
else{// ==triangle
shape=newTriangle(width,height);
}

shape.Printarea();

}

}

}
