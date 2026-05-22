importjava.util.*;
publicclassStackDemo{
staticvoidshowpush(Stackst,inta){ st.push(new Integer(a));
System.out.println("push("+a+")"); 
System.out.println("stack: "+ st);
} 
static void showpop(Stack st){ System.out.print("pop ->"); 
Integer a =(Integer) st.pop(); 
System.out.println(a); System.out.println("stack:"+st);
}
publicstaticvoidmain(Stringargs[]){ 
Stack st = new Stack(); 
System.out.println("stack: "+ st);
showpush(st,42); showpush(st,66); 
showpush(st,99); 
showpop(st); 
showpop(st); 
showpop(st);
try{
showpop(st);
}
catch(EmptyStackException e){ 
System.out.println("emptystack");
}
}
}
