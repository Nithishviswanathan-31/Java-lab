import java.util.Scanner;
publicclassExceptionExample{
publicstaticvoid main(String args[]){ Scanner sc =newScanner(System.in);
System.out.println("Enterfirstnumber:"); int a = sc.nextInt();
System.out.println("Entersecondnumber:"); int b = sc.nextInt();
intc=a/b;
System.out.println("Theresultis:"+c);
}
}
BeforeInsertionSort 9143243115822
AfterInsertionSort 2 3 9
Enterfirstnumber:100
Entersecond number:0
Exceptioninthread"main" java.lang.ArithmeticException:/byzero
 atExceptionExample.main(ExceptionExample.java:10) Expno.6(b)user defined exception handling
publicStudent(Stringname,intage){ try{
if(age<17||age>24){
String msg ="Age is not between 17 and 24";
AgeDoesnotMatchExceptionex=newAgeDoesnotMatchException(msg); 
throw ex;
}
}
catch(AgeDoesnotMatchException e){ e.printStackTrace();
}
this.name=name; this.age = age;
}
publicvoiddisplay(){
System.out.println("NameoftheStudent:"+this.name); System.out.println("Age of the Student: "+this.age );
}
publicstaticvoid main(String args[]){ Scanner sc=newScanner(System.in);
System.out.println("EnterthenameoftheStudent:"); String name = sc.next();
System.out.println("EntertheageoftheStudent shouldbe17to 24 (including 17 and 24): ");
intage= sc.nextInt();
Studentobj=newStudent(name,age); obj.display();
}
}
publicStudent(Stringname,intage){ try{
if(age<17||age>24){
String msg ="Age is not between 17 and 24"; AgeDoesnotMatchExceptionex=newAgeDoesnotMatchException(msg); throw ex;
}
}
catch(AgeDoesnotMatchException e){ e.printStackTrace();
}
this.name=name; this.age = age;
}
publicvoiddisplay(){
System.out.println("NameoftheStudent:"+this.name);
System.out.println("AgeoftheStudent:"+this.age);
}
publicstaticvoid main(String args[]){ Scanner sc=newScanner(System.in);
System.out.println("EnterthenameoftheStudent:"); String name = sc.next();
System.out.println("EntertheageoftheStudent shouldbe17to 24 (including 17 and 24): ");
intage= sc.nextInt();
Studentobj=newStudent(name,age); obj.display();
}
}
