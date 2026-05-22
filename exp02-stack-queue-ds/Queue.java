import java.util.*; 
publicclassQueue{ int SIZE =5;
intitems[]=newint[SIZE]; int front, rear;
Queue(){
front =-1;
rear=-1;
}
booleanisFull(){
if(front==0&&rear==SIZE-1){ 
return true;
}
returnfalse;
}
booleanisEmpty(){ if(front ==-1)
returntrue; else
returnfalse;
}
voidenQueue(intelement){ if(isFull()){
System.out.println("\nThequeueis full");
}
else{
if(front==-1){
front=0;
}
rear++;
items[rear]=element;
System.out.println("\nTheelement"+element +"is inserted");
}
}
intdeQueue(){ int element; if(isEmpty()){
System.out.println("\nThequeueisempty"); 
return(-1);
}
else{
element=items[front]; 
if(front >= rear){
front=-1;
rear=-1;
}
else{
} 
front++;
System.out.println("\nTheelement"+element+"isdeleted");
return(element);
}
}
voiddisplay(){ int i; if(isEmpty()){
System.out.println("Thequeueisempty");
}
else{
System.out.println("\nTheelementsofthequeueare:"); 
for(i = front; i <= rear; i++)
System.out.print(items[i]+"");
}
}
publicstaticvoidmain(String[]args){ 
Queue input_queue =new Queue(); 
for(int i =1; i <6; i ++){
input_queue.enQueue(i*100);
}
System.out.println("Thequeueisdefinedas:"+input_queue); input_queue.enQueue(6);
input_queue.display(); 
input_queue.deQueue(); 
input_queue.display();
}
}
